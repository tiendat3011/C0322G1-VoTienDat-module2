package utils;

import models.NvQuanLy;
import models.NvSanXuat;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.List;
import java.util.Scanner;

public class Regex {
    public static Scanner scanner = new Scanner(System.in);
    public static String idRegexQl = "QL\\-[0-9]{4}";
    public static String idRegexSx = "SX\\-[0-9]{4}";


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

    public static String idRegexQl(List<NvQuanLy> nvQuanLyList) {
        String idNvQl;
        boolean check = true;
        while (check) {
            check = false;
            while (true) {

                idNvQl = scanner.nextLine();
                if (idNvQl.matches(idRegexQl)) {
                    break;
                } else {
                    System.err.println("Nhập lại vD :  QL-XXXX");
                }
            }

            for (NvQuanLy quanLy : nvQuanLyList) {
                if (quanLy.getIdNv().equals(idNvQl)) {
                    check = true;
                    break;
                }
            }
            if (check) {
                System.out.println("mã nhân viên đã có trong list");
            } else {
                return idNvQl;
            }
        }
        return "";
    }
    public static String idRegexSx(List<NvSanXuat> nvSanXuatList) {
        String idNvSx;
        boolean check = true;
        while (check) {
            check = false;
            while (true) {

                idNvSx = scanner.nextLine();
                if (idNvSx.matches(idRegexSx)) {
                    break;
                } else {
                    System.err.println("Nhập lại vD :  SX-XXXX");
                }
            }

            for (NvSanXuat sanXuat : nvSanXuatList) {
                if (sanXuat.getIdNv().equals(idNvSx)) {
                    check = true;
                    break;
                }
            }
            if (check) {
                System.out.println("mã nhân viên đã có trong list");
            } else {
                return idNvSx;
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
    public static int heSoLuong() {
        int heSoLuong;
        while (true) {
            try {
                heSoLuong = Integer.parseInt(scanner.nextLine());
                return heSoLuong;
            } catch (NumberFormatException e) {
                System.err.println("NHập sai định dạng");
            }
        }
    }
    public static int soSp() {
        int soSp;
        while (true) {
            try {
                soSp = Integer.parseInt(scanner.nextLine());
                return soSp;
            } catch (NumberFormatException e) {
                System.err.println("NHập sai định dạng");
            }
        }
    }
    public static int giaSP() {
        int giaSP;
        while (true) {
            try {
                giaSP = Integer.parseInt(scanner.nextLine());
                return giaSP;
            } catch (NumberFormatException e) {
                System.err.println("NHập sai định dạng");
            }
        }
    }
}
