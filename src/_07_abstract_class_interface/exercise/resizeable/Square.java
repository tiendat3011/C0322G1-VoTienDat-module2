package _07_abstract_class_interface.exercise.resizeable;

public class Square extends Shape {
    private double side;

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public void resize(double percent) {
        this.side += this.side * percent/100;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square " +
                "side=" + side + ". " + super.toString();
    }
}