package case_study.models.facility;

public class Villa extends Facility {
    private String roomStandardVilla;
    private int poolArea;
    private int numberFloorsVilla;

    public Villa() {
    }
    public Villa(String roomStandardVilla, int poolArea, int numberFloorsVilla) {
        this.roomStandardVilla = roomStandardVilla;
        this.poolArea = poolArea;
        this.numberFloorsVilla = numberFloorsVilla;
    }

    public Villa(String idFacility,
                 String nameService,
                 int usableArea,
                 int cost,
                 int maxPeople,
                 String rentalType,
                 String roomStandardVilla,
                 int poolArea,
                 int numberFloorsVilla) {
        super(idFacility, nameService, usableArea, cost, maxPeople, rentalType);
        this.roomStandardVilla = roomStandardVilla;
        this.poolArea = poolArea;
        this.numberFloorsVilla = numberFloorsVilla;
    }

    public String getRoomStandardVilla() {
        return roomStandardVilla;
    }

    public void setRoomStandardVilla(String roomStandardVilla) {
        this.roomStandardVilla = roomStandardVilla;
    }

    public int getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(int poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberFloorsVilla() {
        return numberFloorsVilla;
    }

    public void setNumberFloorsVilla(int numberFloorsVilla) {
        this.numberFloorsVilla = numberFloorsVilla;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Villa" +
                "roomStandardVilla='" + roomStandardVilla + '\'' +
                ", poolArea=" + poolArea +
                ", numberFloorsVilla=" + numberFloorsVilla ;
    }
    public String getLine(){
        return super.toString()+ "," +roomStandardVilla+ "," +poolArea+ "," +numberFloorsVilla;
    }
}