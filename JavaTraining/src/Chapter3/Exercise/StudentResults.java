package Chapter3.Exercise;

import java.util.Scanner;
/*The program should accept the student name and test mark from
* the user. Determine the symbol as follows: 80 - 100 = A, 60 - 79 = B
* 50 - 59 = C, 40 - 49 = D, less than 40 = F
* Display results as follows: A - Outstanding, B - Excellent, C - Pass,
* D - Need some work, F - Fail */
public class StudentResults {
    public static void main(String[] args) {
        int testMark;
        String stName;
        String grade = "F";
        String result = "Fail";
        Scanner sc = new Scanner(System.in);

        //Get input from the user.
        System.out.print("Enter Student name: ");
        stName = sc.nextLine();
        System.out.print("Enter Test Mark for " + stName + ": ");
        testMark = sc.nextInt();

        //logic to determine the symbol
        if (testMark >= 0 && testMark <= 100){
            if (testMark >= 80){ //80+
                grade = "A";
            }else if(testMark >= 60){ //79
                grade = "B";
            } else if (testMark >= 50) {//59
                grade = "C";
            } else if (testMark >= 40) {//49
                grade = "D";
            }else{
                grade = "F";//39-
            }
        }else{
            System.out.println("Test mark should be from 0 to 100");
        }

        //switch statement to determine the results
        switch (grade){
            case "A" : result = "Outstanding";
            break;
            case "B" : result = "Excellent";
            break;
            case "C" : result = "Pass";
            break;
            case "D" : result = "Need some work";
            break;
            case "F" : result = "Fail";
        }

        //Display results
        System.out.println("=================OUTPUT========================");
        System.out.println("Student Name: " + stName);
        System.out.println("Test Mark: " + testMark);
        System.out.println("Grade: " + grade);
        System.out.println("Result: " + result);


    }
}
