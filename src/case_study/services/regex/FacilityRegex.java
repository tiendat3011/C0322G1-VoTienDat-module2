package case_study.services.regex;

import case_study.models.facility.Facility;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityRegex {
    public static final String VILLA, HOUSE, ROOM, FIRST_CHARACTER_UPPER, RENT_TYPE;
    public static Scanner scanner = new Scanner(System.in);

    static {
        VILLA = "^SVVL-[0-9]{4}$";
        HOUSE = "^SVHO-[0-9]{4}$";
        ROOM = "^SVRO-[0-9]{4}$";
        FIRST_CHARACTER_UPPER = "^[A-Z][\\w]+$";
        RENT_TYPE = "^(Ngay|Thang|Nam)$";
    }

    public static String name() {
        String name;
        while (true) {
            name = scanner.nextLine();
            if (name.matches(FIRST_CHARACTER_UPPER)) {
                break;
            } else {
                System.out.println("Your format is wrong");
            }
        }
        return name;
    }

    public static String rentType() {
        String rentType;
        while (true) {
            rentType = scanner.nextLine();
            if (rentType.matches(RENT_TYPE)) {
                break;
            } else {
                System.out.println("Thuê theo ngày , tháng ho?c n?m ?");
            }
        }
        return rentType;
    }

    public static String standardService() {
        String standardService;
        while (true) {
            standardService = scanner.nextLine();
            if (standardService.matches(FIRST_CHARACTER_UPPER)) {
                break;
            } else {
                System.out.println("Ch? ??u ph?i vi?t hoa");
            }
        }
        return standardService;
    }

    public static String id(LinkedHashMap<Facility, Integer> facilityList, String name) {
        if (name.equals("Villa")) {
            name = VILLA;
        } else if (name.equals("House")) {
            name = HOUSE;
        } else {
            name = ROOM;
        }

        String id;
        boolean check = true;
        while (check) {
            check = false;
            while (true) {
                id = scanner.nextLine();
                if (id.matches(name)) {
                    break;
                } else {
                    System.out.println("nh?p sai vd : SVVl-xxxx Villa là VL House là HO Room là RO ");
                }
            }

            for (Map.Entry<Facility, Integer> element : facilityList.entrySet()) {
                if (element.getKey().getId().equals(id)) {
                    check = true;
                    break;
                }
            }
            if (check) {
                System.out.println("Your is already in list");
            } else {
                return id;
            }
        }
        return "";
    }

    public static int floor() {
        int floor;
        while (true) {
            try {
                floor = Integer.parseInt(scanner.nextLine());
                if (floor > 0) {
                    break;
                } else {
                    System.out.println("s? t?ng l?n h?n 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");
                ;
            }
        }
        return floor;
    }

    public static double areaUse() {
        double areaUse;
        while (true) {
            try {
                areaUse = Double.parseDouble(scanner.nextLine());
                if (areaUse > 30) {
                    break;
                } else {
                    System.err.println("bé nh?t là 30m2");
                }
            } catch (NumberFormatException e) {
                System.err.println("Nhâp sai ??nh d?ng");
            }
        }
        return areaUse;
    }

    public static int feeRent() {
        int feeRent;
        while (true) {
            try {
                feeRent = Integer.parseInt(scanner.nextLine());
                if (feeRent > 0) {
                    break;
                } else {
                    System.out.println("chi phí thuê > 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Nh?p sai ??nh d?ng");
            }
        }
        return feeRent;
    }

    public static int maximumCustomer() {
        int maximumCustomer;
        while (true) {
            try {
                maximumCustomer = Integer.parseInt(scanner.nextLine());
                if (maximumCustomer > 0 && maximumCustomer < 20) {
                    break;
                } else {
                    System.out.println("S? ng??i t?i ?a l?n h?n 0 và bé h?n 20");
                }
            } catch (NumberFormatException e) {
                System.err.println("Sai ??nh d?ng");
                ;
            }
        }
        return maximumCustomer;
    }

    public static double sizePool() {
        double sizePool;
        while (true) {
            try {
                sizePool = Double.parseDouble(scanner.nextLine());
                if (sizePool > 30) {
                    break;
                } else {
                    System.out.println("Minimum size is 30m2");
                }
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");
                ;
            }
        }
        return sizePool;
    }

    public static String freeService() {
        String freeService;
        while (true) {
            freeService = scanner.nextLine();
            if (freeService.matches(FIRST_CHARACTER_UPPER)) {
                break;
            } else {
                System.out.println("Input wrong format");
            }
        }
        return freeService;
    }
}

