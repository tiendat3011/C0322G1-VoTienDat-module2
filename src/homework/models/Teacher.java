package homework.models;

public class Teacher extends Person {
    private int salary;

    public Teacher() {
    }

    public Teacher(int salary) {
        this.salary = salary;
    }

    public Teacher(int id, String name, int age, String gender, int salary) {
        super(id, name, age, gender);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString() +
                "salary=" + salary +
                '}';
    }

    public String getLine() {
        return super.getLine() + "," + salary;
    }
}
