package big_exercise.services.impl;

import big_exercise.models.DailyWorker;
import big_exercise.models.Management;
import big_exercise.models.Person;
import big_exercise.models.ProductionStaff;
import big_exercise.services.Servicee;

import java.util.Map;
import java.util.TreeMap;

public class MapImpl implements Servicee {
    private static Map<Integer, Person> personMap = new TreeMap<>();
    static {
        personMap.put(1,new Management("dat", "29/11/1999", "vn", 10000, 1.5));
        personMap.put(5,new Management("hao", "9/11/1999", "vn", 15000, 2.2));
        personMap.put(2,new ProductionStaff("ha", "1/2/1999", "vn", 15));
        personMap.put(11,new ProductionStaff("linh", "1/9/1999", "vn", 20));
        personMap.put(4,new DailyWorker("thao", "5/9/1999", "vn", 5));
        personMap.put(3,new DailyWorker("le", "6/9/1999", "vn", 9));
    }

    @Override
    public void display() {
        // entryset trả về danh sách cặp key value trong mapx`
        for (Map.Entry<Integer,Person> item: personMap.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue());
        }
    }

    @Override
    public void displayQuanLy() {

    }

    @Override
    public void displayCongNhat() {

    }

    @Override
    public void displaySanXuat() {

    }

    @Override
    public void sapXepLuongTang() {

    }

    @Override
    public void sapXepTenTang() {

    }
}
