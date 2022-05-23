package big_exercise.services.impl;

import big_exercise.models.DailyWorker;
import big_exercise.models.Management;
import big_exercise.models.Person;
import big_exercise.models.ProductionStaff;
import big_exercise.services.Servicee;

public class ArrayImpl implements Servicee {
    static Person[] list = new Person[1000];
    static {
        list[0] = new Management("dat", "29/11/1999", "vn", 10000, 1.5);
        list[1] = new Management("hao", "9/11/1999", "vn", 15000, 2.2);
        list[2] = new ProductionStaff("ha", "1/2/1999", "vn", 15);
        list[3] = new ProductionStaff("linh", "1/9/1999", "vn", 20);
        list[4] = new DailyWorker("thao", "5/9/1999", "vn", 5);
        list[5] = new DailyWorker("le", "6/9/1999", "vn", 9);
    }

    @Override
    public void display() {
        for (Person item : list) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }

    @Override
    public void displayQuanLy() {
        for (Person item : list) {
            if (item instanceof Management) {
                System.out.println(item);
            }
        }
    }

    @Override
    public void displayCongNhat() {
        for (Person item : list) {
            if (item instanceof ProductionStaff) {
                System.out.println(item);
            }
        }
    }

    @Override
    public void displaySanXuat() {
        for (Person item : list) {
            if (item instanceof DailyWorker) {
                System.out.println(item);
            }
        }
    }
}
