package small_exercise2.models;

import small_exercise2.models.Person;

public class Teacher extends Person {
    private int lop, luong, soGioDay;

    public Teacher() {
    }

    public Teacher(int lop, int luong, int soGioDay) {
        this.lop = lop;
        this.luong = luong;
        this.soGioDay = soGioDay;
    }

    public Teacher(String id, String name, String gender, String dateOfBirth, String address, int lop, int luong, int soGioDay) {
        super(id, name, gender, dateOfBirth, address);
        this.lop = lop;
        this.luong = luong;
        this.soGioDay = soGioDay;
    }

    public int getLop() {
        return lop;
    }

    public void setLop(int lop) {
        this.lop = lop;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public int getSoGioDay() {
        return soGioDay;
    }

    public void setSoGioDay(int soGioDay) {
        this.soGioDay = soGioDay;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString() +
                "lop=" + lop +
                ", luong=" + luong +
                ", soGioDay=" + soGioDay +
                '}';
    }

    @Override
    public String getLine() {
        return getId() + "," +
                getName() + "," +
                getGender() + "," +
                getDateOfBirth() + "," +
                getAddress() + "," +
                getLop() + "," +
                getLuong() + "," +
                getSoGioDay();
    }
}
