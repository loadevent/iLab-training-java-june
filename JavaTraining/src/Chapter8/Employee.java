package Chapter8;

import javax.swing.*;

public class Employee {
    //variable declaration
    private int employeeNum;
    private String employeeName;
    private float salary;

    //Default constructor
    public Employee(){
        this.employeeName = "Kabelo";
        this.employeeNum = 12345;
        this.salary = 15000F;
    }
    //overloaded constructor
    public Employee(int empNum, String empName, float salary){
        this.employeeNum = empNum;
        this.employeeName = empName;
        this.salary = salary;
    }
    //Getter and Setters
    public void setEmployeeNum(int empNum){
        this.employeeNum = empNum;
    }
    public int getEmployeeNum(){
        return this.employeeNum;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    public String printDetails(){
        return "\n=====Employee Details=====\n" +
                "Employee Number: " + this.employeeNum + "\n" +
                "Employee Name: " + getEmployeeName() + "\n" +
                "Salary: " + this.salary + "\n" +
                "Bonus: " + getBonus() +"\n" +
                "New Salary: " + (this.salary + getBonus());
    }

    public double getBonus(){
        double bonus = 0;
        if (this.salary >= 12000 && this.salary < 15000){
            bonus = 1200;
        } else if (this.salary >= 15000) {
            bonus = 1500;
        }
        return bonus;
    }
}
