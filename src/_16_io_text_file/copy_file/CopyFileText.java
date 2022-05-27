package _16_io_text_file.copy_file;

import java.util.List;

public class CopyFileText {
    public static void main(String[] args) {
        try {
//            List<String> list = new ArrayList<>();
            List<String> stringList = ReadAndWriteFile.read("src\\_16_io_text_file\\copy_file\\SourceFile.txt");
//            for (String item: stringList) {
////                String str = "";
////                for(String it : item) {
////                    str += it + ",";
////                }
////                list.add(str);
//                System.out.println(item);
//            }
            ReadAndWriteFile.write("src\\_16_io_text_file\\copy_file\\TargetFile.txt", stringList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}