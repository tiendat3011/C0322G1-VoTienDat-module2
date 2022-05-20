package _12_java_collection_framework.array_list;


import java.util.Comparator;

public class ProductManagement implements Comparator<ProductMain> {
    // comparable và comparator dùng để sắp xếp các pt vào collection or array
    // triển khai Interface trong class || không cần triển khai và khác class muốn sắp xếp
    private String name;
    private int id;
    private int price;

    public ProductManagement() {

    }

    public ProductManagement(String name, int id, int price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductManagement{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }


    @Override
    public int compare(ProductMain o1, ProductMain o2) {
        return 0;
    }
}
