package case_study.models.facility;

public abstract class Facility {
    private String nameService, rentType, standardService, id;
    private int maximumCustomer, floor, feeRent;
    private double areaUse;
    private int maintain = 0;

    public Facility(String nameService,
                    String rentType,
                    double areaUse,
                    int feeRent,
                    int maximumCustomer,
                    String id) {

        this.nameService = nameService;
        this.rentType = rentType;
        this.areaUse = areaUse;
        this.feeRent = feeRent;
        this.maximumCustomer = maximumCustomer;
        this.id = id;
    }

    public Facility(String nameService,
                    String rentType,
                    String standardService,
                    int floor,
                    double areaUse,
                    int feeRent,
                    int maximumCustomer,
                    String id) {
        this.nameService = nameService;
        this.rentType = rentType;
        this.standardService = standardService;
        this.floor = floor;
        this.areaUse = areaUse;
        this.feeRent = feeRent;
        this.maximumCustomer = maximumCustomer;
        this.id = id;
    }

    public int getMaintain() {
        return maintain;
    }

    public void setMaintain(int maintain) {
        this.maintain = maintain;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public String getStandardService() {
        return standardService;
    }

    public void setStandardService(String standardService) {
        this.standardService = standardService;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public double getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(double areaUse) {
        this.areaUse = areaUse;
    }

    public int getFeeRent() {
        return feeRent;
    }

    public void setFeeRent(int feeRent) {
        this.feeRent = feeRent;
    }

    public int getMaximumCustomer() {
        return maximumCustomer;
    }

    public void setMaximumCustomer(int maximumCustomer) {
        this.maximumCustomer = maximumCustomer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "[" +
                "nameService = " + nameService + '\'' +
                ", rentType = " + rentType + '\'' +
                ", areaUse = " + areaUse +
                ", feeRent = " + feeRent +
                ", maximumCustomer = " + maximumCustomer +
                ", id = " + id;
    }

    public abstract String getLine();
}