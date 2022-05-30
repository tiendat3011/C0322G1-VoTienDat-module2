package case_study.models.facility;

public class House extends Facility {
    private int roomStandardHouse;
    private int numberFloorsHouse;

    public House() {
    }

    public House(int roomStandardHouse, int numberFloorsHouse) {
        this.roomStandardHouse = roomStandardHouse;
        this.numberFloorsHouse = numberFloorsHouse;
    }

    public House(String idFacility,
                 String nameService,
                 int usableArea,
                 int cost,
                 int maxPeople,
                 String rentalType,
                 int roomStandardHouse,
                 int numberFloorsHouse) {
        super(idFacility, nameService, usableArea, cost, maxPeople, rentalType);
        this.roomStandardHouse = roomStandardHouse;
        this.numberFloorsHouse = numberFloorsHouse;
    }

    public int getRoomStandardHouse() {
        return roomStandardHouse;
    }

    public void setRoomStandardHouse(int roomStandardHouse) {
        this.roomStandardHouse = roomStandardHouse;
    }

    public int getNumberFloorsHouse() {
        return numberFloorsHouse;
    }

    public void setNumberFloorsHouse(int numberFloorsHouse) {
        this.numberFloorsHouse = numberFloorsHouse;
    }

    @Override
    public String toString() {
        return super.toString()+
                "House{" +
                "roomStandardHouse=" + roomStandardHouse +
                ", numberFloorsHouse=" + numberFloorsHouse +
                '}';
    }
    public String getLine(){
        return super.toString()+ "," +roomStandardHouse+ "," +numberFloorsHouse;
    }
}