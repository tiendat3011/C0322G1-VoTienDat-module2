package small_exercise3.models;

import java.util.List;

public class Experience extends Candidate {
    private int expInYear;
    private String proSkill;

    public Experience() {
    }

    public Experience(int expInYear, String proSkill) {
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public Experience(String candidateID, String fullName, String birthDay, String phone, String email, String candiDateType, int candiDateCount, int expInYear, String proSkill) {
        super(candidateID, fullName, birthDay, phone, email, candiDateType, candiDateCount);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }
//    public Candidate(String candidateID,
//    String fullName,
//    String birthDay,
//    String phone,
//    String email,
//    String candiDateType,
//    int candiDateCount,
//    List<Certificated> certificatedList) {
    @Override
    public String toString() {
        return "Experience{" + super.toString()+
                "expInYear=" + expInYear +
                ", proSkill='" + proSkill + '\'' +
                '}';
    }

    @Override
    public String getLine() {
        return getCandidateID()+","+
                getFullName()+","+
                getBirthDay()+","+
                getPhone()+","+
                getEmail()+","+
                getCandiDateType()+","+
                getCandiDateCount()+","+
//                getCertificatedList()+","+
                getExpInYear()+","+
                getProSkill();
    }
}