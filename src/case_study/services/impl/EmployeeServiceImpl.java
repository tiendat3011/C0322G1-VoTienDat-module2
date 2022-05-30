package case_study.services.impl;

import case_study.models.person.Employee;
import case_study.services.EmployeeService;
import case_study.utils.ReadAndWrite;
import case_study.utils.RegexData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

    private static List<Employee> employeeList;// lm vs static thi` k can file va ng lai>> xoa di
    private static Scanner scanner = new Scanner(System.in);

    public static List<Employee> getEmployeeList() throws IOException {
        List<Employee> employeeList = new ArrayList<>();
        List<String[]> listStr = ReadAndWrite.readFile("src\\case_study\\data\\Employee.csv");
        for (String[] item : listStr) {
            Employee employee = new Employee(Integer.parseInt(
                    item[0]),
                    item[1],
                    item[2],
                    item[3],
                    Integer.parseInt(item[4]),
                    Integer.parseInt(item[5]),
                    item[6],
                    item[7],
                    item[8],
                    item[9],
                    Integer.parseInt(item[10]));
            System.out.println(employee);
        }
        return employeeList;
    }

    public static final String BIRTHDAY = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)" +
            "(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)" +
            "0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))" +
            "$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";

    @Override

    public void display() throws IOException {
        employeeList = getEmployeeList();
        for (Employee item : employeeList) {
            System.out.println(item);
        }
    }

    @Override
    public void addNew() throws IOException {
        List<Employee> employeeList =  getEmployeeList() ;
        System.out.println("Nhập Id");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập tên");
        String name = scanner.nextLine();

        System.out.println("Nhập ngày sinh");
        String dateOfBirth = RegexData.regexAge(scanner.nextLine(), BIRTHDAY);

        System.out.println("Nhập giới tính");
        String sex = scanner.nextLine();

        System.out.println("Nhập số CMND");
        int numCMND = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập số điện thoại");
        int phoneNum = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập email");
        String email = scanner.nextLine();

        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();

        System.out.println("Nhập chức vụ");
        String lever = scanner.nextLine();

        System.out.println("Nhập vị trí");
        String position = scanner.nextLine();

        System.out.println("Nhập lương");
        int salary = Integer.parseInt(scanner.nextLine());
        List<String> stringList =  new ArrayList<>();

        Employee employee = new Employee(id,
                name,
                dateOfBirth,
                sex,
                numCMND,
                phoneNum,
                email,
                address,
                lever,
                position,
                salary);
        employeeList.add(employee);

        ReadAndWrite.writeFile("src\\case_study\\data\\Employee.csv",employee.getLine());
        System.out.println("Da them thanh cong");
    }


    @Override
    public void edit() throws IOException {
        System.out.println("Nhập Id");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập tên");
        String name = scanner.nextLine();

        System.out.println("Nhập ngày sinh");
        String dateOfBirth = scanner.nextLine();

        System.out.println("Nhập giới tính");
        String sex = scanner.nextLine();

        System.out.println("Nhập số CMND");
        int numCMND = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập số điện thoại");
        int phoneNum = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập email");
        String email = scanner.nextLine();

        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();

        System.out.println("Nhập chức vụ");
        String lever = scanner.nextLine();

        System.out.println("Nhập vị trí");
        String position = scanner.nextLine();

        System.out.println("Nhập lương");
        int salary = Integer.parseInt(scanner.nextLine());

        boolean flag = false;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {
                employeeList.remove(i);
                employeeList.add(new Employee(id,
                        name,
                        dateOfBirth,
                        sex,
                        numCMND,
                        phoneNum,
                        email,
                        address,
                        lever,
                        position,
                        salary));
                flag = true;
                display();
                break;
            }
        }
        if (!flag) {
            System.out.println("Không có id này: ");
        }
    }

    @Override
    public void delete() {

    }
}
