package _11_stack_queue.exercise.reverse_array1;

import java.util.Stack;

public class ReverseIntegers {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.print("Mảng số nguyên: ");
        for (Integer item : numbers) {
            System.out.printf("%d ", item); //String format %d dùng để dịnh dạng các số nguyên, (d số nguyên, s chuỗi)
        }
        System.out.println();
        System.out.print("Mảng sau khi đảo ngược: ");
        for (Integer item : numbers) {
            integerStack.push(item);// đưa các pt vào stack thông qua push
        }
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = integerStack.pop();
        }
        for (Integer item : numbers) {
            System.out.printf("%d ", item);
        }
    }
}