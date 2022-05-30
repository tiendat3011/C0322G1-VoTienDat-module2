package _17_binary_file_serialization.copy_binary_file;

import java.io.*;
import java.util.List;

public class CopyFileBinary {

    public static void main(String[] args) throws IOException {
        InputStream inStream = null;
        OutputStream outStream = null;

        try {
            inStream = new FileInputStream(new File("src\\_17_binary_file_serialization\\copy_binary_file\\ListProductt.txt"));
            outStream = new FileOutputStream(new File("src\\_17_binary_file_serialization\\copy_binary_file\\2.txt"));

            int length;
            byte[] buffer = new byte[1024];

            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inStream.close();
            outStream.close();
        }
    }
}