package big_exercise.models;

public class ProductionStaff extends Person {
    private int soSanPham;

    public ProductionStaff() {
    }

    @Override
    public double luong() {
        return this.soSanPham*50000;
    }

    public ProductionStaff(int soSanPham) {
        this.soSanPham = soSanPham;
    }

    public ProductionStaff(String name, String dayOfBirth, String address, int soSanPham) {
        super(name, dayOfBirth, address);
        this.soSanPham = soSanPham;
    }

    public int getSoSanPham() {
        return soSanPham;
    }

    public void setSoSanPham(int soSanPham) {
        this.soSanPham = soSanPham;
    }

    @Override
    public String toString() {
        return "ProductionStaff{" + super.toString()+
                "soSanPham=" + soSanPham +
                ",luong= " +luong()+
                '}';
    }
}
