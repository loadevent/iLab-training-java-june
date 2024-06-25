package Chapter2;

import javax.swing.*;
import java.util.Scanner;

public class CalculateSalary {
    public static void main(String[] args) {

        double hoursWorked;
        float rate;
        float salary;
        Scanner sc = new Scanner(System.in);
/*
        System.out.print("Enter Hours Worked: ");
        hoursWorked = sc.nextDouble();
        System.out.print("Enter rate: ");
        rate = sc.nextFloat();
*/

        /*
        *Convert - change a value
        Cast - change the type
         */
        hoursWorked = Double.parseDouble(JOptionPane.showInputDialog("Enter hours worked"));
        rate = Float.parseFloat(JOptionPane.showInputDialog("Enter rate"));

        salary = (float) (hoursWorked * rate);

        JOptionPane.showMessageDialog(null,"Salary: " + salary);
        System.out.println("=================================");
        System.out.println("Rate: " + rate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Salary: " + salary);
    }
}
