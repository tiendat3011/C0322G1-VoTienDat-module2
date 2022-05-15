package homework.controllers;

import homework.services.impl.StudentImpl;
import homework.services.impl.TeacherImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println(" Management program  ");
            System.out.println("1: Teacher ");
            System.out.println("2: Student ");
            System.out.println("3: Exit ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");
                ;
            }
            switch (choice) {
                case 1:
                    teacher();
                    break;
                case 2:
                    student();
                    break;
                case 3:
                    System.exit(4);
            }
        }
    }

    private static void student() {
        StudentImpl student = new StudentImpl();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println(" Management Student  ");
            System.out.println("1: Add new ");
            System.out.println("2: Delete ");
            System.out.println("3: Display ");
            System.out.println("4: Find ");
            System.out.println("5: Exit Menu ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");
                ;
            }
            switch (choice) {
                case 1:
                    student.addNew();
                    break;
                case 2:
                    student.delete();
                    break;
                case 3:
                    student.display();
                    break;
                case 4:
                    student.find();
                    break;
                case 5:
                    return;
            }
        }
    }

    private static void teacher() {
        TeacherImpl teacher = new TeacherImpl();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println(" Management Teacher  ");
            System.out.println("1: Add new ");
            System.out.println("2: Delete ");
            System.out.println("3: Display ");
            System.out.println("4: Find ");
            System.out.println("5: Exit Menu ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");
                ;
            }
            switch (choice) {
                case 1:
                    teacher.addNew();
                    break;
                case 2:
                    teacher.delete();
                    break;
                case 3:
                    teacher.display();
                    break;
                case 4:
                    teacher.find();
                    break;
                case 5:
                    return;
            }
        }
    }
}

