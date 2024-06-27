package Chapter8.Polymorphism;

public class Shape {
    protected int length;//Protected - accessible within the same class and child / sub-classes
    protected int width;
    public Shape(){
        this.length = 5;
        this.width = 8;
    }
    public Shape(int l, int w){
        this.length = l;
        this.width = w;
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

    public int calcArea(){
        return this.length * this.width;
    }
    public String getShapeDetails(){
        return "\n====== Details of " + this.getClass().getName() + " =====\n" +
                "Length: " + this.length + "\n" +
                "Width: " + this.getWidth() + "\n" +
                "Area: " + calcArea();
    }
}
