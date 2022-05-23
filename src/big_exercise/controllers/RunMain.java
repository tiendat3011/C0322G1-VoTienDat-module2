package big_exercise.controllers;

import big_exercise.services.impl.ArrayImpl;
import big_exercise.services.impl.ArrayListImpl;
import big_exercise.services.impl.LinkedListImpl;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayImpl person = new ArrayImpl();
        ArrayListImpl person = new ArrayListImpl();
        LinkedListImpl person = new LinkedListImpl();
        while (true) {
            System.out.println(" Quản Lý Nhân viên  ");
            System.out.println("1: Nhân viên quản lý ");
            System.out.println("2: Nhân viên công nhật ");
            System.out.println("3: Nhân viên sản xuất ");
            System.out.println("4: Hiển thị tất cả ");
            System.out.println("5: Sắp xếp ");
            System.out.println("6: THoát ");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    person.displayQuanLy();
                    break;
                case "2":
                    person.displayCongNhat();
                    break;
                case "3":
                    person.displaySanXuat();
                    break;
                case "4":
                    person.display();
                case "5":
                    sapXep();
                case "6":
                    System.exit(6);
                default:
                    System.out.println("Nhập từ 1-4");
            }
        }
    }

    private static void sapXep() {
        ArrayImpl sapXep = new ArrayImpl();
        ArrayListImpl sapXep = new ArrayListImpl();
        LinkedListImpl sapXep = new LinkedListImpl();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(" Sắp xếp  ");
            System.out.println("1: Sắp xếp tăng theo lương ");
            System.out.println("2: Sắp xếp tăng theo tên ");
            System.out.println("3: Back Menu ");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    sapXep.sapXepLuongTang();
                    break;
                case "2":
                    sapXep.sapXepTenTang();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Nhập từ 1-4");
            }
        }
    }
}