package small_exercise2.utils;

import small_exercise2.models.Student;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.List;
import java.util.Scanner;

public class Regex {
    public static Scanner scanner = new Scanner(System.in);
    public static String idRegexSV = "[0-9]{8}";

    public static void dateTimeCheck(String dateOfBirth) throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
        LocalDate localDate1 = LocalDate.parse(dateOfBirth, formatter);
        LocalDate localDate2 = LocalDate.now();
        localDate2.format(formatter);

        int year = Period.between(localDate1, localDate2).getYears();
        if (year <= 18) {
            throw new DateTimeException("Error");
        }
    }

    public static String dateOfBirth() {
        String dateOfBirth;
        while (true) {
            try {
                dateOfBirth = scanner.nextLine();
                dateTimeCheck(dateOfBirth);
                break;
            } catch (DateTimeException e) {
                System.err.println("tuổi lớn hơn hoặc bằng 18 ");
            } catch (Exception ignored) {
                System.err.println("Nhập sai định dạng");
            }
        }
        return dateOfBirth;
    }

    public static String idRegexSV(List<Student> studentList) {
        String idNvSv;
        boolean check = true;
        while (check) {
            check = false;
            while (true) {

                idNvSv = scanner.nextLine();
                if (idNvSv.matches(idRegexSV)) {
                    break;
                } else {
                    System.err.println("Nhập lại ma~ sv co 8 so");
                }
            }

            for (Student item : studentList) {
                if (item.getIdSV().equals(idNvSv)) {
                    check = true;
                    break;
                }
            }
            if (check) {
                System.out.println("mã nhân viên đã có trong list");
            } else {
                return idNvSv;
            }
        }
        return "";
    }

    public static int luong() {
        int luong;
        while (true) {
            try {
                luong = Integer.parseInt(scanner.nextLine());
                return luong;
            } catch (NumberFormatException e) {
                System.err.println("NHập sai định dạng");
            }
        }
    }
    public static double diemTb(){
        double diemTb;
        while (true){
            try{
                diemTb = Double.parseDouble(scanner.nextLine());
                if (diemTb<10||diemTb>0){
                    return diemTb;
                }
            }catch (NumberFormatException e){
                System.err.println("NHập sai định dạng");

            }
        }
    }
    public static int soGioDay() {
        int soGioDay;
        while (true) {
            try {
                soGioDay = Integer.parseInt(scanner.nextLine());
                return soGioDay;
            } catch (NumberFormatException e) {
                System.err.println("NHập sai định dạng");
            }
        }
    }
    public static String gender() {
        String gender = "";
        boolean checkGender = true;
        while (checkGender) {
            int choice = 0;
            System.out.println("--------Giới tính--------");
            System.out.println("1. Nam");
            System.out.println("2. Nữ");
            System.out.println("Chọn 1>2");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng");
            }
            switch (choice) {
                case 1:
                    gender = "Nam";
                    checkGender = false;
                    break;
                case 2:
                    gender = "Nữ";
                    checkGender = false;
                    break;
            }
        }
        return gender;
    }
}
