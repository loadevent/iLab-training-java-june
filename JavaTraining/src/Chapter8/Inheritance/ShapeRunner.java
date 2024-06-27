package Chapter8.Inheritance;

public class ShapeRunner {
    public static void main(String[] args) {
        Shape s = new Shape();//Parent of Rectangle
        Rectangle recObj = new Rectangle(12,6);//Child of Shape

        System.out.println(recObj.getShapeDetails());
        System.out.println(s.getShapeDetails());
        //System.out.println("Perimeter: " + recObj.calcPerimeter());
        //System.out.println(s.getShapeDetails());
    }
}
