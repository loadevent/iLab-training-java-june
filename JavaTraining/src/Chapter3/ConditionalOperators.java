package Chapter3;

public class ConditionalOperators {
    public static void main(String[] args) {
        int age = 15;
        String results;
            //35
        if(age >= 18) {
            //true
            results = "You can vote";
            System.out.println("Welcome to the voting station");
        }else{
            //false
            results = "you cannot vote";
        }

        System.out.println(results);
    }
}
