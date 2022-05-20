package _11_stack_queue.exercise.demerging_queque;

public class People implements Comparable<People> {
    // comparable và comparator dùng để sắp xếp các pt vào collection or array
    // triển khai Interface trong class || không cần triển khai và khác class muốn sắp xếp
    private String name;
    private Boolean gender;
    private String dateOfBirth;

     public People() {
    }

    public People(String name, Boolean gender, String dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }


    @Override
    public int compareTo(People o) {
        return 0;
    }
}