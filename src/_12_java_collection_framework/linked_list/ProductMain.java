package _12_java_collection_framework.linked_list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ProductMain {
    public static LinkedList<ProductManagement> myList = new LinkedList<>();
    public static Scanner input = new Scanner(System.in);
    public static int size = 0;

    public static void main(String[] args) {


        myList.add(new ProductManagement("Iphone", 1, 5000));
        myList.add(new ProductManagement("Xiao Mi", 2, 4000));
        myList.add(new ProductManagement("SamSung", 3, 9000));
        myList.add(new ProductManagement("HK Phone", 4, 2000));
        myList.add(new ProductManagement("B Phone", 5, 1000));


        while (true) {

            System.out.println("1: Thêm sản phẩm ");
            System.out.println("2: Sửa sản phẩm theo id ");
            System.out.println("3: Xoá sản phẩm theo id ");
            System.out.println("4: Hiển thị sản phẩm ");
            System.out.println("5: Tìm kiếm sản phẩm theo tên ");
            System.out.println("6: Sắp xếp sản phẩm theo giá tămg");
            System.out.println("7: Sắp xếp sản phẩm theo giá giảm     ");
            System.out.println("8: Thoát ");

            String choose = input.nextLine();

            switch (choose) {
                case "1":
                    add();
                    break;
                case "2":
                    fix();
                    break;
                case "3":
                    remove();
                    break;
                case "4":
                    diplay();
                    break;
                case "5":
                    find();
                    break;
                case "6":
                    sortByPrice();
                    break;
                case "7":
                    sortByPriceDown();
                    break;
                case "8":
                    System.exit(8);
                default:
                    System.out.println("Nhập từ 1-8");
            }
        }
    }

    public static void diplay() {
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
        Collections.sort(myList);
    }

    public static void add() {
        System.out.println(" Nhập Giá");
        int price = Integer.parseInt(input.nextLine());
        System.out.println("Tên Sản Phẩm");
        String name = input.nextLine();
        System.out.println("id");
        int id = Integer.parseInt(input.nextLine());
        myList.add(new ProductManagement(name, id, price));
        diplay();
    }

    public static void fix() {
        System.out.println("Nhập id muốn sửa");
        int id = Integer.parseInt(input.nextLine());

        boolean flag = false;
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).getId() == id) {
                myList.remove(i);
                System.out.println(" Nhập  Giá");
                int price = Integer.parseInt(input.nextLine());
                System.out.println("Tên Sản Phẩm");
                String name = input.nextLine();
                myList.add(new ProductManagement(name, id, price));
                flag = true;
                diplay();
                break;
            }
        }
        if (!flag) {
            System.out.println("Không có id này: ");
        }
    }
    public static void remove() {
        System.out.println("id");
        int id = Integer.parseInt(input.nextLine());
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).getId() == id) {
                myList.remove(i);
            }
        }
        diplay();
    }

    public static void find() {
        System.out.println("Tên");
        String name = input.nextLine();
        boolean flag = false;
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).getName().equals(name)) {
                System.out.println(myList.get(i));
                flag = true;
            } else {
                flag = false;
            }
        }
        if (!flag) {
            System.out.println("Không có sản phẩm này");
        }
    }

    public static void sortByPrice() {
        Up up = new Up();
        Collections.sort(myList, up);
        diplay();
    }

    public static void sortByPriceDown() {
        Down down = new Down();
        Collections.sort(myList,down);
        diplay();
    }
}