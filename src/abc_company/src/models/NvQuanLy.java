package models;

public class NvQuanLy extends Nv {
    private int luong, heSoLuong;

    public NvQuanLy() {
    }

    public NvQuanLy(int luong, int heSoLuong) {
        this.luong = luong;
        this.heSoLuong = heSoLuong;
    }

    public NvQuanLy(String id, String idNv, String name, String dateOfBirth, String address, int luong, int heSoLuong) {
        super(id, idNv, name, dateOfBirth, address);
        this.luong = luong;
        this.heSoLuong = heSoLuong;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public int getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    @Override
    public String toString() {
        return "NvQuanLy{" + super.toString() +
                "luong=" + luong +
                ", heSoLuong=" + heSoLuong +
                '}';
    }

    @Override
    public String getLine() {
        return getId() + "," +
                getIdNv() + "," +
                getName() + "," +
                getDateOfBirth() + "," +
                getAddress() + "," +
                getLuong() + "," +
                getHeSoLuong();
    }
}
