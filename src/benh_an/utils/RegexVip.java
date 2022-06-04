package benh_an.utils;

import benh_an.models.BenhAnVip;

import java.util.List;
import java.util.Scanner;

public class RegexVip {
    public static Scanner scanner = new Scanner(System.in);
    public static String idBenhAn = "BA\\-[0-9]{3}";
    public static String idBenhNhan = "BN\\-[0-9]{3}";

    public static String idBenhAn(List<BenhAnVip> benhAnVipList) {
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

            for (BenhAnVip emp : benhAnVipList) {
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
    public static String IdBenhNhan(List<BenhAnVip> benhAnVipList) {
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

            for (BenhAnVip emp : benhAnVipList) {
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
