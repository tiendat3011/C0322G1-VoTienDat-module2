package _15_exception;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Nhập 3 cạnh tam giác");

                System.out.println("Nhập  cạnh 1 tam giác");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập  cạnh 2 tam giác");
                int b = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập  cạnh 3 tam giác");
                int c = Integer.parseInt(scanner.nextLine());
                check(a, b, c);
                break;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Không được nhập chữ");
            }
        }
    }

    private static void check(int a, int b, int c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException("số âm không phải là cạnh của tam giác");
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Tổng 2 cạnh bé hơn cạnh còn lại. mời nhập lại");
        } else {
            System.out.println("3 cạnh là tam giác");
        }
    }
}


