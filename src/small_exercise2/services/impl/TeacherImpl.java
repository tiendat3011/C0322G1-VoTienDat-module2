package small_exercise2.services.impl;

import small_exercise2.models.ShortByDateOfBirth;
import small_exercise2.models.Student;
import small_exercise2.models.Teacher;
import small_exercise2.models.UpByName;
import small_exercise2.services.Service;
import small_exercise2.utils.NotFoundEmployeeException;
import small_exercise2.utils.ReadAndWriteFile;
import small_exercise2.utils.Regex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TeacherImpl implements Service {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Teacher> teacherList;

    public static List<Teacher> getTeacherList() {
        List<Teacher> teacherList = new ArrayList<>();
        List<String[]> listStr = ReadAndWriteFile.read("src\\small_exercise2\\data\\student.csv");
        for (String[] item : listStr) {
            teacherList.add(new Teacher(
                    item[0],
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    Integer.parseInt(item[5]),
                    Integer.parseInt(item[6]),
                    Integer.parseInt(item[7])));
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
    public void add() {
        teacherList = getTeacherList();
        System.out.println("nhập id");
        String id = scanner.nextLine();

        System.out.println("nhập tên ");
        String name = scanner.nextLine();

//        System.out.println("nhập giới tính ");
        String gender = Regex.gender();

        System.out.println("nhập ngày sinh");
        String dateOfBirth = Regex.dateOfBirth();

        System.out.println("nhập địa chỉ");
        String address = scanner.nextLine();

        System.out.println("Lớp dạy");
        int lop = Integer.parseInt(scanner.nextLine());

        System.out.println("Lương một giờ dạy");
        int luong = Regex.luong();

        System.out.println("Số giờ dạy trong tháng");
        int soGioDay = Regex.soGioDay();

        teacherList.add(new Teacher(id, name, gender, dateOfBirth, address, lop, luong, soGioDay));

        updateFile(teacherList);
        System.out.println("Thêm thành công");

    }

    @Override
    public void delete() {
        teacherList = getTeacherList();
        try {
            System.out.println("nhập mã nhân viên muốn xóa : ");
            String id = scanner.nextLine();
            boolean flag = false;
            if (teacherList.isEmpty()) {
                System.out.println("Không có để xóa");
            } else {

                for (Teacher item : teacherList) {
                    if (item.getId().equals(id)) {
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
                    throw new NotFoundEmployeeException();
                }
            }
            if (flag) {
                updateFile(teacherList);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void edit() {
        teacherList = getTeacherList();
        System.out.println("Nhập id muốn sủa");
        String id = scanner.nextLine();
        boolean flag = false;
        int index = 0;
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getId().equals(id)) {
                index = i;
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("nhập tên ");
            String name = scanner.nextLine();
            teacherList.get(index).setName(name);

//            System.out.println("nhập giới tính ");
            String gender = Regex.gender();
            teacherList.get(index).setGender(gender);

            System.out.println("nhập ngày sinh");
            String dateOfBirth = Regex.dateOfBirth();
            teacherList.get(index).setDateOfBirth(dateOfBirth);

            System.out.println("nhập địa chỉ");
            String address = scanner.nextLine();
            teacherList.get(index).setAddress(address);

            System.out.println("Lớp dạy");
            int lop = Integer.parseInt(scanner.nextLine());
            teacherList.get(index).setLop(lop);

            System.out.println("Lương một giờ dạy");
            int luong = Regex.luong();
            teacherList.get(index).setLuong(luong);


            System.out.println("Số giờ dạy trong tháng");
            int soGioDay = Regex.soGioDay();
            teacherList.get(index).setSoGioDay(soGioDay);

//            teacherList.add(new Teacher(id, name, gender, dateOfBirth, address, lop, luong, soGioDay));

            updateFile(teacherList);
            System.out.println("Sua thành công");
        } else {
            System.out.println("Khoong tim thay id");
        }
    }

    @Override
    public void shortByName() {
        teacherList = getTeacherList();

        UpByName upByName = new UpByName();
        Collections.sort(teacherList, upByName);
        display();

    }

    @Override
    public void shortByBirthDay() {
        teacherList = getTeacherList();
        ShortByDateOfBirth shortByDateOfBirth = new ShortByDateOfBirth();
        Collections.sort(teacherList, shortByDateOfBirth);
        display();
    }

    public static void updateFile(List<Teacher> teacherList) {
        List<String> stringList = new ArrayList<>();
        for (Teacher item : teacherList) {
            stringList.add(item.getLine());
        }
        ReadAndWriteFile.write("src\\small_exercise2\\data\\student.csv", stringList);
    }
}
