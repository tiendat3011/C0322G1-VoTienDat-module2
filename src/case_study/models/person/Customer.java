package case_study.models.person;

public class Customer extends Person {
    private String address, customerType, idCustomerNumber;
    private boolean bookingStatus = false;

    public Customer(String name,
                    String dateOfBirth,
                    String gender,
                    String email,
                    String idCardNumber,
                    String phoneNumber,
                    String idCustomerNumber,
                    String address,
                    String customerType) {

        super(name, dateOfBirth, gender, email, idCardNumber, phoneNumber);
        this.idCustomerNumber = idCustomerNumber;
        this.address = address;
        this.customerType = customerType;
    }

    @Override
    public String getIdCardNumber() {
        return super.getIdCardNumber();
    }

    @Override
    public void setIdCardNumber(String idCardNumber) {
        super.setIdCardNumber(idCardNumber);
    }

    public String getIdCustomerNumber() {
        return idCustomerNumber;
    }

    public void setIdCustomerNumber(String idCustomerNumber) {
        this.idCustomerNumber = idCustomerNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getDateOfBirth() {
        return super.getDateOfBirth();
    }

    @Override
    public void setDateOfBirth(String dateOfBirth) {
        super.setDateOfBirth(dateOfBirth);
    }

    @Override
    public String getGender() {
        return super.getGender();
    }

    @Override
    public void setGender(String gender) {
        super.setGender(gender);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public String getPhoneNumber() {
        return super.getPhoneNumber();
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        super.setPhoneNumber(phoneNumber);
    }

    public boolean isBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(boolean bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", customer id = " + idCustomerNumber +
                ", address = " + address +
                ", customer type = " + customerType;
    }

    @Override
    public String getLine() {
        return super.getLine() + "," +
                idCustomerNumber + "," +
                address + "," +
                customerType;
    }
}