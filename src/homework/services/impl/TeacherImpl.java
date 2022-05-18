package homework.services.impl;

import homework.models.Teacher;
import homework.services.Services;
import homework.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherImpl implements Services {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Teacher> teacherList;

    public static List<Teacher> getTeacherList() {
        List<Teacher> teacherList = new ArrayList<>();
        List<String[]> listStr = ReadAndWriteFile.read("src\\homework\\data\\Teacher.csv");
        for (String[] item : listStr) {
            teacherList.add(new Teacher(
                    Integer.parseInt(item[0]),
                    item[1],
                    Integer.parseInt(item[2]),
                    item[3],
                    Integer.parseInt(item[4])));
        }
        return teacherList;
    }

    @Override
    public void display() {
        teacherList = getTeacherList();
        for (Teacher item : teacherList) {
            System.out.println(item);
        }
    }

    @Override
    public void  addNew() {
        teacherList = getTeacherList();

        System.out.println("nhập id");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("nhâp tên");
        String name = scanner.nextLine();

        System.out.println("nhập tuổi ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập giới tính");
        String gender = scanner.nextLine();

        System.out.println("nhập lương");
        int salary = Integer.parseInt(scanner.nextLine());

        teacherList.add(new Teacher(id, name, age, gender, salary));

        updateFile(teacherList);
        System.out.println("Đã thêm thành công");

    }

    @Override
    public void delete() {
        teacherList = getTeacherList();

        Scanner sc = new Scanner(System.in);
        System.out.println("nhập id muốn xóa : ");
        int id = sc.nextInt();
        boolean flag = false;
        if (teacherList.isEmpty()) {
            System.out.println("Không có để xóa");
        } else {
            for (Teacher item : teacherList) {
                if (item.getId() == (id)) {
                    System.out.println("Bạn có muốn xóa (Y/N)");
                    String confirm = scanner.nextLine();
                    if ("Y".equals(confirm.toUpperCase())) {
                        teacherList.remove(item);
                    } else if ("N".equals(confirm.toUpperCase())) {
                        break;
                    }
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("không tìm thấy thông tin");
            }
        }
        if (flag) {
            updateFile(teacherList);
        }
    }

    @Override
    public void find() {
        teacherList = getTeacherList();

        Scanner sc = new Scanner(System.in);
        System.out.println("nhập id muốn tìm : ");
        int id = sc.nextInt();
        boolean flag = false;
        for (Teacher item : teacherList) {
            if (item.getId() == (id)) {
                flag = true;
                System.out.println(item);
                break;
            }
            if (flag = false) {
                System.out.println("không tìm thấy id");
            }
        }
    }

    public static void updateFile(List<Teacher> teacherList) {
        List<String> stringList = new ArrayList<>();
        for (Teacher item : teacherList) {
            stringList.add(item.getLine());
        }
        ReadAndWriteFile.write("src\\homework\\data\\Teacher.csv", stringList);
    }
}
