package case_study.services.impl;

import case_study.models.person.Customer;
import case_study.models.person.Employee;
import case_study.services.EmployeeService;
import case_study.services.regex.EmployeeRegex;
import case_study.utils.ReadAndWrite;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Employee> employeeList = getEmployeeList();
    public static List<Employee> getEmployeeList() {
        List<Employee> employeeList = new ArrayList<>();
        List<String[]> list = ReadAndWrite.read("src\\case_study\\data\\employee.csv");
        for (String[] item : list) {
            employeeList.add(new Employee(
                    item[0],
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    item[5],
                    item[6],
                    item[7],
                    item[8],
                    Integer.parseInt(item[9])));
        }
        return employeeList;
    }


    @Override
    public void display() {
        employeeList = getEmployeeList();
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }

    @Override
    public void add() {
        employeeList = getEmployeeList();
        System.out.println("Nhập tên");
        String name = scanner.nextLine();

        System.out.println("Nhập ngày sinh");
        String dateOfBirth = EmployeeRegex.dateOfBirth();

        System.out.println("Nhập giới tính");
        String gender = scanner.nextLine();

        System.out.println("Nhập email");
        String email = scanner.nextLine();

        System.out.println("Nhập ID card number");
        String idCardNumber = scanner.nextLine();

        System.out.println("Nhập số điện thoại");
        String phoneNumber = scanner.nextLine();

        String level = EmployeeRegex.level();

        String position = EmployeeRegex.position();

        System.out.println("Nhập ID ");
        String employeeID = EmployeeRegex.idRegex(employeeList);

        System.out.println("Nhập lương");
        int salary = EmployeeRegex.salary();

        String line = name + "," +
                dateOfBirth + "," +
                gender + "," +
                email + "," +
                idCardNumber + "," +
                phoneNumber + "," +
                level + "," +
                position + "," +
                employeeID + "," +
                salary;
        ReadAndWrite.write("src\\case_study\\data\\employee.csv", line);
        System.out.println("Thêm thành công");
    }
    @Override
    public void edit() {
        employeeList = getEmployeeList();
        System.out.println("Nhập ID muốn sửa");
        String id = scanner.nextLine();

        boolean flag = false;
        int index = 0;

        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getIdEmployeeNumber().equals(id)) {
                index = i;
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Nhập tên");
            String name = scanner.nextLine();
            employeeList.get(index).setName(name);

            System.out.println("Nhập ngày sinh");
            String dateOfBirth = EmployeeRegex.dateOfBirth();
            employeeList.get(index).setDateOfBirth(dateOfBirth);

            System.out.println("Nhập giới tính");
            String gender = scanner.nextLine();
            employeeList.get(index).setGender(gender);

            System.out.println("Nhập email");
            String email = scanner.nextLine();
            employeeList.get(index).setEmail(email);

            System.out.println("Nhập  ID card number");
            String idCardNumber = scanner.nextLine();

            employeeList.get(index).setIdCardNumber(idCardNumber);

            System.out.println("Nhập số điện thoại");
            String phoneNumber = scanner.nextLine();
            employeeList.get(index).setPhoneNumber(phoneNumber);

            String level = EmployeeRegex.level();
            employeeList.get(index).setLevel(level);

            String position = EmployeeRegex.position();
            employeeList.get(index).setPosition(position);

            System.out.println("Nhập lương");
            int salary = EmployeeRegex.salary();
            employeeList.get(index).setSalary(salary);

            writeEmployeeList(employeeList);
            System.out.println("Sủa thành công");
        } else {
            System.out.println("Không có id trong danh sách");
        }
    }

    public static void writeEmployeeList(List<Employee> employees) {
        File file = new File("src\\case_study\\data\\employee.csv");
        file.delete();

        for (Employee item : employees) {
            ReadAndWrite.write("src\\case_study\\data\\employee.csv", item.getLine());
        }
    }

}