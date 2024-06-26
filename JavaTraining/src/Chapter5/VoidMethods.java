package Chapter5;

public class VoidMethods {
    public static void main(String[] args) {

        String theName = "David", surname = "Smith";
        int theAge = 35;
        double theHeight = 1.78;

        displayMessage();
        displayText("Kabelo");
        displayFullName("Kabelo","Tlhape");
        displayFullName(theName,surname);
        displayDetails("Kabelo",25,theHeight);
    }
    //access specifier returnType methodName(parameters)
    public static void displayMessage(){
        System.out.println("Welcome to iLAB");
    }
    private static void displayText(String txt){
        System.out.println("==========================");
        System.out.println(txt);
    }

    static void displayFullName(String fName, String lName){
        System.out.println("=============FULL NAME=================");
        System.out.println(fName + " " + lName);
    }
    static void displayDetails(String name, int age, double height){
        System.out.println("\n========== Details for " + name + " ==========");
        System.out.println("Hi " + name + ", you are " + age + " years old.\n" +
                "Height: " + height);
    }







}
