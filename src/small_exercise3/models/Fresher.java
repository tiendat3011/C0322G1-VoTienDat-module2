package small_exercise3.models;

import java.util.List;

public class Fresher extends Candidate{
    private String graduationDate,graduationRank,Education;

    public Fresher() {
    }

    public Fresher(String graduationDate, String graduationRank, String education) {
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        Education = education;
    }

    public Fresher(String candidateID, String fullName, String birthDay, String phone, String email, String candiDateType, int candiDateCount, String graduationDate, String graduationRank, String education) {
        super(candidateID, fullName, birthDay, phone, email, candiDateType, candiDateCount);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        Education = education;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }

    @Override
    public String toString() {
        return "Fresher{" +super.toString()+
                "graduationDate='" + graduationDate + '\'' +
                ", graduationRank='" + graduationRank + '\'' +
                ", Education='" + Education + '\'' +
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
                getGraduationDate()+","+
                getGraduationRank()+","+
                getEducation();
    }
}
