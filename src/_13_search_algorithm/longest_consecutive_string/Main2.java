package _13_search_algorithm.longest_consecutive_string;

import java.util.LinkedList;
import java.util.Scanner;

public class Main2 {
    //[Optional] [Bài tập] Tìm chuỗi liên tiếp có độ dài lớn nhất
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        System.out.print("Nhập chuỗi: ");//abc abcdg abxy

        String string = input.nextLine();

        // Tìm chuỗi liên tiếp có độ dài lớn nhất
        for (int i = 0; i < string.length(); i++) {        //1 Vòng lặp
            if (list.size() > 1 && string.charAt(i) <= list.getLast() && list.contains(string.charAt(i))) {
                //get last trả về pt cuối cùng. và contain để kt kí tự đó đã có trong list chưa
                //Kiểm tra kí tự tiếp theo có lớn hơn kí tự cuối cùng trong list hay không
                //Nếu có thì thêm vào trong list
                list.clear();
            }
            list.add(string.charAt(i));
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }
        // Hiển thị chuỗi liên tiếp dài nhất
        for (Character ch : max) { // 1 vòng lặp
            System.out.print(ch); // 1 câu lệnh
        }
        System.out.println();
    }
}
