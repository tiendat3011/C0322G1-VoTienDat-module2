package case_study.models.person;

public abstract class Person {
    private int id;
    private String name;
    private String dateOfBirth;
    private String sex;
    private int numCMND;
    private int phoneNum;
    private String email;
    private String address;

    public Person() {
    }

    public Person(int id, String name, String dateOfBirth,String sex, int numCMND, int phoneNum, String email, String address) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.numCMND = numCMND;
        this.phoneNum = phoneNum;
        this.email = email;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getNumCMND() {
        return numCMND;
    }

    public void setNumCMND(int numCMND) {
        this.numCMND = numCMND;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", sex='" + sex + '\'' +
                ", numCMND=" + numCMND +
                ", phoneNum=" + phoneNum +
                ", email='" + email + '\'' +
                ", address='" + address + ", ";
    }
}

