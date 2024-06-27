package Chapter8;

import javax.swing.*;
import java.util.Scanner;

public class EmployeeRunner {
    public static void main(String[] args) {

        int empNum;
        String name;
        float salary;
        Scanner sc = new Scanner(System.in);

        System.out.print("Employee Number: ");
        empNum = sc.nextInt();
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Salary: ");
        salary = sc.nextFloat();
        //Object creation

        Employee employee1 = new Employee(empNum,name,salary);

        System.out.println(employee1.printDetails());
    }
}
