package case_study.services.impl;

import case_study.models.person.Customer;
import case_study.services.CustomerService;
import case_study.utils.CustomerRegex;
import case_study.utils.EmployeeRegex;
import case_study.utils.ReadAndWrite;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    static Scanner scanner = new Scanner(System.in);
    public  List<Customer> customerList = getCustomerList();

    public  List<Customer> getCustomerList() {
        customerList = new LinkedList<>();
        try {
            List<String[]> list = ReadAndWrite.read("src\\case_study\\data\\customers.csv");
            for (String[] item : list) {
                customerList.add(new Customer(
                        item[0],
                        item[1],
                        item[2],
                        item[3],
                        item[4],
                        item[5],
                        item[6],
                        item[7],
                        item[8]));
            }
        } catch (NullPointerException e) {
        }
        return customerList;
    }


    @Override
    public void display() {
        customerList = getCustomerList();
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
    }

    @Override
    public void add() {
        customerList = getCustomerList();
        System.out.println("Nhập tên");
        String name = scanner.nextLine();

        System.out.println("Nhập ngày sinh");
        String dateOfBirth = CustomerRegex.dateOfBirth();

//        System.out.println("Nhập giới tính");
        String gender = CustomerRegex.gender();

        System.out.println("Nhập email");
        String email = scanner.nextLine();

        System.out.println("Nhập ID card number");
        String idCardNumber = scanner.nextLine();

        System.out.println("Nhập số điện thoại");
        String phoneNumber = scanner.nextLine();

        System.out.println("Nhập ID ");
        String customerID = CustomerRegex.idRegex(customerList);

        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();

        String customerType = CustomerRegex.customerType();

        String line = name + "," +
                dateOfBirth + "," +
                gender + "," +
                email + "," +
                idCardNumber + "," +
                phoneNumber + "," +
                customerID + "," +
                address + "," +
                customerType;
        ReadAndWrite.write("src\\case_study\\data\\customers.csv", line);
        System.out.println("Thêm thành công");
    }

    @Override
    public void edit() {
        customerList = getCustomerList();
        System.out.println("Nhập Id muốn sửa");
        String id = scanner.nextLine();
        boolean flag = false;
        int index = 0;

        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getIdCustomerNumber().equals(id)) {
                index = i;
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Nhập tên");
            String name = scanner.nextLine();
            customerList.get(index).setName(name);

            System.out.println("Nhập ngày sinh");
            String dateOfBirth = CustomerRegex.dateOfBirth();
            customerList.get(index).setDateOfBirth(dateOfBirth);

//            System.out.println("Nhập giới tính");
            String gender = EmployeeRegex.gender();
            customerList.get(index).setGender(gender);

            System.out.println("Nhập email");
            String email = scanner.nextLine();
            customerList.get(index).setEmail(email);

            System.out.println("Nhập ID card number");
            String idCardNumber = scanner.nextLine();
            customerList.get(index).setIdCardNumber(idCardNumber);

            System.out.println("Nhập số điện thoại");
            String phoneNumber = scanner.nextLine();
            customerList.get(index).setPhoneNumber(phoneNumber);

            System.out.println("Nhập id");
            String customerId = scanner.nextLine();
            customerList.get(index).setIdCustomerNumber(customerId);

            System.out.println("Nhập địa chỉ");
            String address = scanner.nextLine();
            customerList.get(index).setAddress(address);

            String customerType = CustomerRegex.customerType();
            customerList.get(index).setCustomerType(customerType);

            writeCustomerList(customerList);
            System.out.println("Sửa thành công");
        } else {
            System.out.println("Không có id này");
        }
    }

    public static void writeCustomerList(List<Customer> customers) {
        File file = new File("src\\case_study\\data\\customers.csv");
        file.delete();

        for (Customer item : customers) {
            ReadAndWrite.write("src\\case_study\\data\\customers.csv", item.getLine());
        }
    }
}