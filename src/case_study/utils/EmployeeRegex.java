package case_study.utils;

import case_study.models.person.Employee;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.List;
import java.util.Scanner;

public class EmployeeRegex {
    public static Scanner scanner = new Scanner(System.in);
    public static String idRegex = "EPO\\-[0-9]{4}";

    public static void dateTimeCheck(String dateOfBirth) throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
        LocalDate localDate1 = LocalDate.parse(dateOfBirth, formatter);
        LocalDate localDate2 = LocalDate.now();
        localDate2.format(formatter);

        int year = Period.between(localDate1, localDate2).getYears();
        if (year < 18 || year > 100) {
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
                System.err.println("Độ tuổi này k cần booking");
            } catch (Exception ignored) {
                System.err.println("Nhập sai định dạng");
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

    public static String level() {
        String level = "";
        boolean checkLevel = true;
        while (checkLevel) {
            int choice = 0;
            System.out.println("--------Menu--------");
            System.out.println("1. Trung cấp");
            System.out.println("2. Cao đẳng");
            System.out.println("3. Đại học");
            System.out.println("4. Sau đại học");
            System.out.println("Chọn 1>4");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Nhập sai định dạng");
            }
            switch (choice) {
                case 1:
                    level = "Trung cấp";
                    checkLevel = false;
                    break;
                case 2:
                    level = "Cao Đẳng";
                    checkLevel = false;
                    break;
                case 3:
                    level = "Đại Học";
                    checkLevel = false;
                    break;
                case 4:
                    level = "Sau Đại học";
                    checkLevel = false;
                    break;
                default:
                    checkLevel = true;
            }
        }
        return level;
    }

    public static String position() {
        String position = "";
        boolean checkPosition = true;
        int choice = 0;
        while (checkPosition) {
            System.out.println("--------Menu--------");
            System.out.println("1. Lễ tân");
            System.out.println("2. Phục v?");
            System.out.println("3. Chuyên viên");
            System.out.println("4. Giám sát");
            System.out.println("5. Quản lý");
            System.out.println("6. Giám đốc");
            System.out.println("CHọn 1>4");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Nhập sai định dạng");
                ;
            }
            switch (choice) {
                case 1:
                    position = "Lễ tân";
                    checkPosition = false;
                    break;
                case 2:
                    position = "Phục vụ";
                    checkPosition = false;
                    break;
                case 3:
                    position = "Chuyên viên";
                    checkPosition = false;
                    break;
                case 4:
                    position = "Giám sát";
                    checkPosition = false;
                    break;
                case 5:
                    position = "Quản lý";
                    checkPosition = false;
                    break;
                case 6:
                    position = "Giám Đốc";
                    checkPosition = false;
                    break;
                default:
                    checkPosition = true;
            }
        }
        return position;
    }

    public static int salary() {
        int salary;
        while (true) {
            try {
                salary = Integer.parseInt(scanner.nextLine());
                return salary;
            } catch (NumberFormatException e) {
                System.err.println("NHập sai định dạng");
                ;
            }
        }
    }

    public static String idRegex(List<Employee> employeeLists) {
        String id;
        boolean check = true;
        while (check) {
            check = false;
            while (true) {
                id = scanner.nextLine();
                if (id.matches(idRegex)) {
                    break;
                } else {
                    System.err.println("Nhập lại vD :  EPO-XXXX");
                }
            }

            for (Employee emp : employeeLists) {
                if (emp.getIdEmployeeNumber().equals(id)) {
                    check = true;
                    break;
                }
            }
            if (check) {
                System.out.println("ID đã có trong list");
            } else {
                return id;
            }
        }
        return "";
    }
}

