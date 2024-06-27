package Chapter8.Polymorphism;

public class Square extends Shape {
    private int side;
    public Square(int s){
        this.side = s;
    }

    @Override
    public int calcArea(){
        return this.side * this.side;
    }

    public String getShapeDetails(){
        return "\n====== Details of " + this.getClass().getName() + " =====\n" +
                "Side: " + this.side + "\n" +
                "Area: " + calcArea();
    }

}
