package Chapter8.Polymorphism;

import Chapter8.Inheritance.Shape;

public class Rectangle extends Shape {

    @Override
    public int calcArea() {
        return super.calcArea();
        //super = Shape
        //super() = Shape()
    }
}
