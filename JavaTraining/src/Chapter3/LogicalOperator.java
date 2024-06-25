package Chapter3;

public class LogicalOperator {
    public static void main(String[] args) {
        /*A student need 55 and above to pass, if they get anything from
         54 to 40 they need to rewrite, otherwise they fail the exam*/

        double examMark = 182;

        /*And (&&)
        * T && T = True
        * T && F = False
        * F && T = False
        * F && F = False*/
        if (examMark >= 0 && examMark <= 100){
            //true
            if (examMark >= 55){
                System.out.println("Pass");
            } else if (examMark >= 40 && examMark <= 54) {
                System.out.println("rewrite");
            }else {
                System.out.println("Fail");
            }
        }else{
            //false
            System.out.println("Incorrect score. The exam mark should be from 0 to 100");
        }

        /*Logical OR (||)
        * T || T = TRUE
        * T || F = TRUE
        * F || T = TRUE
        * F || F = FALSE*/

        double age = 25;
                //F   ||  T  = T
        if (age <= 12 || age >= 0){ //TRUE
            System.out.println("Child");
        } else if (age > 12 && age <= 19 ) {
            System.out.println("Teenager");
        } else if (age >= 20 && age <= 120) {
            System.out.println("Adult");
        }else{
            System.out.println("Wooh!!! You can't be alive");
        }
        System.out.println("===============================");
        String letter = "a";
            //F         ||      T   = TRUE
        if (letter == "c" || letter == "C"){
            System.out.println("Child: " +letter);
        } else if (letter == "t" || letter == "T") {
            System.out.println("Teen: " + letter);
        } else if (letter == "a" || letter == "A") {
            System.out.println("Adult: " + letter);
        }else {
            System.out.println("Unknown");
        }

        System.out.println("================LOGICAL NOT=====================");
        /*Logical Not (!)*/
        age = 25;

        if (!(age != 25)){ //TRUE
            System.out.println("Great....");
        }else{
            System.out.println("Sorry! We are looking for someone who is not 25");
        }
    }
}
