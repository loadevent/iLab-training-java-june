package Chapter2;

public class WorkingWithVariables {
    public static void main(String[] args) {
        //declare
        int age;
        double height;
        String strName;
        float salary;

        //assign
        age = 21;
        strName = "Kabelo";
        height = 1.78;
        salary = 15000.00F;

        //use
        System.out.println("Name: " + strName);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Salary: " + salary);
    }
}
