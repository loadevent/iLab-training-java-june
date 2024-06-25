package Chapter3;

public class ifElseStatement {
    public static void main(String[] args) {
        /*1. Check if the age is >= 18
        2. They should apply for ID if the age = 15
        3. They cannot vote if the age < 18
        * */

        /*
        * == - numbers
        * .equals - strings and objects
        * */
        int age = 15;
        String results = "No results";

        if (age >= 18){
            results = "You can vote";

        } else if (age == 15) {
            results = "Apply for ID";
        }else{
            results = "You cannot vote";
        }
        System.out.println(results);
    }
}
