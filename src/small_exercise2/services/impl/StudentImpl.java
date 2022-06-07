package small_exercise2.services.impl;

import small_exercise2.models.ShortByDateOfBirth;
import small_exercise2.models.Student;
import small_exercise2.models.UpByName;
import small_exercise2.services.Service;
import small_exercise2.utils.NotFoundEmployeeException;
import small_exercise2.utils.ReadAndWriteFile;
import small_exercise2.utils.Regex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentImpl implements Service {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Student> studentList;

    public static List<Student> getStudentList() {
        List<Student> studentList = new ArrayList<>();
        List<String[]> listStr = ReadAndWriteFile.read("src\\small_exercise2\\data\\student.csv");
        for (String[] item : listStr) {
            studentList.add(new Student(
                    item[0],
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    item[5],
                    Double.parseDouble(item[6])));
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
    public void add() {
        studentList = getStudentList();

        System.out.println("nhập id");
        String id = scanner.nextLine();

        System.out.println("nhập tên ");
        String name = scanner.nextLine();

        String gender = Regex.gender();

        System.out.println("nhập ngày sinh");
        String dateOfBirth = Regex.dateOfBirth();

        System.out.println("nhập địa chỉ");
        String address = scanner.nextLine();

        System.out.println("nhập mã sinh viên");
        String idSv = Regex.idRegexSV(studentList);

        System.out.println("Nhập điểm trung bình");
        Double diemTb = Regex.diemTb();

        studentList.add(new Student(id, name, gender, dateOfBirth, address, idSv, diemTb));

        updateFile(studentList);
        System.out.println("Thêm thành công");

    }

    @Override
    public void delete() {
        studentList = getStudentList();
        try {
            System.out.println("nhập mã nhân viên muốn xóa : ");
            String id = scanner.nextLine();
            boolean flag = false;
            if (studentList.isEmpty()) {
                System.out.println("Không có để xóa");
            } else {

                for (Student item : studentList) {
                    if (item.getId().equals(id)) {
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
                    throw new NotFoundEmployeeException();
                }
            }
            if (flag) {
                updateFile(studentList);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void edit() {
        studentList = getStudentList();
        System.out.println("Nhập id muốn sủa");
        String id = scanner.nextLine();
        boolean flag = false;
        int index = 0;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)) {
                index = i;
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("nhập tên ");
            String name = scanner.nextLine();
            studentList.get(index).setName(name);

            String gender = Regex.gender();
            studentList.get(index).setGender(gender);

            System.out.println("nhập ngày sinh");
            String dateOfBirth = Regex.dateOfBirth();
            studentList.get(index).setDateOfBirth(dateOfBirth);

            System.out.println("nhập địa chỉ");
            String address = scanner.nextLine();
            studentList.get(index).setAddress(address);

            System.out.println("nhập mã sinh viên");
            String idSv = Regex.idRegexSV(studentList);
            studentList.get(index).setIdSV(idSv);

            System.out.println("Nhập điểm trung bình");
            Double diemTb = Regex.diemTb();
            studentList.get(index).setDiemTb(diemTb);

//            studentList.add(new Student(id, name, gender, dateOfBirth, address, idSv, diemTb));
            updateFile(studentList);
            System.out.println("sua thành công");
        } else {
            System.out.println("Khoong tim thay id");
        }
    }

    @Override
    public void shortByName() {
        studentList = getStudentList();

        UpByName upByName = new UpByName();
        Collections.sort(studentList, upByName);
        for (Student item : studentList) {
            System.out.println(item);
        }

    }

    @Override
    public void shortByBirthDay() {
        studentList = getStudentList();
        ShortByDateOfBirth shortByDateOfBirth = new ShortByDateOfBirth();
        Collections.sort(studentList, shortByDateOfBirth);
        for (Student item : studentList) {
            System.out.println(item);
        }
    }

    public static void updateFile(List<Student> studentList) {
        List<String> stringList = new ArrayList<>();
        for (Student item : studentList) {
            stringList.add(item.getLine());
        }
        ReadAndWriteFile.write("src\\small_exercise2\\data\\student.csv", stringList);
    }
}
