package Chapter3;

public class NestedIf {

    public static void main(String[] args) {
        /*
        * The program should check if the student gets a test mark of 50 and above,
        * if they do, it should continue to check if they get a mark greater than 59 for assignment 1,
        * if they do, it should continue to check if they get a mark of 55 and above for assignment 2.
         */

        int testMark = 55;
        int assignment1 = 60;
        int assignment2 = 70;

        if (testMark >= 50){ //1st if

            if (assignment1 > 59){//2nd if

                if (assignment2 >=55){ //3rd if
                    System.out.println("You passed all 3 assessments");
                }else{
                    System.out.println("Sorry! You failed Assignment 3");
                }//end 3rd if
            }else{
                System.out.println("Sorry! You failed Assignment 1 and you cannot submit Assignment 2");
            }//end 2nd if
        }else{
            System.out.println("You cannot submit any assignment");
        }// end 1st if
    }
}
