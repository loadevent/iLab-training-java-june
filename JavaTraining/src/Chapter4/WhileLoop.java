package Chapter4;

import java.util.Scanner;

public class WhileLoop {
    /*Use a while loop when you don't know the
    number of iterations
     */
    public static void main(String[] args) {
        //declare and initialize the loop control variable
        int x = 1;
        //start of loop
        //Example 1
        while (x <=3){
            System.out.println("(" + x + ") Example 1");
            x = x + 2; //change the loop control variable
        }
        System.out.println("X: " + x);
        System.out.println("\n==============EXAMPLE 2====================\n");

        int i = 5;
        while (i > 0){
            System.out.println("(" + i + ") Example 2");//1
            i--;//0
        }
        System.out.println("I: " + i);//0

        System.out.println("\n==============EXAMPLE 3====================\n");

        int number, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number. Enter zero OR five to exit: ");

        //initialize the loop control variable
        number = sc.nextInt();

        while (number != 0 && number != 5){
            sum = sum + number;
            System.out.print("Enter a number. Enter zero OR five to exit: ");
            number = sc.nextInt(); //change the loop control variable
        }
        System.out.println("Sum: " + sum);
    }
}
