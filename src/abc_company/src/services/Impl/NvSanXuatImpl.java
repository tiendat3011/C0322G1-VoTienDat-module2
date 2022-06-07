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

public class NvSanXuatImpl implements Services {
    public static Scanner scanner = new Scanner(System.in);
    public static List<NvSanXuat> nvSanXuatList;

    public static List<NvSanXuat> getNvSanXuatList() {
        List<NvSanXuat> nvSanXuatList = new ArrayList<>();
        List<String[]> listStr = ReadAndWriteFile.read("src\\data\\sanxuat.csv");
        for (String[] item : listStr) {
            nvSanXuatList.add(new NvSanXuat(
                    item[0],
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    Integer.parseInt(item[5]),
                    Integer.parseInt(item[6])));
        }
        return nvSanXuatList;
    }

    @Override
    public void display() {
        nvSanXuatList = getNvSanXuatList();
        for (NvSanXuat item : getNvSanXuatList()) {
            System.out.println(item);
        }
    }

    @Override
    public void add() {
        nvSanXuatList = getNvSanXuatList();

        System.out.println("nhập id");
        String id = scanner.nextLine();

        System.out.println("nhập mã nhân viên");
        String idNv = Regex.idRegexSx(nvSanXuatList);

        System.out.println("nhập tên nhân viên");
        String name = scanner.nextLine();

        System.out.println("nhập ngày sinh");
        String dateOfBirth = Regex.dateOfBirth();

        System.out.println("nhập địa chỉ");
        String address = scanner.nextLine();

        System.out.println("nhập số sản phẩm");
        int soSp = Regex.soSp();

        System.out.println("nhập giá sản phẩm");
        int giaSP = Regex.giaSP();
        nvSanXuatList.add(new NvSanXuat(id, idNv, name, dateOfBirth, address, soSp, giaSP));


        updateFile(nvSanXuatList);
        System.out.println("Thêm thành công");
    }

    @Override
    public void delete() {

        nvSanXuatList = getNvSanXuatList();
        try {

            System.out.println("nhập mã nhân viên muốn xóa : ");
            String idNv = scanner.nextLine();
            boolean flag = false;
            if (nvSanXuatList.isEmpty()) {
                System.out.println("Không có để xóa");
            } else {

                for (NvSanXuat item : nvSanXuatList) {
                    if (item.getIdNv().equals(idNv)) {
                        System.out.println("Bạn có muốn xóa (Y/N)");
                        String confirm = scanner.nextLine();
                        if ("Y".equals(confirm.toUpperCase())) {
                            nvSanXuatList.remove(item);
                        } else if ("N".equals(confirm.toUpperCase())) {
                            break;
                        }
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    throw new NotFoundEmployeeException();
                }
            }
            if (flag) {
                updateFile(nvSanXuatList);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void find() {
        nvSanXuatList = getNvSanXuatList();

        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập tên nhân viên muốn tìm");
        String nameNv = sc.nextLine();
        boolean flag = false;

        for (NvSanXuat item : nvSanXuatList) {
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

    public static void updateFile(List<NvSanXuat> nvSanXuatList) {
        List<String> stringList = new ArrayList<>();
        for (NvSanXuat item : nvSanXuatList) {
            stringList.add(item.getLine());
        }
        ReadAndWriteFile.write("src\\data\\sanxuat.csv", stringList);
    }
}
