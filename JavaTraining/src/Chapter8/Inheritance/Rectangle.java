package Chapter8.Inheritance;

public class Rectangle extends Shape{

    public double calcPerimeter(){
        return (2 * this.getLength()) + (2 * this.getWidth());
    }
    public Rectangle(int l, int w){
        this.length = l;
        this.width = w;
    }

    public String getShapeDetails(){
        return "Length: " + this.length + "\n" +
                "Width: " + this.getWidth() + "\n" +
                "Area: " + calcArea() + "\n" +
                "Perimeter: " + calcPerimeter();
    }
}
