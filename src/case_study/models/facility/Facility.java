package case_study.models.facility;

public abstract class Facility {
    private String idFacility;// sua lai
    private String nameService;
    private int usableArea;
    private int cost;
    private int maxPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String idFacility, String nameService, int usableArea, int cost, int maxPeople, String rentalType) {
        this.idFacility = idFacility;
        this.nameService = nameService;
        this.usableArea = usableArea;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.rentalType = rentalType;
    }

    public String getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(String idFacility) {
        this.idFacility = idFacility;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public int getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(int usableArea) {
        this.usableArea = usableArea;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return
                "Facility{" +
                "idFacility=" + idFacility +
                ", nameService='" + nameService + '\'' +
                ", usableArea=" + usableArea +
                ", cost=" + cost +
                ", maxPeople=" + maxPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
    public String getLine(){
        return idFacility+ "," +nameService+ "," +usableArea+ "," +cost+ "," +maxPeople+ "," +rentalType;
    }
}