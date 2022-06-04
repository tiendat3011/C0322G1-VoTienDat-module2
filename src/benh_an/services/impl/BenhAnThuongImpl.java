package benh_an.services.impl;

import benh_an.models.BenhAnThuong;
import benh_an.services.Services;
import benh_an.utils.ReadAndWriteFile;
import benh_an.utils.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BenhAnThuongImpl implements Services {
    public static Scanner scanner = new Scanner(System.in);
    public static List<BenhAnThuong> benhAnThuongList;
    public static List<BenhAnThuong> getBenhAnThuongList() {
        List<BenhAnThuong> benhAnThuongList = new ArrayList<>();
        List<String[]> listStr = ReadAndWriteFile.read("src\\benh_an\\data\\medical_records.csv");
        for (String[] item : listStr) {
            benhAnThuongList.add(new BenhAnThuong(
                    item[0],
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    item[5],
                    Integer.parseInt(item[6])));
        }
        return benhAnThuongList;
    }

    @Override
    public void display() {
        benhAnThuongList = getBenhAnThuongList();
        for (BenhAnThuong item : benhAnThuongList) {
            System.out.println(item);
        }
    }

    @Override
    public void addNew() {
        benhAnThuongList = getBenhAnThuongList();
        System.out.println("nhập Mã bệnh án");
        String idBenhAn = Regex.IdBenhAn(benhAnThuongList);

        System.out.println("nhập Mã bệnh nhân");
        String idBenhNhan =Regex.IdBenhNhan(benhAnThuongList);

        System.out.println("nhâp tên");
        String name = scanner.nextLine();

        System.out.println("nhâp ngày nhập viện");
        String dayStart = scanner.nextLine();

        System.out.println("nhâp ngày ra viện");
        String dayEnd = scanner.nextLine();

        System.out.println(" lý do  nhập viện");
        String reason = scanner.nextLine();

        System.out.println(" Phí nằm viện");
        int cost = Integer.parseInt(scanner.nextLine());

        benhAnThuongList.add(new BenhAnThuong(idBenhAn, idBenhNhan, name, dayStart, dayEnd, reason, cost));
        updateFile(benhAnThuongList);
        System.out.println("Đã thêm thành công");

    }

    @Override
    public void delete() {
        benhAnThuongList = getBenhAnThuongList();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập id bệnh án muốn xóa : ");
        int id = sc.nextInt();
        boolean flag = false;
        if (benhAnThuongList.isEmpty()) {
            System.out.println("Không có để xoá");
        } else {
            for (BenhAnThuong item : benhAnThuongList) {
                if (item.getIdBenhAn().equals(id)) {
                    System.out.println("Bạn có muốn xóa (Y/N)");
                    String confirm = scanner.nextLine();
                    if ("Y".equals(confirm.toUpperCase())) {
                        benhAnThuongList.remove(item);
                    } else if ("N".equals(confirm.toUpperCase())) {
                        break;
                    }
                    flag= true;
                    break;
                }
            }
            if (!flag){
                System.out.println("Không có thông tin trong danh sách");
            }
        }
        if (flag){
            updateFile(benhAnThuongList);
        }
    }

        @Override
        public void find () {

        }

        public static void updateFile (List < BenhAnThuong > benhAnThuongList) {
            List<String> stringList = new ArrayList<>();
            for (BenhAnThuong item : benhAnThuongList) {
                stringList.add(item.getLine());
            }
            ReadAndWriteFile.write("src\\benh_an\\data\\medical_records.csv", stringList);
        }
    }
