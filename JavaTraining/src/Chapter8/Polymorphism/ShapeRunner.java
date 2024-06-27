package Chapter8.Polymorphism;

public class ShapeRunner{
    public static void main(String[] args) {

        Shape s1 = new Shape(4,6);
        Square sq1 = new Square(5);

        System.out.println(s1.getShapeDetails());
        System.out.println(sq1.getShapeDetails());

        Shape s2 = new Square(4);
        System.out.println(s2.getShapeDetails());
    }
}
