package big_exercise.services.impl;

import big_exercise.models.DailyWorker;
import big_exercise.models.Management;
import big_exercise.models.Person;
import big_exercise.models.ProductionStaff;
import big_exercise.services.Servicee;

import java.util.ArrayList;

public class ArrayListImpl implements Servicee {
    static ArrayList<Person> arrayList = new ArrayList<>();

    static {
        arrayList.add(new Management("dat", "29/11/1999", "vn", 10000, 1.5));
        arrayList.add(new Management("hao", "9/11/1999", "vn", 15000, 2.2));
        arrayList.add(new ProductionStaff("ha", "1/2/1999", "vn", 15));
        arrayList.add(new ProductionStaff("linh", "1/9/1999", "vn", 20));
        arrayList.add(new DailyWorker("thao", "5/9/1999", "vn", 5));
        arrayList.add(new DailyWorker("le", "6/9/1999", "vn", 9));
    }

    @Override
    public void display() {
        for (Person item : arrayList) {
            System.out.println(item);
        }
    }

    @Override
    public void displayQuanLy() {
        for (Person item : arrayList) {
            if (item instanceof Management) {
                System.out.println(item);
            }
        }
    }

    @Override
    public void displayCongNhat() {
        for (Person item : arrayList) {
            if (item instanceof ProductionStaff) {
                System.out.println(item);
            }
        }
    }

    @Override
    public void displaySanXuat() {
        for (Person item : arrayList) {
            if (item instanceof DailyWorker) {
                System.out.println(item);
            }
        }
    }
}
