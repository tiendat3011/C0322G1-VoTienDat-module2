package case_study.services.regex;

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
                System.err.println("This age of customer can't booking");
            } catch (Exception ignored) {
                System.err.println("Input wrong format");
            }
        }
        return dateOfBirth;
    }

    public static String level() {
        String level = "";
        boolean checkLevel = true;
        while (checkLevel) {
            int choice = 0;
            System.out.println("--------Menu--------");
            System.out.println("1. Trung c?p");
            System.out.println("2. Cao ??ng");
            System.out.println("3. ??i H?c");
            System.out.println("4. Sau ??i h?c");
            System.out.println("Ch?n 1>4");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Nh?p sai ??nh d?ng");
                ;
            }
            switch (choice) {
                case 1:
                    level = "Trung c?p";
                    checkLevel = false;
                    break;
                case 2:
                    level = "Cao ??ng";
                    checkLevel = false;
                    break;
                case 3:
                    level = "??i H?c";
                    checkLevel = false;
                    break;
                case 4:
                    level = "Sau ??i h?c";
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
            System.out.println("1. L? t�n");
            System.out.println("2. Ph?c v?");
            System.out.println("3. Chuy�n vi�n");
            System.out.println("4. Gi�m s�t");
            System.out.println("5. Qu?n l�");
            System.out.println("6. Gi�m ??c");
            System.out.println("Input your choice");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");
                ;
            }
            switch (choice) {
                case 1:
                    position = "L? t�n";
                    checkPosition = false;
                    break;
                case 2:
                    position = "Ph?c v?";
                    checkPosition = false;
                    break;
                case 3:
                    position = "Chuy�n vi�n";
                    checkPosition = false;
                    break;
                case 4:
                    position = "Gi�m s�t";
                    checkPosition = false;
                    break;
                case 5:
                    position = "Qu?n l�";
                    checkPosition = false;
                    break;
                case 6:
                    position = "Gi�m ??c";
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
                System.err.println("Input wrong format");
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
                    System.err.println("Nh?p sai ??nh d?ng v� d? EPO-XXXX");
                }
            }

            for (Employee emp : employeeLists) {
                if (emp.getIdEmployeeNumber().equals(id)) {
                    check = true;
                    break;
                }
            }
            if (check) {
                System.out.println("Your is already in list");
            } else {
                return id;
            }
        }
        return "";
    }
}

