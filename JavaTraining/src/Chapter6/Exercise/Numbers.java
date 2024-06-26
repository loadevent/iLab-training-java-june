package Chapter6.Exercise;

import java.util.Scanner;

public class Numbers {
    /*Ask the user to enter 5 integers and store them in an array.
    The application should use methods to display all integers,
    display their sum, display numbers less than a specified value*/
    public static void main(String[] args) {

        int[] numbers = new int[5];
        int num;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numbers.length ; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            num = sc.nextInt();
            numbers[i] = num;
        }

        displayAll(numbers);
        displaySum(numbers);
        numbersLessThan(numbers,10);
    }
    static void displayAll(int[] arNumbers){
        System.out.println("============ALL NUMBERS==================");
        for (int num : arNumbers){
            System.out.print(num + " ");
        }
    }

    static void displaySum(int[] arNumbers){
        int sum = 0;

        for (int num : arNumbers){
            sum = sum + num;
        }
        System.out.println("\nSum: " + sum);
    }

    static void numbersLessThan(int[] arNumbers, int lessThan){
        System.out.println("\nNumbers less than " + lessThan);

        for (int i = 0; i < arNumbers.length; i++) {
            if (arNumbers[i] < lessThan){
                System.out.print(arNumbers[i] + " ");
            }
        }
    }
}
