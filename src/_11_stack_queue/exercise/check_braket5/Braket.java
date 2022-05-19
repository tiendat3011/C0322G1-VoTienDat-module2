package _11_stack_queue.exercise.check_braket5;

import java.util.Scanner;
import java.util.Stack;

public class Braket {
    public static void main(String[] args) {
        Stack<Character> bStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào biểu thức: ");
        String string = scanner.nextLine();
        char left = ' '; // kí tự thì xài '' string thì xài ""
        boolean flag = true;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(') {
                bStack.push(string.charAt(i));
            } else if (string.charAt(i) == ')') {
                if (bStack.empty()) {
                    flag = false;
                    System.out.println("False");
                    break;
                }
                left = bStack.pop();
            }
        }
        if (flag&&bStack.isEmpty()) {//nếu rỗng thì true
            System.out.println("True");
        }else if (!bStack.isEmpty()){
            System.out.println("False");
        }
    }
}