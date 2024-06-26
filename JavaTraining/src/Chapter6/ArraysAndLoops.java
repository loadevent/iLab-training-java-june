package Chapter6;
/*Repetition structures can be used to access array elements*/
public class ArraysAndLoops {
    public static void main(String[] args) {
                            // 0         1        2       3
        String[] arHobbies = {"Chess","Tennis","Soccer","Hiking"};//length = 4
                           //0      1     2      3     4      5     6
        double[] arPrices = {7.5, 14.59, 18.30, 9.00, 15.50, 8.59, 15.59};
        int count = 0;

        //Display all the hobbies
                                        //4
        for (int i = 0; i <= arHobbies.length - 1; i++) {
            System.out.println(arHobbies[i]);
        }
        //Display prices that are greater than 9.00
        System.out.println("Prices greater than 9.00\n");
                                       //7
        for (int i = 0; i <= arPrices.length - 1; i++) {
            if (arPrices[i] > 9.00){
                System.out.println(arPrices[i]);
                count++;
            }
        }

        System.out.println("There are (" + count + ") prices greater than 9.00");

    }
}
