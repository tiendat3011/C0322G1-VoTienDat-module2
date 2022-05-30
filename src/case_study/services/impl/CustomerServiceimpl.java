package case_study.services.impl;

import case_study.models.person.Customer;
import case_study.services.CustomerService;
import case_study.utils.ReadAndWrite;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceimpl implements CustomerService {
    private static List<Customer> customerList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);


    @Override
    public void display() throws IOException {
        List<String[]> listStr =ReadAndWrite.readFile("src\\case_study\\data\\Customer.csv");
        // đ biết lluon . nhưng bắt buộc phải clear.ok ?
//            employeeList.clear();
        for (String[] item  : listStr) {

            Customer customer= new Customer(Integer.parseInt(item[0]),item[1],item[2],item[3],Integer.parseInt(item[4]),
                    Integer.parseInt(item[5]),item[6],item[7],item[8]);
            System.out.println(customer);
        }
//
//        for (Customer customer : customerList) {
//            System.out.println(customer.toString());
//        }
    }

    @Override
    public void addNew() {
        System.out.println("Nhập Id");
        int id = Integer.parseInt(scanner.nextLine());

        boolean check = true;
        for (Customer customer : customerList) {
            if (customer.getId() == id) {
                check = false;
            }
        }
        if (check) {
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

            System.out.println("Nhập Loại khách");
            String customerType = scanner.nextLine();

            Customer customer = new Customer(id,
                    name,
                    dateOfBirth,
                    sex,
                    numCMND,
                    phoneNum,
                    email,
                    address,
                    customerType);
            customerList.add(customer);
            String line = id +"," +name +","+ dateOfBirth+","+sex+","+numCMND+","+phoneNum+","+email+","+address+","+customerType;
            ReadAndWrite.writerFile("src\\case_study\\data\\Customer.csv",line);
            System.out.println("Đã thêm thành công");
        }
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

        System.out.println("Nhập loại khách");
        String customerType = scanner.nextLine();


        boolean flag = false;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == id) {
                customerList.remove(i);
                customerList.add(new Customer(id,
                        name,
                        dateOfBirth,
                        sex,
                        numCMND,
                        phoneNum,
                        email,
                        address,
                        customerType));
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
