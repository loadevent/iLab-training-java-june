package Chapter8.Interfaces;

public class Rectangle implements IShape, IGraphics {
    private int length;
    private int width;
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void applyColor() {
        System.out.println("Applying color");
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + this.getClass().getName() + " shape");
    }

    @Override
    public double calcArea() {
        return getLength() * getWidth();
    }

    @Override
    public double calcPerimeter() {
        return (2 * length) + (2 * width);
    }

    @Override
    public String toString() {
        return "============ Details of " + getClass().getName() + " ==================\n" +
                "Length: " + this.getLength() + "\n" +
                "Width: " + this.getWidth() + "\n" +
                "Area: " + Math.round(this.calcArea()) + "\n" +
                "Perimeter: " + Math.round(this.calcPerimeter());
    }
}
