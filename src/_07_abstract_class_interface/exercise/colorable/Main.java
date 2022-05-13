package _07_abstract_class_interface.exercise.colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle("Red", false, 5);
        shape[1] = new Rectangle(3,4,"red",false);
        shape[2] = new Square("Red", true, 5);


        for (Shape item : shape) {
            System.out.println("Diện tích: ");
            System.out.println(item.getArea());
            if (item instanceof Colorable) {
                Square  square = (Square) item;
                square.howToColor();
            }
        }
    }
}