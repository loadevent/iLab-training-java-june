package Chapter3;

public class PrePostConditions {
    public static void main(String[] args) {
        int age = 25; //Initialize age
        int x = 10;

        System.out.println("=====Post Increment(age)=====");
        System.out.println("Initial age value is " + age);
        System.out.println("Increment age by 1 but keep the original value: " + age++);
        System.out.println("New age value is: " + age);

        System.out.println("=====Pre Increment(X)=====");
        System.out.println("Initial X is " + x);
        System.out.println("Increment X by 1 and overwite the original value " + ++x);
        System.out.println("New X value is: " + x);
    }
}
