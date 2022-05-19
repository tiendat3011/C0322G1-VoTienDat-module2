package _11_stack_queue.exercise.demerging_queque;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<People> queueMale = new LinkedList<>();
        Queue<People> queueFemale = new LinkedList<>();
        People[] people = new People[5];
        people[0] = new People("Đạt", true, "1/1/1999");
        people[1] = new People("Hà", false, "2/2/1999");
        people[2] = new People("Thảo", false, "3/3/1999");
        people[3] = new People("Hảo", true, "4/4/1999");
        people[4] = new People("Linh", false, "5/5/1999");
        Arrays.sort(people); //xài Arrays.sort để sắp xếp mảng theo thứ tự
        for (People item : people) {
            if (item.getGender()) {//true thi` là nam false thì là nữ
                queueMale.add(item);
            } else {
                queueFemale.add(item);
            }
        }
        for (People item: queueMale) {
            System.out.println(item);
        }
        for (People item:queueFemale) {
            System.out.println(item);
        }
    }
}
