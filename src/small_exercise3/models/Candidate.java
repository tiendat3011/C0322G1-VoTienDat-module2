package small_exercise3.models;

import java.util.List;

public abstract class Candidate {
    private String candidateID, fullName, birthDay, phone, email, candiDateType;
    private int candiDateCount;
//    private List<Certificated> certificatedList;

    public Candidate() {
    }
    public Candidate(String candidateID, String fullName, String birthDay, String phone, String email, String candiDateType, int candiDateCount) {
        this.candidateID = candidateID;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
        this.candiDateType = candiDateType;
        this.candiDateCount = candiDateCount;
//        this.certificatedList = certificatedList;
    }

    public String getCandidateID() {
        return candidateID;
    }

    public void setCandidateID(String candidateID) {
        this.candidateID = candidateID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCandiDateType() {
        return candiDateType;
    }

    public void setCandiDateType(String candiDateType) {
        this.candiDateType = candiDateType;
    }

    public int getCandiDateCount() {
        return candiDateCount;
    }

    public void setCandiDateCount(int candiDateCount) {
        this.candiDateCount = candiDateCount;
    }

//    public List<Certificated> getCertificatedList() {
//        return certificatedList;
//    }
//
//    public void setCertificatedList(List<Certificated> certificatedList) {
//        this.certificatedList = certificatedList;
//    }

    @Override
    public String toString() {
        return "Candidate{" +
                "candidateID='" + candidateID + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", candiDateType='" + candiDateType + '\'' +
                ", candiDateCount=" + candiDateCount +
//                ", certificatedList=" + certificatedList +
                '}';
    }
    public abstract String getLine();
}
