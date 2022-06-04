package benh_an.models;

public class BenhAnThuong extends BenhAn {
    private int cost;

    public BenhAnThuong() {
    }

    public BenhAnThuong(int cost) {
        this.cost = cost;
    }

    public BenhAnThuong(String idBenhAn, String idBenhNhan, String name, String dayStart, String dayEnd, String reason, int cost) {
        super(idBenhAn, idBenhNhan, name, dayStart, dayEnd, reason);
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "BenhAnThuong{" +super.toString()+
                "cost=" + cost +
                '}';
    }

    @Override
    public String getLine() {
        return getIdBenhAn()+ "," +
                getIdBenhNhan()+ "," +
                getName()+ "," +
                getDayStart()+ "," +
                getDayEnd()+ "," +
                getReason()+ "," +
                getCost();
    }
}
