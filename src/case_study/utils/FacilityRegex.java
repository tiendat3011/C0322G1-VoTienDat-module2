package case_study.utils;

import case_study.models.facility.Facility;
import case_study.utils.exception.*;

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
        boolean check = true;
        String name = null;
        while (check) {
            name = scanner.nextLine();
            try {
                if (name.matches(FIRST_CHARACTER_UPPER)) {
                    check = false;
                } else {
                    throw new NameException("NHập sai định dạng, chữ cái đầu phải viết hoa");
                }
            } catch (NameException e) {
                System.out.println(e.getMessage());
            }
        }
        return name;
    }

    public static String rentType() {
        boolean check = true;
        String rentType = null;
        while (check) {
            rentType = scanner.nextLine();
            try {
                if (rentType.matches(RENT_TYPE)) {
                    check = false;
                } else {
                    throw new RentTypeException("Thuê theo Ngày | Tháng | Năm >>?");
                }
            } catch (RentTypeException e) {
                System.out.println(e.getMessage());
            }
        }
        return rentType;
    }

    public static String standardService() {
        boolean check = true;
        String standardService = null;
        while (check) {
            standardService = scanner.nextLine();
            try {
                if (standardService.matches(FIRST_CHARACTER_UPPER)) {
                    check = false;
                } else {
                    throw new StandardServiceException("Chữ cái đầu phải viết hoa");
                }
            } catch (StandardServiceException e) {
                System.out.println(e.getMessage());
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
        boolean check = true;
        int floor = 0;
        while (check) {
            try {
                floor = Integer.parseInt(scanner.nextLine());
                if (floor > 0) {
                    check = false;
                } else {
                    throw new FloorException("số tầng lớn hơn 0");
                }
            } catch (NumberFormatException | FloorException e) {
                System.err.println("Nhập sai định dạng");
            }
        }
        return floor;
    }

    public static double areaUse() {
        boolean check = true;
        double areaUse = 0;
        while (check) {
            try {
                areaUse = Double.parseDouble(scanner.nextLine());
                if (areaUse > 30) {
                    check = false;
                } else {
                    throw new AreaUseException("Lớn hơn 30m2");
                }
            } catch (AreaUseException e) {
                System.out.println(e.getMessage());
            }
        }
        return areaUse;
    }

    public static int feeRent() {
        boolean check = true;
        int feeRent = 0;
        while (check) {
            try {
                feeRent = Integer.parseInt(scanner.nextLine());
                if (feeRent > 0) {
                    check = false;
                } else {
                    throw new FeeRentException("chi phí thuê > 0");
                }
            } catch (FeeRentException e) {
                System.out.println(e.getMessage());
            }
        }
        return feeRent;
    }

    public static int maximumCustomer() {
        boolean check = true;
        int maximumCustomer = 0;
        while (check) {
            try {
                maximumCustomer = Integer.parseInt(scanner.nextLine());
                if (maximumCustomer > 0 && maximumCustomer < 20) {
                    check = false;
                } else {
                    throw new MaximumCustomerException("số người tối đa lớn hơn 0 và bé hơn 20");
                }
            } catch (MaximumCustomerException e) {
                System.out.println(e.getMessage());
            }
        }
        return maximumCustomer;
    }

    public static double sizePool() {
        boolean check = true;
        double sizePool = 0;
        while (check) {
            try {
                sizePool = Double.parseDouble(scanner.nextLine());
                if (sizePool > 30) {
                    check = false;
                } else {
                    throw new SizePoolException("nhỏ nhất là 30m2");
                }
            } catch (SizePoolException e) {
                System.out.println(e.getMessage());

            }
        }
        return sizePool;
    }

    public static String freeService() {
        boolean check = true;
        String freeService = null;
        while (check) {
            freeService = scanner.nextLine();
            try {
                if (freeService.matches(FIRST_CHARACTER_UPPER)) {
                    check = false;
                } else {
                    throw new FreeServiceException("Chữ cái đầu phải viết hoa");
                }
            } catch (FreeServiceException e) {
                System.out.println(e.getMessage());
            }
        }
        return freeService;
    }
}