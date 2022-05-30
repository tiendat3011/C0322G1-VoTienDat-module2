package case_study.utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexData {

    static Scanner scanner = new Scanner(System.in);

    public static String regexStr(String temp, String regex, String error) {

        boolean check = true;
        do {
            if (temp.matches(regex)) {
                check = false;
            } else {
                System.out.println(error);
                temp = scanner.nextLine();
            }
        } while (check);
        return temp;
    }

    public static String regexAge(String temp, String regex) {
        boolean check = true;
        while (check) {
            try {
                if (Pattern.matches(regex, temp)) {
                    //format lại về kiểu ngày tháng năm
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    //ép kiểu theo formatter
                    LocalDate age = LocalDate.parse(temp, formatter);
                    // lấy thời gian hiện tại
                    LocalDate now = LocalDate.now();
                    //lấy số năm chêm lệch giữa now với age
                    int current = Period.between(age, now).getYears();
                    if (current < 100 && current > 18) {
                        check = false;
                    } else {
                        throw new AgeException("Ngày sinh phải nhỏ hơn ngày hiện tại 18 năm, không được quá 100 tuổi ");
                    }
                } else {
                    throw new AgeException("Định dạng nhập sai ");
                }
            } catch (AgeException e) {
                System.out.println(e.getMessage());
                temp = scanner.nextLine();
            }
        }
        return temp;
    }
}


