package _16_io_text_file.copy_file;

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

        try (FileOutputStream fileWriter = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileWriter)) {
            for (String item: stringList){
                objectOutputStream.write(Integer.parseInt(item));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> read(String path) {
        List<String> list = new ArrayList<>();
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try (FileInputStream fileReader = new FileInputStream(file);
             //Câu lệnh try-with-resources là câu lệnh try dùng để khai báo một hoặc nhiều tài nguyên.
             // Một tài nguyên là một đối tượng trong đó phải được đóng sau khi chương trình kết thúc với nó.
             // Câu lệnh try -with-resources đảm bảo rằng mỗi tài nguyên sẽ được đóng ngay khi kết thúc câu lệnh.
             ObjectInputStream bufferedReader = new ObjectInputStream(fileReader)) {
            String line = "";
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                list.add(line);
            }
            return list;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
