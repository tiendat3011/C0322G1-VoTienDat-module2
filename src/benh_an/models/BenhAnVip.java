package benh_an.models;

public class BenhAnVip extends BenhAn {
    private String vip;
    private String dateVip;

    public BenhAnVip() {
    }

    public BenhAnVip(String vip, String dateVip) {
        this.vip = vip;
        this.dateVip = dateVip;
    }

    public BenhAnVip(String idBenhAn, String idBenhNhan, String name, String dayStart, String dayEnd, String reason, String vip, String dateVip) {
        super(idBenhAn, idBenhNhan, name, dayStart, dayEnd, reason);
        this.vip = vip;
        this.dateVip = dateVip;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public String getDateVip() {
        return dateVip;
    }

    public void setDateVip(String dateVip) {
        this.dateVip = dateVip;
    }

    @Override
    public String toString() {
        return "BenhAnVip{" + super.toString()+
                "vip='" + vip + '\'' +
                ", dateVip='" + dateVip + '\'' +
                '}';
    }

    @Override
    public String getLine() {
        return  getIdBenhAn()+ "," +
                getIdBenhNhan()+ "," +
                getName()+ "," +
                getDayStart()+ "," +
                getDayEnd()+ "," +
                getReason()+ "," +
                getVip()+ "," +
                getDateVip();
    }
}
