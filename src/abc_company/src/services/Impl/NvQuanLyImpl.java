package services.Impl;

import models.NvQuanLy;
import models.NvSanXuat;
import services.Services;
import utils.NotFoundEmployeeException;
import utils.ReadAndWriteFile;
import utils.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NvQuanLyImpl implements Services {
    public static Scanner scanner = new Scanner(System.in);
    public static List<NvQuanLy> nvQuanLyList;

    public static List<NvQuanLy> getNvQuanLyList() {
        List<NvQuanLy> nvQuanLyList = new ArrayList<>();
        List<String[]> listStr = ReadAndWriteFile.read("src\\data\\quanly.csv");
        for (String[] item : listStr) {
            nvQuanLyList.add(new NvQuanLy(
                    item[0],
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    Integer.parseInt(item[5]),
                    Integer.parseInt(item[6])));
        }
        return nvQuanLyList;
    }

    @Override
    public void display() {
        nvQuanLyList = getNvQuanLyList();
        for (NvQuanLy item : getNvQuanLyList()) {
            System.out.println(item);
        }
    }

    @Override
    public void add() {
        nvQuanLyList = getNvQuanLyList();

        System.out.println("nhập id");
        String id = scanner.nextLine();

        System.out.println("nhập mã nhân viên");
        String idNv = Regex.idRegexQl(nvQuanLyList);

        System.out.println("nhập tên nhân viên");
        String name = scanner.nextLine();

        System.out.println("nhập ngày sinh");
        String dateOfBirth = Regex.dateOfBirth();

        System.out.println("nhập địa chỉ");
        String address = scanner.nextLine();

        System.out.println("nhập lương");
        int luong = Regex.luong();

        System.out.println("nhập hệ số lương");
        int heSoLuong = Regex.heSoLuong();

        nvQuanLyList.add(new NvQuanLy(id, idNv, name, dateOfBirth, address, luong, heSoLuong));


        updateFile(nvQuanLyList);
        System.out.println("Thêm thành công");
    }

    @Override
    public void delete() {
        nvQuanLyList = getNvQuanLyList();

        System.out.println("nhập mã nhân viên muốn xóa : ");
        String idNv = scanner.nextLine();
        boolean flag = false;
        if (nvQuanLyList.isEmpty()) {
            System.out.println("Không có để xóa");
        } else {
            for (NvQuanLy item : nvQuanLyList) {
                if (item.getIdNv().equals(idNv)) {
                    System.out.println("Bạn có muốn xóa (Y/N)");
                    String confirm = scanner.nextLine();
                    if ("Y".equals(confirm.toUpperCase())) {
                        nvQuanLyList.remove(item);
                    } else if ("N".equals(confirm.toUpperCase())) {
                        break;
                    }
                    flag = true;
                    break;
                }
            }
            try {
                throw new NotFoundEmployeeException(" không có mã nhân viên trong danh sách");
            } catch (NotFoundEmployeeException e) {
                System.out.println(e.getMessage());
            }
        }
        if (flag) {
            updateFile(nvQuanLyList);
        }
    }

    @Override
    public void find() {
        nvQuanLyList = getNvQuanLyList();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập tên nhân viên muốn tìm");
        String nameNv = sc.nextLine();
        boolean flag = false;

        for (NvQuanLy item : nvQuanLyList) {
            if (item.getName().contains(nameNv)) {
                flag = true;
                System.out.println(item);
                break;
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy");
        }
    }

    public static void updateFile(List<NvQuanLy> nvQuanLyList) {
        List<String> stringList = new ArrayList<>();
        for (NvQuanLy item : nvQuanLyList) {
            stringList.add(item.getLine());
        }
        ReadAndWriteFile.write("src\\data\\quanly.csv", stringList);
    }
}
