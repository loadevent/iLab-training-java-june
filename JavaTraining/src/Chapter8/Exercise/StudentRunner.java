package Chapter8.Exercise;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testMark;
        String stName;
        String grade, results;
        Student[] students = new Student[3];//Array to store 3 student objects

        try {

            for (int i = 0; i < students.length; i++) {
                System.out.println("\nDetails for student " + (i + 1) + ": ");
                System.out.print("Enter Student name: ");
                stName = sc.next();
                System.out.print("Enter Test Mark for " + stName + ": ");
                testMark = sc.nextInt();

                Student st = new Student(stName,testMark);
                students[i] = st;

            }
            //array count = 3
            //st.setStName("La");
//            for (int i = 0; i < students.length; i++) {
//                System.out.println(students[i].toString());
//            }

            for (Student st : students){
                System.out.println(st.toString());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
