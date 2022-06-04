package benh_an.controllers;

import benh_an.services.impl.BenhAnThuongImpl;
import benh_an.services.impl.BenhAnVipImpl;
import homework.services.impl.StudentImpl;
import homework.services.impl.TeacherImpl;

import java.util.Scanner;

public class MainBA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println(" CHƯƠNG TRÌNH QUẢN LÝ BỆNH ÁN ");
            System.out.println("1: Bênh án thường ");
            System.out.println("2: Bệnh án vip ");
            System.out.println("3: Exit ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");
            }
            switch (choice) {
                case 1:
                    normal();
                    break;
                case 2:
                    vip();
                    break;
                case 3:
                    System.exit(3);
                default:
                    System.out.println("Nhập không hợp lệ, cần nhập lại từ 1 tới 3");
            }
        }
    }

    private static void normal() {
        BenhAnThuongImpl benhAnThuong = new BenhAnThuongImpl();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println(" Bệnh án thường  ");
            System.out.println("1: Add new ");
            System.out.println("2: Delete ");
            System.out.println("3: Display ");
            System.out.println("4: Find ");
            System.out.println("5: Exit Menu ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");
            }
            switch (choice) {
                case 1:
                    benhAnThuong.addNew();
                    break;
                case 2:
                    benhAnThuong.delete();
                    break;
                case 3:
                    benhAnThuong.display();
                    break;
                case 4:
                    benhAnThuong.find();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Nhập không hợp lệ, cần nhập lại từ 1 tới 5");
            }
        }
    }

    private static void vip() {
        BenhAnVipImpl benhAnVip = new BenhAnVipImpl();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println(" Bệnh án vip  ");
            System.out.println("1: Add new ");
            System.out.println("2: Delete ");
            System.out.println("3: Display ");
            System.out.println("4: Find ");
            System.out.println("5: Exit Menu ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");
            }
            switch (choice) {
                case 1:
                    benhAnVip.addNew();
                    break;
                case 2:
                    benhAnVip.delete();
                    break;
                case 3:
                    benhAnVip.display();
                    break;
                case 4:
                    benhAnVip.find();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Nhập không hợp lệ, cần nhập lại từ 1 tới 5");
            }
        }
    }
}