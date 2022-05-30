package case_study.models.person;

public class Employee extends Person {
    private String lever;
    private String position;
    private int salary;

    public Employee() {
    }

    public Employee(String lever, String position, int salary) {
        this.lever = lever;
        this.position = position;
        this.salary = salary;
    }

    public Employee(int id,
                    String name,
                    String dateOfBirth,
                    String sex,
                    int numCMND,
                    int phoneNum,
                    String email,
                    String address,
                    String lever,
                    String position,
                    int salary) {
        super(id, name, dateOfBirth, sex, numCMND, phoneNum, email, address);
        this.lever = lever;
        this.position = position;
        this.salary = salary;
    }

    public String getLever() {
        return lever;
    }

    public void setLever(String lever) {
        this.lever = lever;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                "lever='" + lever + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ']';
    }
}
