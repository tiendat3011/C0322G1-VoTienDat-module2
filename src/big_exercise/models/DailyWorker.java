package big_exercise.models;

public class DailyWorker extends Person {
    private int soNgayCong;

    public DailyWorker() {
    }

    @Override
    public double luong() {
        return this.soNgayCong*120000;
    }

    public DailyWorker(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    public DailyWorker(String name, String dayOfBirth, String address, int soNgayCong) {
        super(name, dayOfBirth, address);
        this.soNgayCong = soNgayCong;
    }

    public int getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    @Override
    public String toString() {
        return "DailyWorker{" + super.toString()+
                "soNgayCong=" + soNgayCong +
                ",luong= " +luong()+
                '}';
    }
}
