package Chapter5.Exercise;

import java.util.Scanner;

public class StudentResults {
    //Global variables
    static int testMark;
    static String stName;
    static String grade;
    static String result;
    public static void main(String[] args) {
        getUserInput();
        grade = determineSymbol(testMark);//C
        result = determineResults(grade);//Pass
        displayOutput();

    }
    /*Take a student test mark, determine and
    return the grade
     */
                                    //56
    static String determineSymbol(int testMark){
        String grade = "F";

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

        return grade;//C

    }

    /*Take a grade, determine and
    * return results*/
                                    //C
    static String determineResults(String grade){
        String result = "Fail";

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

        return result;//Pass
    }

    static void displayOutput(){
        System.out.println("=================OUTPUT========================");
        System.out.println("Student Name: " + stName);
        System.out.println("Test Mark: " + testMark);
        System.out.println("Grade: " + grade);
        System.out.println("Result: " + result);
    }

    static void getUserInput(){
        //Get input from the user.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student name: ");
        stName = sc.nextLine();
        System.out.print("Enter Test Mark for " + stName + ": ");
        testMark = sc.nextInt();
    }
}
