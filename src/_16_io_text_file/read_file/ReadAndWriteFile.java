package _16_io_text_file.read_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static void write(String path, List<String> stringList) {
        File file = new File(path);
        if (!file.exists()) {// check gile toon taji trong java
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (FileWriter fileWriter = new FileWriter(file); // class rien khai
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {// tao bo nho dem
            for (String item : stringList) {
                bufferedWriter.write(item);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String[]> read(String path) {
        List<String[]> list = new ArrayList<>();
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = "";
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {// đọc từng dòng cho đến hết.
                String[] arr = line.split(",");// tách những phần tử trong mảng và trả về một mảng các chuỗi con cách nhau bởi dấu ,
                list.add(arr);
            }
            return list;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
