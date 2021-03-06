package case_study.services.impl;

import case_study.models.facility.Facility;
import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;
import case_study.services.FacilityService;
import case_study.utils.FacilityRegex;
import case_study.utils.ReadAndWrite;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    public Scanner scanner = new Scanner(System.in);
    public LinkedHashMap<Facility, Integer> facilityList = getFacilityList();

    public LinkedHashMap<Facility, Integer> getFacilityList() {
        facilityList = new LinkedHashMap<>();
        List<String[]> list = ReadAndWrite.read("src\\case_study\\data\\facility.csv");
        for (String[] item : list) {
            if (item[0].equals("Villa")) {
                facilityList.put(new Villa(item[0],
                                item[1],
                                item[2],
                                Integer.parseInt(item[3]),
                                Double.parseDouble(item[4]),
                                Integer.parseInt(item[5]),
                                Integer.parseInt(item[6]),
                                item[7],
                                Double.parseDouble(item[8])),
                        Integer.parseInt(item[9]));
            } else if (item[0].equals("House")) {
                facilityList.put(new House(item[0],
                                item[1],
                                item[2],
                                Integer.parseInt(item[3]),
                                Double.parseDouble(item[4]),
                                Integer.parseInt(item[5]),
                                Integer.parseInt(item[6]),
                                item[7]),
                        Integer.parseInt(item[8]));
            } else if (item[0].equals("Room")) {
                facilityList.put(new Room(item[0],
                                item[1],
                                Double.parseDouble(item[2]),
                                Integer.parseInt(item[3]),
                                Integer.parseInt(item[4]),
                                item[5],
                                item[6]),
                        Integer.parseInt(item[7]));
            }
        }
        return facilityList;
    }

    public Facility create(String nameSv, LinkedHashMap<Facility, Integer> facilityList) {

        System.out.println("Nh???p t??n dv");
        String name = FacilityRegex.name();

        System.out.println("Nh???p ki???u thu??");
        String rentType = FacilityRegex.rentType();

        System.out.println("Nh???p di???n t??ch s??? d???ng");
        double areaUse = FacilityRegex.areaUse();

        System.out.println("Nh???p chi ph?? thu??");
        int feeRent = FacilityRegex.feeRent();

        System.out.println("Nh???p s??? ng?????i t???i ??a");
        int maximumCustomer = FacilityRegex.maximumCustomer();

        if (nameSv.equals("Villa")) {
            System.out.println("Nh???p id facility");
            String id = FacilityRegex.id(facilityList, nameSv);

            System.out.println("Nh???p di???n t??ch h??? b??i");
            double sizePool = FacilityRegex.sizePool();

            System.out.println("Nh???p s??? t???ng");
            int floor = FacilityRegex.floor();

            System.out.println("Nh???p ti??u chu???n ph??ng");
            String standardService = FacilityRegex.standardService();

            Villa villa = new Villa(name, rentType, standardService, floor, areaUse, feeRent, maximumCustomer, id, sizePool);
            return villa;
        } else if (nameSv.equals("House")) {
            System.out.println("Nh???p id facility");
            String id = FacilityRegex.id(facilityList, nameSv);

            System.out.println("Nh???p s??? t???ng");
            int floor = FacilityRegex.floor();

            System.out.println("Nh???p ti??u chu???n ph??ng");
            String standardService = FacilityRegex.standardService();

            House house = new House(name, rentType, standardService, floor, areaUse, feeRent, maximumCustomer, id);
            return house;
        } else {
            System.out.println("Nh???p id facility");
            String id = FacilityRegex.id(facilityList, nameSv);

            System.out.println("Nh???p d???ch v??? mi???n ph??");
            String freeSv = FacilityRegex.freeService();

            Room room = new Room(name, rentType, areaUse, feeRent, maximumCustomer, id, freeSv);
            return room;
        }
    }

    @Override
    public void display() {
        facilityList = getFacilityList();
        try {
            for (Map.Entry<Facility, Integer> element : facilityList.entrySet()) {
                System.out.println(element.getKey() + ", s??? l???n thu?? = " + element.getValue() + "]");
            }
        } catch (Exception e) {
            System.out.println("");
        }
    }

    @Override
    public void displayMaintain() {
        facilityList = getFacilityList();
        System.out.println("--------------Maintain facility ---------------");
        for (Map.Entry<Facility, Integer> element : facilityList.entrySet()) {
            if (element.getValue() >= 5) {
                System.out.println(element.getKey() + ", s??? l???n thu?? = " + element.getValue() + "\n C???n b???o tr??]");
            } else {
                System.out.println("Kh??ng c???n b???o tr??");
            }
        }
    }

    @Override
    public void addNewVilla() {
        facilityList = getFacilityList();
        Villa villa = (Villa) create("Villa", facilityList);

        ReadAndWrite.write("src\\case_study\\data\\facility.csv", villa.getLine() + ",0");
        ReadAndWrite.write("src\\case_study\\data\\villa.csv", villa.getLine() + ",0");
        System.out.println("th??m th??nh c??ng");
    }

    @Override
    public void addNewHouse() {
        facilityList = getFacilityList();
        House house = (House) create("House", facilityList);

        ReadAndWrite.write("src\\case_study\\data\\facility.csv", house.getLine() + ",0");
        ReadAndWrite.write("src\\case_study\\data\\house.csv", house.getLine() + ",0");
        System.out.println("th??m th??nh c??ng");
    }

    @Override
    public void addNewRoom() {
        Room room = (Room) create("Room", facilityList);
        ReadAndWrite.write("src\\case_study\\data\\facility.csv", room.getLine() + ",0");
        ReadAndWrite.write("src\\case_study\\data\\room.csv", room.getLine() + ",0");

        System.out.println("th??m th??nh c??ng");
    }
}