package case_study.models.facility;

public class Room extends Facility {
    private String freeService;

    public Room(String nameService,
                String rentType,
                double areaUse,
                int feeRent,
                int maximumCustomer,
                String id,
                String freeService) {

        super(nameService, rentType, areaUse, feeRent, maximumCustomer, id);
        this.freeService = freeService;
    }

    @Override
    public int getMaintain() {
        return super.getMaintain();
    }

    @Override
    public void setMaintain(int maintain) {
        super.setMaintain(maintain);
    }

    @Override
    public String getNameService() {
        return super.getNameService();
    }

    @Override
    public void setNameService(String nameService) {
        super.setNameService(nameService);
    }

    @Override
    public String getRentType() {
        return super.getRentType();
    }

    @Override
    public void setRentType(String rentType) {
        super.setRentType(rentType);
    }

    @Override
    public double getAreaUse() {
        return super.getAreaUse();
    }

    @Override
    public void setAreaUse(double areaUse) {
        super.setAreaUse(areaUse);
    }

    @Override
    public int getFeeRent() {
        return super.getFeeRent();
    }

    @Override
    public void setFeeRent(int feeRent) {
        super.setFeeRent(feeRent);
    }

    @Override
    public String getStandardService() {
        return super.getStandardService();
    }

    @Override
    public void setStandardService(String standardService) {
        super.setStandardService(standardService);
    }

    @Override
    public int getFloor() {
        return super.getFloor();
    }

    @Override
    public void setFloor(int floor) {
        super.setFloor(floor);
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }

    @Override
    public int getMaximumCustomer() {
        return super.getMaximumCustomer();
    }

    @Override
    public void setMaximumCustomer(int maximumCustomer) {
        super.setMaximumCustomer(maximumCustomer);
    }

    @Override
    public String toString() {
        return super.toString() + ", free service = " + freeService;
    }

    @Override
    public String getLine() {
        return getNameService() + "," +
                getRentType() + "," +
                getAreaUse() + "," +
                getFeeRent() + "," +
                getMaximumCustomer() + "," +
                getId() + "," +
                getFreeService();
    }
}