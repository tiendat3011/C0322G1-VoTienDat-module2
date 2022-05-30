package case_study.models.facility;

public class Room extends Facility {
    private String serviceFree;

    public Room() {
    }

    public Room(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    public Room(String idFacility,
                String nameService,
                int usableArea,
                int cost,
                int maxPeople,
                String rentalType,
                String serviceFree) {
        super(idFacility, nameService, usableArea, cost, maxPeople, rentalType);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Room{" +
                "serviceFree='" + serviceFree + '\'' +
                '}';
    }
    public String getLine(){
        return super.toString()+ "," +serviceFree;
    }

}