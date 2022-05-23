package big_exercise.services.impl;

import big_exercise.models.*;
import big_exercise.services.Servicee;
import java.util.LinkedList;

public class LinkedListImpl implements Servicee {
    static LinkedList<Person> linkedList = new LinkedList<>();
    static {
        linkedList.add(new Management("dat", "29/11/1999", "vn", 10000, 1.5));
        linkedList.add(new Management("hao", "9/11/1999", "vn", 15000, 2.2));
        linkedList.add(new ProductionStaff("ha", "1/2/1999", "vn", 15));
        linkedList.add(new ProductionStaff("linh", "1/9/1999", "vn", 20));
        linkedList.add(new DailyWorker("thao", "5/9/1999", "vn", 5));
        linkedList.add(new DailyWorker("le", "6/9/1999", "vn", 9));
    }

    @Override
    public void display() {
        for (Person item : linkedList) {
            System.out.println(item);
        }
    }
    @Override
    public void displayQuanLy() {
        for (Person item : linkedList) {
            if (item instanceof Management) {
                System.out.println(item);
            }
        }
    }
    @Override
    public void displayCongNhat() {
        for (Person item : linkedList) {
            if (item instanceof ProductionStaff) {
                System.out.println(item);
            }
        }
    }
    @Override
    public void displaySanXuat() {
        for (Person item : linkedList) {
            if (item instanceof DailyWorker) {
                System.out.println(item);
            }
        }
    }
    @Override
    public void sapXepLuongTang() {

    }
    @Override
    public void sapXepTenTang() {
    }
}