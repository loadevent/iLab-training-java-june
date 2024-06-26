package Chapter5.Exercise;

import java.util.Scanner;

public class StudentAverage {
    static double average;
    public static void main(String[] args) {


    }
    static int qualityPoints(double average){
        int points = 0;
        if (average>= 90 && average <= 100){
            points = 4;
        } else if (average >=80) {
            points = 3;
        }else if (average >= 70) {
            points = 2;
        }else if (average >= 60) {
            points = 1;
        }else {
            points = 0;
        }

        return points;
    }
    static void getUserInput(){
        int points;
        //Get input from the user.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Average: ");
        average = sc.nextDouble();

        points = qualityPoints(average);

        //Display
        System.out.println("Average: " + average + "\n" +
                "Points: " + points);

    }
}
