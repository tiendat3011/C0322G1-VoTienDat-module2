package big_exercise.models;

public class Management extends Person {
    private int luongCoBan;
    private double heSoLuong;

    public Management() {
    }

    @Override
    public double luong() {
        return this.heSoLuong * this.luongCoBan;
    }

    public Management(int luongCoBan, double heSoLuong) {
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public Management(String name, String dayOfBirth, String address, int luongCoBan, double heSoLuong) {
        super(name, dayOfBirth, address);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public int getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    @Override
    public String toString() {
        return "Management{" + super.toString() +
                "luongCoBan=" + luongCoBan +
                ", heSoLuong=" + heSoLuong +
                ",luong= " + luong() +
                '}';
    }
}
