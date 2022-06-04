package case_study.models.booking;

public class Booking {
    private int idBooking;
    private String starTime, endTime, customerId, facilityId;
    private String statusContract = "false";

    public Booking(int idBooking,
                   String starTime,
                   String endTime,
                   String customerId,
                   String facilityId,
                   String statusContract) {
        this.idBooking = idBooking;
        this.starTime = starTime;
        this.endTime = endTime;
        this.customerId = customerId;
        this.facilityId = facilityId;
        this.statusContract = statusContract;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public String getStarTime() {
        return starTime;
    }

    public void setStarTime(String starTime) {
        this.starTime = starTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getStatusContract() {
        return statusContract;
    }

    public void setStatusContract(String statusContract) {
        this.statusContract = statusContract;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    @Override
    public String toString() {
        return "[" +
                "idBooking = " + idBooking +
                ", idCustomerNumber = " + customerId +
                ", starTime = " + starTime + '\'' +
                ", endTime = " + endTime + '\'' +
                ", nameService = " + facilityId +
                ", status Contract = " + statusContract;
    }

    public String getLine() {
        return idBooking + "," + starTime + "," + endTime + "," + customerId + "," + facilityId + "," + statusContract;
    }
}