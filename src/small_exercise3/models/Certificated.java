package small_exercise3.models;

public class Certificated {
    private String certificatedID, certificatedName, certificatedRank, certificatedDate;

    public Certificated() {
    }

    public Certificated(String certificatedID, String certificatedName, String certificatedRank, String certificatedDate) {
        this.certificatedID = certificatedID;
        this.certificatedName = certificatedName;
        this.certificatedRank = certificatedRank;
        this.certificatedDate = certificatedDate;
    }

    public String getCertificatedID() {
        return certificatedID;
    }

    public void setCertificatedID(String certificatedID) {
        this.certificatedID = certificatedID;
    }

    public String getCertificatedName() {
        return certificatedName;
    }

    public void setCertificatedName(String certificatedName) {
        this.certificatedName = certificatedName;
    }

    public String getCertificatedRank() {
        return certificatedRank;
    }

    public void setCertificatedRank(String certificatedRank) {
        this.certificatedRank = certificatedRank;
    }

    public String getCertificatedDate() {
        return certificatedDate;
    }

    public void setCertificatedDate(String certificatedDate) {
        this.certificatedDate = certificatedDate;
    }

    @Override
    public String toString() {
        return "Certificated{" +
                "certificatedID='" + certificatedID + '\'' +
                ", certificatedName='" + certificatedName + '\'' +
                ", certificatedRank='" + certificatedRank + '\'' +
                ", certificatedDate='" + certificatedDate + '\'' +
                '}';
    }

    public String getLine() {
        return getCertificatedID() + "," +
                getCertificatedName() + "," +
                getCertificatedRank() + "," +
                getCertificatedDate();
    }
}
