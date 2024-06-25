package Chapter2;

import java.lang.*;
import java.util.*;


public class GetUserInput {
    public static void main(String[] args) {
        //declare
        int age;
        double height;
        String strName;
        float salary;
        Scanner input = new Scanner(System.in);

        /*Assign
         * Get input from the user*/
        System.out.print("Enter name: ");
        strName = input.next();
        System.out.print("Enter age: ");
        age = input.nextInt();
        System.out.print("Enter height: ");
        height = input.nextDouble();
        System.out.print("Enter salary: ");
        salary = input.nextFloat();

        System.out.println("==========OUTPUT==========");

        //use
        System.out.println("Name: " + strName);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Salary: " + salary);
    }
}
