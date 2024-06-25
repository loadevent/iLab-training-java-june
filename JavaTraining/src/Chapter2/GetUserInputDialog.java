package Chapter2;

import javax.swing.*;

public class GetUserInputDialog {
    public static void main(String[] args) {
        int age;
        String strName;
        //Assign
        strName = JOptionPane.showInputDialog("What is your name?");
        //use
        JOptionPane.showMessageDialog(null,"Hello, " + strName);
    }
}
