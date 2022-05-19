package _11_stack_queue.exercise.binary3;

import java.util.Scanner;
import java.util.Stack;

public class Binary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số bất kì ");
        int number = Integer.parseInt(scanner.nextLine());
        while (number > 0) {
            stack.push(number % 2);
            number = number / 2;
        }

        StringBuilder string = new StringBuilder();
        while (!stack.isEmpty()) {
            string.append(stack.pop());
        }

        System.out.println("Dãy nhị phân là " + string);
    }
}
