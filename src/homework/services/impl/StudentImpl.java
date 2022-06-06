package homework.services.impl;

import homework.models.Student;
import homework.services.Services;
import homework.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentImpl implements Services {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Student> studentList;
    public static List<Student> getStudentList() {
        List<Student> studentList = new ArrayList<>();
        List<String[]> listStr = ReadAndWriteFile.read("src\\homework\\data\\Student.csv");
        for (String[] item : listStr) {
            studentList.add(new Student(
                    Integer.parseInt(item[0]),
                    item[1],
                    Integer.parseInt(item[2]),
                    item[3],
                    Integer.parseInt(item[4])));
        }
        return studentList;
    }

    @Override
    public void display() {
        studentList = getStudentList();
        for (Student item : studentList) {
            System.out.println(item);
        }
    }

    @Override
    public void addNew() {
        studentList = getStudentList();

        System.out.println("nhập id");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("nhâp tên");
        String name = scanner.nextLine();

        System.out.println("nhập tuổi ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập giới tính");
        String gender = scanner.nextLine();

        System.out.println("nhập điểm");
        int point = Integer.parseInt(scanner.nextLine());

        studentList.add(new Student(id, name, age, gender, point));

        updateFile(studentList);
        System.out.println("Đã thêm thành công");
    }

    @Override
    public void delete() {
        studentList = getStudentList();

            Scanner sc = new Scanner(System.in);
            System.out.println("nhập id muốn xóa : ");
            int id = sc.nextInt();
            boolean flag = false;
            if (studentList.isEmpty()) {
                System.out.println("Không có để xóa");
            } else {
                for (Student item : studentList) {
                    if (item.getId() == (id)) {
                        System.out.println("Bạn có muốn xóa (Y/N)");
                        String confirm = scanner.nextLine();
                        if ("Y".equals(confirm.toUpperCase())) {
                            studentList.remove(item);
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
                updateFile(studentList);
            }
        }

    @Override
    public void find() {
        studentList = getStudentList();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập id muốn tìm : ");
        int id = sc.nextInt();
        boolean flag = false;
        for (Student item : studentList) {
            if (item.getId() == (id)) {
                flag = true;
                System.out.println(item);
                break;
            }
        }
        if (!flag) {
            System.out.println("không tìm thấy id");
        }
    }

    public static void updateFile(List<Student> studentList) {
        List<String> stringList = new ArrayList<>();
        for (Student item : studentList) {
            stringList.add(item.getLine());
        }
        ReadAndWriteFile.write("src\\homework\\data\\Student.csv", stringList);
    }
}
