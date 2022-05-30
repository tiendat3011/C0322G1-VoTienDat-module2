package case_study.models.contract;

public class Contract {
    private int idContract, idBooking;
    private String discountStatus, idCustomer, startTime;
    private double preFee, totalFeeRent;

    public Contract(int booking,
                    String customer,
                    int idContract,
                    double preFee,
                    double totalFeeRent,
                    String startTime,
                    String discountStatus) {
        this.preFee = preFee;
        this.totalFeeRent = totalFeeRent;
        this.idContract = idContract;
        this.idBooking = booking;
        this.idCustomer = customer;
        this.discountStatus = discountStatus;
        this.startTime = startTime;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public double getPreFee() {
        return preFee;
    }

    public void setPreFee(double preFee) {
        this.preFee = preFee;
    }

    public double getTotalFeeRent() {
        return totalFeeRent;
    }

    public void setTotalFeeRent(double totalFeeRent) {
        this.totalFeeRent = totalFeeRent;
    }

    public int getIdContract() {
        return idContract;
    }

    public void setIdContract(int idContract) {
        this.idContract = idContract;
    }

    public String getDiscountStatus() {
        return discountStatus;
    }

    public void setDiscountStatus(String discountStatus) {
        this.discountStatus = discountStatus;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return "[" +
                "idBooking=" + idBooking +
                ", idCustomer=" + idCustomer +
                ", preFee=" + preFee +
                ", totalFeeRent=" + totalFeeRent +
                ", idContract=" + idContract +
                ", discount status = " + discountStatus +
                ']';
    }

    public String getLine() {
        return idBooking + "," +
                idCustomer + "," +
                idContract + "," +
                preFee + "," +
                totalFeeRent + "," +
                startTime + "," +
                discountStatus;
    }
}