package Chapter5;
public class MethodOverloading {
    /*Creating methods with the same name but
different parameter types*
 */
    public static void main(String[] args) {
        System.out.println("Sum Int: " + calculate(5,3));
        System.out.println("Sum Double: " + calculate(5,8));
        System.out.println("Sum Float: " + calculate(5,8));

    }
    static int calculate(int x, int y){
        return x + y;
    }
    static double calculate(double a, double b){
        return a + b;
    }
    static float calculate(float a, float b){
        return a + b;
    }

}
