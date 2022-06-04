package case_study.utils;

import case_study.models.person.Customer;
import case_study.utils.exception.AgeException;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CustomerRegex {
    public static Scanner scanner = new Scanner(System.in);
    public static String idRegex = "CUS\\-[0-9]{4}";
    public static String BIRTHDAY = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)" +
            "(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)" +
            "0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))" +
            "$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";


    //    public static void dateTimeCheck(String dateOfBirth) throws Exception {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
//        LocalDate localDate1 = LocalDate.parse(dateOfBirth, formatter);
//        LocalDate localDate2 = LocalDate.now();
//        localDate2.format(formatter);
//
//        int year = Period.between(localDate1, localDate2).getYears();
//        if (year < 18 || year > 100) {
//            throw new DateTimeException("Error");
//        }
//    }
//
//    public static String dateOfBirth() {
//        String dateOfBirth;
//        while (true) {
//            try {
//                dateOfBirth = scanner.nextLine();
//                dateTimeCheck(dateOfBirth);
//                break;
//            } catch (DateTimeException e) {
//                System.err.println("tuổi lớn hơn 18 và bé hơn 100");
//            } catch (Exception ignored) {
//                System.err.println("Nhập sai định dạng");
//            }
//        }
//        return dateOfBirth;
//    }
    public static String dateOfBirth(String dateOfBirth, String regex) {
        boolean check = true;
        while (check) {
            try {
                if (Pattern.matches(regex, dateOfBirth)) {
                    //format lại về kiểu ngày tháng năm
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    //ép kiểu theo formatter
                    LocalDate age = LocalDate.parse(dateOfBirth, formatter);
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
//            dateOfBirth = scanner.nextLine();
            }
        }
        return dateOfBirth;
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

    public static String customerType() {
        String customerType = "";
        boolean check = true;
        while (check) {
            System.out.println("--------Menu--------");
            System.out.println("1. Gold");
            System.out.println("2. Silver");
            System.out.println("3. Member");
            System.out.println("4. Platinum");
            System.out.println("5. Diamond");
            System.out.println("Chọn 1->5");
            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Nhập sai");
                ;
            }
            switch (choice) {
                case 1:
                    customerType = "Gold";
                    check = false;
                    break;
                case 2:
                    customerType = "Silver";
                    check = false;
                    break;
                case 3:
                    customerType = "Member";
                    check = false;
                    break;
                case 4:
                    customerType = "Platinum";
                    check = false;
                    break;
                case 5:
                    customerType = "Diamond";
                    check = false;
                    break;
                default:
                    check = true;
            }
        }
        return customerType;
    }

    public static String idRegex(List<Customer> customerList) {
        String id;
        boolean check = true;
        while (check) {
            check = false;
            while (true) {
                id = scanner.nextLine();
                if (id.matches(idRegex)) {
                    break;
                } else {
                    System.err.println("Nhập sai vd CUS-XXXX");
                }
            }

            for (Customer emp : customerList) {
                if (emp.getIdCustomerNumber().equals(id)) {
                    check = true;
                    break;
                }
            }
            if (check) {
                System.out.println("ID đã cso trong danh sách");
            } else {
                return id;
            }
        }
        return "";
    }
}
