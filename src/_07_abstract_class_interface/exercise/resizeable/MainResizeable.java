package _07_abstract_class_interface.exercise.resizeable;

import java.sql.SQLOutput;

public class MainResizeable {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle("Blue", true, 10);
        shape[1] = new Rectangle("Red", true, 10, 5);
        shape[2] = new Square("Black", true, 10);

        for (Shape shapes : shape) {
            System.out.println("Diện tích: ");
            System.out.println(shapes.getArea());
        }
        System.out.println("Sau khi random");
        double random = Math.random() * 100;
        for (Shape shapes : shape) {
            shapes.resize(random);
            System.out.println("Diện tích: ");
            System.out.println(shapes.getArea());
        }
    }
}

