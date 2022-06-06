package controllers;

import services.Impl.NvQuanLyImpl;
import services.Impl.NvSanXuatImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println("----Công ty ABC----");
            System.out.println("1. Nv Quản Lý");
            System.out.println("2. NV Sản Xuất");
            System.out.println("3. Thoát");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");
                ;
            }
            switch (choice) {
                case 1:
                    quanLy();
                    break;
                case 2:
                    sanXuat();
                    break;
                case 3:
                    System.exit(4);
            }
        }
    }

    public static void quanLy() {
        NvQuanLyImpl nvQuanLy = new NvQuanLyImpl();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println("----Nhân viên quản lý----");
            System.out.println("1. Hiển thị danh sách ");
            System.out.println("2. Thêm mới ");
            System.out.println("3. Xóa ");
            System.out.println("4. Tìm kiếm ");
            System.out.println("5. Exit menu");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");

            }
            switch (choice) {
                case 1:
                    nvQuanLy.display();
                    break;
                case 2:
                    nvQuanLy.add();
                    break;
                case 3:
                    nvQuanLy.delete();
                    break;
                case 4:
                    nvQuanLy.find();
                    break;
                case 5:
                    return;
            }
        }
    }

    public static void sanXuat() {
        NvSanXuatImpl nvSanXuat = new NvSanXuatImpl();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println("----Nhân viên sản xuất----");
            System.out.println("1. Hiển thị danh sách ");
            System.out.println("2. Thêm mới ");
            System.out.println("3. Xóa ");
            System.out.println("4. Tìm kiếm ");
            System.out.println("5. Exit menu");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");

            }
            switch (choice) {
                case 1:
                    nvSanXuat.display();
                    break;
                case 2:
                    nvSanXuat.add();
                    break;
                case 3:
                    nvSanXuat.delete();
                    break;
                case 4:
                    nvSanXuat.find();
                    break;
                case 5:
                    return;
            }
        }
    }
}

