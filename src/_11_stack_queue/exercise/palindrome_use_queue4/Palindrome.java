package _11_stack_queue.exercise.palindrome_use_queue4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        //Able was I ere I saw Elba
        Stack<String> stack = new Stack<>();

        Queue<String> queue = new LinkedList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String string = input.nextLine();
        String[] array = string.toLowerCase().split("");//tách chuỗi ra từng kí tự để kiểm tra

        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
            queue.add(array[i]);
        }
        System.out.println(stack);
        System.out.println(queue);
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            if (!stack.pop().equals(queue.poll())) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}