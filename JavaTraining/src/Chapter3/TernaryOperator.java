package Chapter3;

public class TernaryOperator {
    public static void main(String[] args) {
        //Ternary operator is a short version of if-else
        int age = 15;
        String results;
        //booleanExpression ? valueWhenTrue : valueWhenFalse;
        results = age >= 18 ? "You can vote" : "You cannot vote";

        System.out.println(results);
    }
}
