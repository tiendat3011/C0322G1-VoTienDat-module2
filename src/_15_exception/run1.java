package _15_exception;

import java.util.Arrays;
import java.util.Scanner;

public class run1 {
    public static void main(String[] args) {
//        NullPointerException
//        int[] a = null;
//        System.out.println(a[6]);
//        System.out.println();
//
//        ArithmeticException
//        int b = 5;
//        int c = 0;
//        int d = b/c;
//        System.out.println(d);
//
//        ArrayIndexOutOfBoundsException
//        int[] arr = {1,2,3,4,5};
//        System.out.println(arr[5]);

        Scanner scanner = new Scanner(System.in);
        int[] arr={1,2,3,4,5};
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println(Arrays.toString(arr));

    }
}
