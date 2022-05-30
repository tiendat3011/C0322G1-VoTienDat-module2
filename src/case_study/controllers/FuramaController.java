package case_study.controllers;

import case_study.services.impl.CustomerServiceimpl;
import case_study.services.impl.EmployeeServiceimpl;
import case_study.services.impl.FacilityServiceimpl;

import java.io.IOException;
import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) throws IOException {
        displayMainMenu();
    }

    public static void displayMainMenu() throws IOException {
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1: Employee Management ");
            System.out.println("2: Customer Management ");
            System.out.println("3: Facility Management ");
            System.out.println("4: Booking Management ");
            System.out.println("5: Promotion Management ");
            System.out.println("6: Exit ");

            Scanner input = new Scanner(System.in);
            try {
                 choice = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng vui lòng nhập lại: ");
            }
            switch (choice) {
                case 1:
                    displayEmployee();
                    break;
                case 2:
                    displayCustomer();
                    break;
                case 3:
                    displayFacility();
                    break;
                case 4:
                    displayBooking();
                    break;
                case 5:
                    displayPromotion();
                    break;
                case 6:
                    System.exit(6);
            }
        }
    }

    public static void displayEmployee() throws IOException {
        EmployeeServiceimpl employeeServiceimpl = new EmployeeServiceimpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1: Display list employees ");
            System.out.println("2: Add new employee ");
            System.out.println("3: Edit employee ");
            System.out.println("4: Return main menu ");

            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng vui lòng nhập lại: ");
            }
            switch (choice) {
                case 1: {
                    employeeServiceimpl.display();
                    break;
                }
                case 2: {
                    employeeServiceimpl.addNew();
                    break;
                }
                case 3:
                    employeeServiceimpl.edit();
                case 4:
                    return;
            }
        }
    }


    public static void displayCustomer() throws IOException {
        CustomerServiceimpl customerServiceimpl = new CustomerServiceimpl();
        boolean check = true;
        int choice= 0;
        while (check) {
            System.out.println("1: Display list customers ");
            System.out.println("2: Add new customers ");
            System.out.println("3: Edit customers ");
            System.out.println("4: Return main menu ");

            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng vui lòng nhập lại: ");
            }
            switch (choice) {
                case 1: {
                    customerServiceimpl.display();
                    break;
                }
                case 2: {
                    customerServiceimpl.addNew();
                    break;
                }
                case 3: {
                    customerServiceimpl.edit();
                    break;
                }
                case 4: {
                    return;
                }
            }
        }
    }

    public static void displayFacility() throws IOException {
        FacilityServiceimpl facilityServiceimpl = new FacilityServiceimpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1: Display list facility ");
            System.out.println("2: Add new facility ");
            System.out.println("3: Display list facility maintenance ");
            System.out.println("4: Return main menu ");

            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng vui lòng nhập lại: ");
            }
            switch (choice) {
                case 1: {
                    facilityServiceimpl.display();
                    break;
                }
                case 2: {
                    addNewFacility();
                    break;
                }
                case 3: {
                }
                case 4: {
                    return;
                }
            }
        }
    }

    public static void addNewFacility() throws IOException {
        FacilityServiceimpl facilityServiceimpl = new FacilityServiceimpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1: Add new House");
            System.out.println("2: Add new Room ");
            System.out.println("3: Add new Villa ");
            System.out.println("4: Return main menu ");

            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng vui lòng nhập lại: ");
            }
            switch (choice) {
                case 1: {
                    facilityServiceimpl.addNewHouse();
                    displayFacility();
                }
                case 2: {
                    facilityServiceimpl.addNewRoom();
                    displayFacility();
                }
                case 3: {
                    facilityServiceimpl.addNewVilla();
                    displayFacility();
                }
                case 4: {
                    return;

                }
            }
        }
    }

    public static void displayBooking() {
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1: Add new booking ");
            System.out.println("2: Display list booking ");
            System.out.println("3: Create new constracts ");
            System.out.println("4: Display list constracts");
            System.out.println("5: Edit constracts ");
            System.out.println("6: Return main menu ");

            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng vui lòng nhập lại: ");
            }
            switch (choice) {
                case 1: {

                }
            }
        }
    }

    public static void displayPromotion() {
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1: Display list customers use service ");
            System.out.println("2: Display list customers get voucher ");
            System.out.println("3: Return main menu ");

            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng vui lòng nhập lại: ");
            }
            switch (choice) {
                case 1: {

                }
            }
        }
    }
}
