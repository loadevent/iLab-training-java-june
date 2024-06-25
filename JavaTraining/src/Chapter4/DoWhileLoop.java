package Chapter4;

import java.util.Scanner;

public class DoWhileLoop {
    /*Do-While will run at least once*/
    public static void main(String[] args) {
        System.out.println("\n==============EXAMPLE 1====================\n");
        //declare and initialize the loop control variable
        int x = 5;
        //start loop
        do {
           // System.out.println("(" + x + ") Example 1");//5
            x++;//change the value 6
        }while(x <= 3);

        System.out.println("\n==============EXAMPLE 2====================\n");
        int i = 5;

        do {
           // System.out.println("(" + i + ") Example 2");
            i--;
        }while (i >= 0);

        System.out.println("\n==============EXAMPLE 2====================\n");
        int number, sum =0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter number OR zero to exit: ");
            number = sc.nextInt();
            sum = sum + number;
        }while (number != 0);
        System.out.println("Sum: " + sum);
    }
}
