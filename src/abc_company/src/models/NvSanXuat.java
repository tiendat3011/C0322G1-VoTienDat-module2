package models;

public class NvSanXuat extends Nv {
    private int soSp, giaSp;

    public NvSanXuat() {
    }

    public NvSanXuat(int soSp, int giaSp) {
        this.soSp = soSp;
        this.giaSp = giaSp;
    }

    public NvSanXuat(String id, String idNv, String name, String dateOfBirth, String address, int soSp, int giaSp) {
        super(id, idNv, name, dateOfBirth, address);
        this.soSp = soSp;
        this.giaSp = giaSp;
    }

    public int getSoSp() {
        return soSp;
    }

    public void setSoSp(int soSp) {
        this.soSp = soSp;
    }

    public int getGiaSp() {
        return giaSp;
    }

    public void setGiaSp(int giaSp) {
        this.giaSp = giaSp;
    }

    @Override
    public String toString() {
        return "NvSanXuat{" + super.toString()+
                "soSp=" + soSp +
                ", giaSp=" + giaSp +
                '}';
    }

    @Override
    public String getLine() {
        return getId() + "," +
                getIdNv() + "," +
                getName() + "," +
                getDateOfBirth() + "," +
                getAddress() + "," +
                getSoSp() + "," +
                getGiaSp();
    }
}
