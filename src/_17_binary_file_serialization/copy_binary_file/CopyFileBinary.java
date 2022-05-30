package _17_binary_file_serialization.copy_binary_file;

import java.util.List;

public class CopyFileBinary {

    public static void main(String[] args) {
        try {
            List<Object> stringList = (List<Object>) ReadAndWrite.read("src\\_17_binary_file_serialization\\product_manager_save_binary_file\\ListProductt.txt");
            ReadAndWrite.write("src\\_17_binary_file_serialization\\copy_binary_file\\2.txt", stringList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

