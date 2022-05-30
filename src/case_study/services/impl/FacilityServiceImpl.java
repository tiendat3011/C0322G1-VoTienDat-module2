package case_study.services.impl;

import case_study.models.facility.Facility;
import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;
import case_study.services.FacilityService;
import case_study.utils.ReadAndWrite;
import case_study.utils.RegexData;

import java.io.IOException;
import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    //triển khai Implemen
    public static final String REGEX_STR = "[A-Z][a-z]+";
    public static final String REGEX_ID_VILLA = "(SVVL)[-][\\d]{4}";
    public static final String REGEX_ID_HOUSE = "(SVHO)[-][\\d]{4}";
    public static final String REGEX_ID_ROOM = "(SVRO)[-][\\d]{4}";
    public static final String REGEX_AMOUNT = "^[1-9]|([1][0-9])|(20)$";
    public static final String REGEX_INT = "^[1-9]|([1][0-9])$";
    public static final String REGEX_AREA = "^[3-9]\\d|[1-9]\\d{2,}$";

    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    public Scanner scanner = new Scanner(System.in);
    public Map<Facility,Integer>getFacilityIntegerMap() {
        return facilityIntegerMap;
    }

    @Override
    public void display() throws IOException {
//        facilityIntegerMap.clear();
        Villa villa;
        List<String[]> listStrVl = ReadAndWrite.readFile("src\\case_study\\data\\Villa.csv");
        for (String[] item : listStrVl) {
            villa = new Villa(item[0],
                    item[1],
                    Integer.parseInt(item[2])
                    , Integer.parseInt(item[3]),
                    Integer.parseInt(item[4]),
                    item[5],
                    item[6],
                    Integer.parseInt(item[7]),
                    Integer.parseInt(item[8]));
            System.out.println(villa);
        }
        House house;
        List<String[]> listStrHo = ReadAndWrite.readFile("src\\case_study\\data\\House.csv");
        for (String[] item : listStrHo) {
            house = new House(item[0], item[1], Integer.parseInt(item[2]), Integer.parseInt(item[3]), Integer.parseInt(item[4]),
                    item[5], Integer.parseInt(item[6]), Integer.parseInt(item[7]));
            System.out.println(house);
        }
        Room room;
        List<String[]> listStrRo = ReadAndWrite.readFile("src\\case_study\\data\\House.csv");
        for (String[] item : listStrRo) {
            room = new Room(item[0], item[1], Integer.parseInt(item[2]), Integer.parseInt(item[3]), Integer.parseInt(item[4]),
                    item[5], item[6]);
            System.out.println(room);
        }
        for (Map.Entry<Facility,Integer> item: facilityIntegerMap.entrySet()) {
            System.out.println(item.getKey()+ " Số lần thuê " + item.getValue());
        }
    }


    @Override
    public void displayMaintain() {
    }

    @Override
    public void addNewVilla() {

        String idFacility = inputIDVL();
        String nameService = inputName();
        int usableArea = Integer.parseInt(inputAREA());
        int cost = Integer.parseInt(inputTotalPay());
        int maxPeople = Integer.parseInt(inputPeople());
        String rentalType = inputRentalType();
        String roomStandardVilla = inputStandardVilla();
        int poolArea = Integer.parseInt(inputUsePool());
        int numberFloorsVilla = Integer.parseInt(inputFloorsVilla());
        Villa villa = new Villa(idFacility,
                nameService,
                usableArea,
                cost,
                maxPeople,
                rentalType,
                roomStandardVilla,
                poolArea,
                numberFloorsVilla);
        facilityIntegerMap.put(villa, 0);
        String line = idFacility + "," + nameService + "," + usableArea + "," + cost + "," + maxPeople + "," + rentalType + "," + roomStandardVilla + "," + poolArea + "," + numberFloorsVilla;
        ReadAndWrite.writeFile("src\\case_study\\data\\Villa.csv", villa.getLine() + "0");
        System.out.println("Da them villa thanh cong");
    }

    private String inputIDVL() {
        System.out.println("Nhập ID");
        return RegexData.regexStr(scanner.nextLine(), REGEX_ID_VILLA, "Bạn đã nhập sai định dạng, định dạng đúng là SVXX-YYYY. Villa là VL, " + " House  là HO, " + " Room là RO ");
    }

    private String inputName() {
        System.out.println("Nhập tên dịch vụ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_STR, "Bạn đã nhập sai định dạng, Tên dịch vụ phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường ");
    }

    private String inputAREA() {
        System.out.println("Nhập diện tích");
        return RegexData.regexStr(scanner.nextLine(), REGEX_AREA, "Bạn đã nhập sai định dạng, Diện tích sử dụng và diện tích hồ bơi phải là số thực lớn hơn 30m2 ");
    }

    private String inputTotalPay() {
        System.out.println("Nhập giá tiền");
        return RegexData.regexStr(scanner.nextLine(), REGEX_INT, "Bạn đã nhập sai định dạng, Giá tiền  phải là số dương ");
    }

    private String inputPeople() {
        System.out.println("Số người tối đa");
        return RegexData.regexStr(scanner.nextLine(), REGEX_AMOUNT, "Số lượng người tối đa phải >0 và nhỏ hơn <20");
    }

    private String inputRentalType() {
        System.out.println("Nhập kiểu thuê: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_STR, "Bạn đã nhập sai định dạng, Kiểu thuê  chuẩn hóa dữ liệu giống tên dịch vụ ");
    }

    private String inputStandardVilla() {
        System.out.println("Nhập tiêu chuẩn phòng: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_STR, "Bạn đã nhập sai định dạng, Tiêu chuẩn phòng chuẩn hóa dữ liệu giống tên dịch vụ ");
    }

    private String inputUsePool() {
        System.out.println("Nhập diện tích hồ bơi");
        return RegexData.regexStr(scanner.nextLine(), REGEX_AREA, "Bạn đã nhập sai định dạng, Diện tích sử dụng và diện tích hồ bơi phải là số thực lớn hơn 30m2  ");
    }

    private String inputFloorsVilla() {
        System.out.println("Nhập số tầng: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_INT, "Bạn đã nhập sai định dạng, Số tầng phải là số nguyên dương.");
    }

    @Override
    public void addNewHouse() {
//        System.out.println("Nhập Id Facility");
        String idFacility = inputIDHO();

        System.out.println("Nhập tên Service");
        String nameService = scanner.nextLine();

        System.out.println("Nhập diện tích sử dụng");
        int usableArea = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập giá tiền");
        int cost = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập số người tối đa");
        int maxPeople = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập kiểu thuê");
        String rentalType = scanner.nextLine();

        System.out.println("Nhập tiêu chuẩn phòng");
        int roomStandardHouse = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập số tầng");
        int numberFloorsHouse = Integer.parseInt(scanner.nextLine());

        House house = new House(idFacility,
                nameService,
                usableArea,
                cost,
                maxPeople,
                rentalType,
                roomStandardHouse,
                numberFloorsHouse);
        facilityIntegerMap.put(house, 0);
        ReadAndWrite.writeFile("src\\case_study\\data\\House.csv", house.getLine() + "0");
        System.out.println("Đã thêm house thành công");
    }

    private String inputIDHO() {
        System.out.println("Nhập ID");
        return RegexData.regexStr(scanner.nextLine(), REGEX_ID_HOUSE, "Bạn đã nhập sai định dạng, định dạng đúng là SVXX-YYYY. Villa là VL, " + " House  là HO, " + " Room là RO ");
    }

    @Override
    public void addNewRoom() {
        System.out.println("Nhập Id Facility");
        String idFacility = inputIDRO();

        System.out.println("Nhập tên Service");
        String nameService = scanner.nextLine();

        System.out.println("Nhập diện tích sử dụng");
        int usableArea = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập giá tiền");
        int cost = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập số người tối đa");
        int maxPeople = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập kiểu thuê");
        String rentalType = scanner.nextLine();

        System.out.println("Nhập Dịch vụ miễn phí");
        String serviceFree = scanner.nextLine();

        Room room = new Room(idFacility,
                nameService,
                usableArea,
                cost,
                maxPeople,
                rentalType,
                serviceFree);
        facilityIntegerMap.put(room, 0);
        ReadAndWrite.writeFile("src\\case_study\\data\\Room.csv",room.getLine() + "0");
        System.out.println("Đã thêm Room thành công");
    }

    private String inputIDRO() {
        System.out.println("Nhập ID");
        return RegexData.regexStr(scanner.nextLine(), REGEX_ID_ROOM, "Bạn đã nhập sai định dạng, định dạng đúng là SVXX-YYYY. Villa là VL, " + " House  là HO, " + " Room là RO ");
    }
}

