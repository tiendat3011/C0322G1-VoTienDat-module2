package case_study.models.person;

public abstract class Person {
    private String name, dateOfBirth, gender, email, phoneNumber, idCardNumber;

    public Person(String name,
                  String dateOfBirth,
                  String gender,
                  String email,
                  String idCardNumber,
                  String phoneNumber) {

        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.email = email;
        this.idCardNumber = idCardNumber;
        this.phoneNumber = phoneNumber;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "[" +
                "name = " + name + '\'' +
                ", date of birth = '" + dateOfBirth + '\'' +
                ", gender = '" + gender + '\'' +
                ", email = '" + email + '\'' +
                ", id card Number = " + idCardNumber +
                ", phone number = " + phoneNumber;
    }

    public String getLine(){
        String line = name + "," +
                dateOfBirth + "," +
                gender + "," +
                email + "," +
                idCardNumber + "," +
                phoneNumber;
        return line;
    }
}