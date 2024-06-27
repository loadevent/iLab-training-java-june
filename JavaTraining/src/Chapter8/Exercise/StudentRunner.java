package Chapter8.Exercise;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testMark;
        String stName;
        String grade, results;

        try {
            System.out.print("Enter Student name: ");
            stName = sc.nextLine();//Kabelo
            System.out.print("Enter Test Mark for " + stName + ": ");
            testMark = sc.nextInt();
                            //        Kabelo
            Student st = new Student(stName,testMark);
            //st.setStName("La");

            System.out.println(st.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
