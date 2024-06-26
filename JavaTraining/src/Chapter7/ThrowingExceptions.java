package Chapter7;

public class ThrowingExceptions {
    public static void main(String[] args) {

        int x = 12, y = 0;

        try {
            divide(x,y);
        }catch (ArithmeticException ex){
            System.out.println("Cannot divide by zero");
        }

    }

    static void divide(int x, int y) throws ArithmeticException
    {
        double results = 0;

//        if (y == 0){
//            throw new ArithmeticException("Cannot divide by zero. Value provided: " + y);
//        }else{
//            results = x / y;
//        }
        results = x / y;
        System.out.println("Results: " + results);
    }

}
