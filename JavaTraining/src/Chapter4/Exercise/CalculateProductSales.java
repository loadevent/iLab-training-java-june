package Chapter4.Exercise;

import java.util.Scanner;

/*The program should ask the user to choose a product number,
* enter quantity bought then calculate the total sales. The available products
* are as follows: 1 - Orange = R5.50, 2 - Mango = R4.50, 3 - Apple = R3.59*/
public class CalculateProductSales {
    public static void main(String[] args) {
        int productNum;
        int quantity;
        double totalCost = 0;
        final double ORANGE_PRICE = 5.50;
        final double MANGO_PRICE = 4.50;
        final double APPLE_PRICE = 3.59;
        Scanner sc = new Scanner(System.in);

        //Using a while loop
//        System.out.print("1 - Orange = R5.00 " +
//                "\n2 - Mango = R4.50 " +
//                "\n3 - Apple = R3.59" +
//                "\nEnter (1,2 or 3):  ");
//
//        productNum = sc.nextInt();
//
//        while (productNum < 1 || productNum > 3){
//            System.out.print("Invalid option. See options below:\n" +
//                    "\n1 - Orange = R5.00 " +
//                    "\n2 - Mango = R4.50 " +
//                    "\n3 - Apple = R3.59" +
//                    "\nEnter (1,2 or 3):  ");
//
//            productNum = sc.nextInt();
//        }

        //Using a Do-While loop

        do {
            System.out.print("1 - Orange = R5.00 " +
                   "\n2 - Mango = R4.50 " +
                   "\n3 - Apple = R3.59" +
                    "\nEnter (1,2 or 3):  ");

           productNum = sc.nextInt();
        }while (productNum < 1 || productNum > 3);

            System.out.print("Enter quantity: ");
            quantity = sc.nextInt();

            if (productNum == 1){
                totalCost = ORANGE_PRICE * quantity;
            } else if (productNum == 2) {
                totalCost = MANGO_PRICE * quantity;
            } else if (productNum == 3) {
                totalCost = APPLE_PRICE * quantity;
            }

        System.out.println("Total Cost: " + totalCost);


    }
}
