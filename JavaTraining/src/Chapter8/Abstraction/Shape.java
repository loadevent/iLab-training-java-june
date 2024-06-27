package Chapter8.Abstraction;

/*
* Abstraction is the process of hiding the internal details of an application from
* the outer world. An abstract class provides a partial implementation that other
* classes can build on.
 */
public abstract class Shape {
    public abstract double calcArea();
    public abstract double calcPerimeter();
    //Normal method
    public String printDetails(){
        return "============ Details of " + getClass().getName() + " ==================\n" +
                "Area: " + Math.round(this.calcArea()) + "\n" +
                "Perimeter: " + Math.round(this.calcPerimeter());
    }
}
