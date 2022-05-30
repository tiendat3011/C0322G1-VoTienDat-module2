package case_study.models.person;

public class Customer extends Person {
    private String customerType;

    public Customer() {
    }

    public Customer(String customerType) {
        this.customerType = customerType;
    }

    public Customer(int id,
                    String name,
                    String dateOfBirth,
                    String sex,
                    int numCMND,
                    int phoneNum,
                    String email,
                    String address,
                    String customerType) {
        super(id, name, dateOfBirth, sex, numCMND, phoneNum, email, address);
        this.customerType = customerType;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return super.toString()+
                "[" +
                "customerType='" + customerType + '\'' +
                ']';
    }
    public String getLine(){
        return super.toString()+ "," +customerType;
    }
}
