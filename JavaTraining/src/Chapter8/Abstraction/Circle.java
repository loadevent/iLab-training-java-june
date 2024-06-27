package Chapter8.Abstraction;

public class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return (Math.PI * (radius * radius));
    }

    @Override
    public double calcPerimeter() {
        return 0;
    }
}
