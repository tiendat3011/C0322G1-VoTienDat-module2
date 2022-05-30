package case_study.models.facility;

public class House extends Facility {

    public House(String nameService,
                 String rentType,
                 String standardService,
                 int floor,
                 double areaUse,
                 int feeRent,
                 int maximumCustomer,
                 String id) {

        super(nameService, rentType, standardService, floor, areaUse, feeRent, maximumCustomer, id);
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
    public int getMaximumCustomer() {
        return super.getMaximumCustomer();
    }

    @Override
    public void setMaximumCustomer(int maximumCustomer) {
        super.setMaximumCustomer(maximumCustomer);
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
    public String toString() {
        return super.toString() +
                ", standard service = " + getStandardService() +
                ", floor = " + getFloor();
    }

    @Override
    public String getLine() {
        return  getNameService() + "," +
                getRentType() + "," +
                getStandardService() + "," +
                getFloor() + "," +
                getAreaUse() + "," +
                getFeeRent() + "," +
                getMaximumCustomer() + "," +
                getId();
    }
}