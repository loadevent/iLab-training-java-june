package Chapter4;

public class LoopTerminationTechniques {
    public static void main(String[] args) {

        System.out.println("\n==============EXAMPLE 1 (break)====================\n");
        for (int i = 0; i < 5; i++) {
            //System.out.println("(" + i + ") Example 1");//0,1,2

            if (i == 2) break;
        }

        System.out.println("\n==============EXAMPLE 2 (continue)====================\n");

        for (int x = 0; x < 6; x++) {
            if(x == 3)continue;
            //System.out.println("(" + x + ") Example 2");//0,1,2,4,5
        }

        System.out.println("\n==============EXAMPLE 3 (continue)====================\n");
        //Modulus operator
        for (int x = 1; x < 6; x++) {
            if(x %2 == 0)continue;
            System.out.println("(" + x + ") Example 3");//1,3,5
        }
    }
}
