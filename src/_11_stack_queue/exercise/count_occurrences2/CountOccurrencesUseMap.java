package _11_stack_queue.exercise.count_occurrences2;

import java.util.Scanner;
import java.util.TreeMap;

public class CountOccurrencesUseMap {
    //TreeMap lưu trữ dữ liệu dưới dạng cặp key và value.
    //Nó chứa các key duy nhất.
    //Nó KHÔNG cho phép bất kỳ key nào là null
    //Nó duy trì các phần tử được thêm vào theo thứ tự key tăng dần.
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();//TreeMap lưu trữ dữ liệu dưới dạng cặp key và value.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi ");
        String string = scanner.nextLine().toLowerCase();
        String[] newString = string.split(" ");
        int count = 1;
        for (int i = 0; i < newString.length; i++) {
            if (treeMap.containsKey(newString[i])) {// containsKey() dùng để kiểm tra một Key có tồn tại trong Map hay không.
                treeMap.put(newString[i], treeMap.get(newString[i]) + 1); // duyệt xem đã có trong mảng treemap chưa nếu có
                                                                            // thì tăng giá trị lên . get key>trả về gt value
            } else {
                treeMap.put(newString[i], 1); // chưa thì gán 1
            }
        }
        System.out.println(treeMap);
    }
}