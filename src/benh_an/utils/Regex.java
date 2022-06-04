package benh_an.utils;

import benh_an.models.BenhAnThuong;

import java.util.List;
import java.util.Scanner;

public class Regex {
    public static Scanner scanner = new Scanner(System.in);
    public static String idBenhAn = "BA\\-[0-9]{3}";
    public static String idBenhNhan = "BN\\-[0-9]{3}";

    public static String vip() {
        String vip = "";
        boolean checkVip = true;
        while (checkVip) {
            int choice = 0;
            System.out.println("--------Vip--------");
            System.out.println("1. Vip1");
            System.out.println("2. Vip2");
            System.out.println("2. Vip3");
            System.out.println("Chọn 1>3");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng");
            }
            switch (choice) {
                case 1:
                    vip = "Vip1";
                    checkVip = false;
                    break;
                case 2:
                    vip = "Vip2";
                    checkVip = false;
                    break;
                case 3:
                    vip = "Vip3";
                    checkVip = false;
                    break;
            }
        }
        return vip;
    }

    public static String IdBenhAn(List<BenhAnThuong> benhAnThuongList) {
        String id;
        boolean check = true;
        while (check) {
            check = false;
            while (true) {

                id = scanner.nextLine();
                if (id.matches(idBenhAn)) {
                    break;
                } else {
                    System.err.println("Nhập lại vD : BA-XXX");
                }
            }

            for (BenhAnThuong emp : benhAnThuongList) {
                if (emp.getIdBenhAn().equals(id)) {
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

    public static String IdBenhNhan(List<BenhAnThuong> benhAnThuongList) {
        String id;
        boolean check = true;
        while (check) {
            check = false;
            while (true) {

                id = scanner.nextLine();
                if (id.matches(idBenhNhan)) {
                    break;
                } else {
                    System.err.println("Nhập lại vD : BN-XXX");
                }
            }

            for (BenhAnThuong emp : benhAnThuongList) {
                if (emp.getIdBenhAn().equals(id)) {
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
