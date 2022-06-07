package small_exercise2.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static void write(String path, List<String> stringList) {
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (FileWriter fileWriter = new FileWriter(file,false);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (String item: stringList){
                bufferedWriter.write(item);
                bufferedWriter.newLine();
//                bufferedWriter.close();
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
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] arr = line.split(",");
                list.add(arr);
//                bufferedReader.close();
            }
            return list;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
