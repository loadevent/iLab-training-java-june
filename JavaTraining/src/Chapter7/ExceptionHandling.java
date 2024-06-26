package Chapter7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        double age = 0;
        int months = 0;
        String name = "No name";
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter name: ");
            name = sc.nextLine();
            System.out.print("Enter number of months: ");
            months = sc.nextInt();

            age = months / 0;

        }catch (InputMismatchException inputEx){
            System.out.println("Incorrect input. ");
        }catch (ArithmeticException ex){
            System.out.println("Cannot divide by zero");
        }finally {
            //Display
            System.out.println("Name: " + name + "\n" +
                    "Age: " + age);
        }




    }
}
