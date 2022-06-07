package small_exercise2.models;

public class Student extends Person {
    private String idSV;
    private double diemTb;

    public Student() {
    }

    public Student(String idSV, double diemTb) {
        this.idSV = idSV;
        this.diemTb = diemTb;
    }

    public Student(String id, String name, String gender, String dateOfBirth, String address, String idSV, double diemTb) {
        super(id, name, gender, dateOfBirth, address);
        this.idSV = idSV;
        this.diemTb = diemTb;
    }

    public String getIdSV() {
        return idSV;
    }

    public void setIdSV(String idSV) {
        this.idSV = idSV;
    }

    public double getDiemTb() {
        return diemTb;
    }

    public void setDiemTb(double diemTb) {
        this.diemTb = diemTb;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "idSV='" + idSV + '\'' +
                ", diemTb=" + diemTb +
                '}';
    }

    @Override
    public String getLine() {
        return getId() + "," +
                getName() + "," +
                getGender() + "," +
                getDateOfBirth() + "," +
                getAddress() + "," +
                getIdSV() + "," +
                getDiemTb();
    }
}
