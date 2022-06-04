package benh_an.services.impl;

import benh_an.models.BenhAnVip;
import benh_an.services.Services;
import benh_an.utils.ReadAndWriteFile;
import benh_an.utils.Regex;
import benh_an.utils.RegexVip;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BenhAnVipImpl implements Services {
    public static Scanner scanner = new Scanner(System.in);
    public static List<BenhAnVip> benhAnVipList;

    public static List<BenhAnVip> getBenhAnVipList() {
        List<BenhAnVip> benhAnVipList = new ArrayList<>();
        List<String[]> listStr = ReadAndWriteFile.read("src\\benh_an\\data\\medical_vip_records.csv");
        for (String[] item : listStr) {
            benhAnVipList.add(new BenhAnVip(
                    item[0],
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    item[5],
                    item[6],
                    item[7]));
        }
        return benhAnVipList;
    }

    @Override
    public void display() {
        benhAnVipList = getBenhAnVipList();
        for (BenhAnVip item : benhAnVipList) {
            System.out.println(item);
        }
    }

    @Override
    public void addNew() {
        benhAnVipList = getBenhAnVipList();
        System.out.println("nhập Mã bệnh án");
        String idBenhAn = RegexVip.idBenhAn(benhAnVipList);

        System.out.println("nhập Mã bệnh nhân");
        String idBenhNhan = RegexVip.IdBenhNhan(benhAnVipList);

        System.out.println("nhâp tên");
        String name = scanner.nextLine();

        System.out.println("nhâp ngày nhập viện");
        String dayStart = scanner.nextLine();

        System.out.println("nhâp ngày ra viện");
        String dayEnd = scanner.nextLine();

        System.out.println(" lý do  nhập viện");
        String reason = scanner.nextLine();

//        System.out.println("Vip");
        String vip = Regex.vip();

        System.out.println(" Thời hạn Vip");
        String dateVip = scanner.nextLine();


        benhAnVipList.add(new BenhAnVip(idBenhAn, idBenhNhan, name, dayStart, dayEnd, reason, vip,dateVip));
        updateFile(benhAnVipList);
        System.out.println("Đã thêm thành công");

    }

    @Override
    public void delete() {
        benhAnVipList = getBenhAnVipList();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập id bệnh án muốn xóa : ");
        int id = sc.nextInt();
        boolean flag = false;
        if (benhAnVipList.isEmpty()) {
            System.out.println("Không có để xoá");
        } else {
            for (BenhAnVip item : benhAnVipList) {
                if (item.getIdBenhAn().equals(id)) {
                    System.out.println("Bạn có muốn xóa (Y/N)");
                    String confirm = scanner.nextLine();
                    if ("Y".equals(confirm.toUpperCase())) {
                        benhAnVipList.remove(item);
                    } else if ("N".equals(confirm.toUpperCase())) {
                        break;
                    }
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("Không có thông tin trong danh sách");
            }
        }
        if (flag) {
            updateFile(benhAnVipList);
        }
    }

    @Override
    public void find() {

    }

    public static void updateFile(List<BenhAnVip> benhAnVipList) {
        List<String> stringList = new ArrayList<>();
        for (BenhAnVip item : benhAnVipList) {
            stringList.add(item.getLine());
        }
        homework.utils.ReadAndWriteFile.write("src\\benh_an\\data\\medical_vip_records.csv", stringList);
    }
}
