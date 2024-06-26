package Chapter5;

import javax.swing.*;

//Methods that return a values
public class ValueTypeMethods {
    public static void main(String[] args) {
//        String msg;
//        //variable = value
//        msg = getMessage();
        int num = 7;
        //JOptionPane.showMessageDialog(null,getMessage());
        int length = getTextLength("Kabelo");
        System.out.println("Length: " + length);
        System.out.println("Is (" + num + ") Even?: " + isEven(num));

    }
    //Method to return a message;
    public static String getMessage(){
        return "Welcome to iLAB";
    }
    //Method to return the length of text
    static int getTextLength(String text){
        int length = text.length();
        return length;
    }

    /*Method to check if a number is even or not.
    The method should return either true or false
     */
    static boolean isEven(int number){
//        boolean results = false;
//        //13
//        if (number %2 == 0)//false
//            results = true;//
//
//        return results;//false
        //Or you can optimize the code as follows
        return (number %2 == 0);
    }



}
