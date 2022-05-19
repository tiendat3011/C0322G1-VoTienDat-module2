package _11_stack_queue.exercise.reverse_array1;

import java.util.Stack;

public class ReverseCharacter {
    public static void main(String[] args) {
        Stack<Character> characters = new Stack<>();
        String string = "abcdef";
        System.out.println("Chuỗi:");
        System.out.println(string);
        for (Character item : string.toCharArray()) {
            characters.push(item);
        }
        System.out.println("Đảo ngược chuỗi: ");
        for (int i = 0; i < string.length(); i++) {
            System.out.print(characters.pop());
        }
    }
}

