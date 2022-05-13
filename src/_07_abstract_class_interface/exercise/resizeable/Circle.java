package _07_abstract_class_interface.exercise.resizeable;


public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public void resize(double percent) {
        this.radius += this.radius * percent / 100;
    }

    @Override
    public String toString() {
        return "Circle " +
                "radius=" + radius + " " + super.toString();
    }
}