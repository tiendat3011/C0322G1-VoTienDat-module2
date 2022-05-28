package _17_binary_file_serialization.copy_binary_file;

import java.io.*;
import java.util.List;

public class CopyFileBinary {
    public static class ReadAndWriteProduct {
        public static void write(String path, Object obj) {

            File file = new File(path);
            FileOutputStream fileOutputStream = null;
            ObjectOutputStream objectOutputStream = null;

            try {
                fileOutputStream = new FileOutputStream(path);
                objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(obj);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        public static Object read(String path) {

            File file = new File(path);
            FileInputStream fileInputStream = null;
            ObjectInputStream objectInputStream = null;
            Object object = null;

            try {
                fileInputStream = new FileInputStream(file);
                objectInputStream = new ObjectInputStream(fileInputStream);
                object = objectInputStream.readObject();
                return object;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                try {
                    fileInputStream.close();
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }
    }
        public static void main(String[] args) {
        try {
            List<String> stringList = (List<String>) ReadAndWriteProduct.read("src\\_17_binary_file_serialization\\copy_binary_file\\1.txt");
            ReadAndWriteProduct.write("src\\_17_binary_file_serialization\\copy_binary_file\\2.txt", stringList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

