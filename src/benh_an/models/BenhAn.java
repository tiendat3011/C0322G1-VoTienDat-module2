package benh_an.models;

public abstract class BenhAn {
    private String idBenhAn;
    private String idBenhNhan;
    private String name;
    private String dayStart;
    private String dayEnd;
    private String reason;

    public BenhAn() {
    }

    public BenhAn(String idBenhAn, String idBenhNhan, String name, String dayStart, String dayEnd, String reason) {
        this.idBenhAn = idBenhAn;
        this.idBenhNhan = idBenhNhan;
        this.name = name;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.reason = reason;
    }

    public String getIdBenhAn() {
        return idBenhAn;
    }

    public void setIdBenhAn(String idBenhAn) {
        this.idBenhAn = idBenhAn;
    }

    public String getIdBenhNhan() {
        return idBenhNhan;
    }

    public void setIdBenhNhan(String idBenhNhan) {
        this.idBenhNhan = idBenhNhan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayStart() {
        return dayStart;
    }

    public void setDayStart(String dayStart) {
        this.dayStart = dayStart;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(String dayEnd) {
        this.dayEnd = dayEnd;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "BenhAn{" +
                "idBenhAn=" + idBenhAn +
                ", idBenhNhan=" + idBenhNhan +
                ", name='" + name + '\'' +
                ", dayStart='" + dayStart + '\'' +
                ", dayEnd='" + dayEnd + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }
    public abstract String getLine();
}
