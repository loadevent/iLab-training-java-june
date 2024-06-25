package Chapter4;

import java.util.Scanner;

public class ForLoop {
/*Use the For loop when you know the number
* of times you want to execute the code*/
    public static void main(String[] args) {

        //Example 1
        for (int x = 1;x <= 3; x++){
            //System.out.println("(" + x +") Welcome to iLAB");
        }

        System.out.println("=======EXAMPLE 2=============");
        //Example 2
        for (int i = 0; i < 5 ; i++) {
            //System.out.println("(" + i + ") Example 2"); //
        }

        System.out.println("=======EXAMPLE 3=============");
        //Example 3 - decrement
        for (int i = 5; i >=1 ; i--) {
            //System.out.println("(" + i + ") Example 3"); //0
        }

        /*Example 4 - Ask the user to enter 3 numbers,
        add them together and display the sum.
         */
        System.out.println("=======EXAMPLE 4=============");
        int num, sum = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <=3 ; i++) {
            //System.out.print("Enter number " + i + ": ");
            //num = sc.nextInt(); //2
                 //8 + 2 = 10
            //sum = sum + num;
        }
        System.out.println("Sum: " + sum);

        System.out.println("=======EXAMPLE 5=============");
        //Example 5 - pre increment

        int i = 1;
        for (i = 1; i < 5; --i) {
            System.out.println("(" + i + ") Pre increment Example");
        }
        System.out.println("Value of I : " + i);
    }
}
