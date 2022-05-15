package homework.models;

public class Student extends Person {
    private int point;

    public Student() {
    }

    public Student(int point) {
        this.point = point;
    }

    public Student(int id, String name, int age, String gender, int point) {
        super(id, name, age, gender);
        this.point = point;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString()+
                "point=" + point +
                '}';
    }

    public String getLine (){
        return super.getLine()+ "," +point;
    }
}
