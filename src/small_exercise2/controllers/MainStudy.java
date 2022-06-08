package small_exercise2.controllers;

import small_exercise2.services.impl.StudentImpl;
import small_exercise2.services.impl.TeacherImpl;

import java.util.Scanner;

public class MainStudy {
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println("----QUẢN LÝ----");
            System.out.println("1. Học sinh");
            System.out.println("2. Giáo viên");
            System.out.println("3. Thoát");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");
            }
            switch (choice) {
                case 1:
                    hocSinh();
                    break;
                case 2:
                    giaoVien();
                    break;
                case 3:
                    System.exit(3);
            }
        }
    }

    public static void hocSinh() {
        StudentImpl student = new StudentImpl();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println("----Hoc Sinh----");
            System.out.println("1. Hiển thị danh sách ");
            System.out.println("2. Thêm mới ");
            System.out.println("3. Xóa ");
            System.out.println("4. Sắp xếp ");
            System.out.println("5. Chỉnh sửa ");
            System.out.println("6. Exit menu");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");
            }
            switch (choice) {
                case 1:
                    student.display();
                    break;
                case 2:
                    student.add();
                    break;
                case 3:
                    student.delete();
                    break;
                case 4:
                    sapXepHocSinh();
                    break;
                case 5:
                    student.edit();
                case 6:
                    return;
            }
        }
    }

    private static void sapXepHocSinh() {
        StudentImpl student = new StudentImpl();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println("----Sap xep hoc sinh----");
            System.out.println("1. Theo Ten ");
            System.out.println("2. Theo ngay sinh ");
            System.out.println("3. Exit menu");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");
            }
            switch (choice) {
                case 1:
                    student.shortByName();
                    break;
                case 2:
                    student.shortByBirthDay();
                    break;
                case 3:
                    return;
            }
        }
    }

    public static void giaoVien() {
        TeacherImpl teacher = new TeacherImpl();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println("----Giao vien----");
            System.out.println("1. Hiển thị danh sách ");
            System.out.println("2. Thêm mới ");
            System.out.println("3. Xóa ");
            System.out.println("4. Sắp xếp ");
            System.out.println("5. Chỉnh sửa ");
            System.out.println("6. Exit menu");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");
            }
            switch (choice) {
                case 1:
                    teacher.display();
                    break;
                case 2:
                    teacher.add();
                    break;
                case 3:
                    teacher.delete();
                    break;
                case 4:
                    sapXepGiaoVien();
                    break;
                case 5:
                    teacher.edit();
                    break;
                case 6:
                    return;
            }
        }
    }

    private static void sapXepGiaoVien() {
        TeacherImpl teacher = new TeacherImpl();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println("----Sap xep giao vien----");
            System.out.println("1. Theo Ten ");
            System.out.println("2. Theo ngay sinh ");
            System.out.println("3. Exit menu");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");
            }
            switch (choice) {
                case 1:
                    teacher.shortByName();
                    break;
                case 2:
                    teacher.shortByBirthDay();
                    break;
                case 3:
                    return;
            }
        }
    }
}