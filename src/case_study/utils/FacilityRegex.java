package case_study.utils;

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
        RENT_TYPE = "^(Ngày|Tháng|Năm)$";
    }

    public static String name() {
        String name;
        while (true) {
            name = scanner.nextLine();
            if (name.matches(FIRST_CHARACTER_UPPER)) {
                break;
            } else {
                System.out.println("NHập sai định dạng, chữ cái đầu phải viết hoa");
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
                System.out.println("Thuê theo Ngày | Tháng | Năm >>?");
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
                System.out.println("Chữ cái đầu phải viết hoa");
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
                    System.out.println("nhập sai vd : SVVl-xxxx Villa là VL House là HO Room là RO ");
                }
            }

            for (Map.Entry<Facility, Integer> element : facilityList.entrySet()) {
                if (element.getKey().getId().equals(id)) {
                    check = true;
                    break;
                }
            }
            if (check) {
                System.out.println("ID đã có trong danh sách");
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
                    System.out.println("số tầng lớn hơn 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Nhập sai định dạng");
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
                    System.err.println("bé nhất là 30m2");
                }
            } catch (NumberFormatException e) {
                System.err.println("Nhập sai định dạng");
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
                System.err.println("Nhập sai định dạng");
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
                    System.out.println("số người tối đa lớn hơn 0 và bé hơn 20");
                }
            } catch (NumberFormatException e) {
                System.err.println("Sai định dạng");
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
                    System.out.println("nhỏ nhất là 30m2");
                }
            } catch (NumberFormatException e) {
                System.err.println("Nhập sai định dạng");
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
                System.out.println("Chữ cái đầu phải viết hoa");
            }
        }
        return freeService;
    }
}

