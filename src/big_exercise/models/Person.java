package big_exercise.models;

public abstract class Person {
    private String name;
    private String dayOfBirth;
    private String address;

    public Person() {
    }

    public Person(String name, String dayOfBirth, String address) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public abstract double luong();

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
