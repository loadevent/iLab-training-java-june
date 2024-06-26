package Chapter6;

/*Array elements are index based*/
public class CreatingArrays {
    public static void main(String[] args) {
        //Declaring arrays with initial values
        //index          0 1 2 3
        int[] numbers = {4,7,8,2};//size = 4
        String[] arHobbies = {"Chess","Tennis","Hiking"};
        double[] arPrices = {7.5, 14.59, 18.30};
        //Declaring array without values
        int[] arEvenNumbers = new int[55];//To store 55 elements

        //assign values to an array
        arEvenNumbers[0] = 12;
        arEvenNumbers[1] = 18;
        arEvenNumbers[2] = 64;

        //access array elements
        int age = arEvenNumbers[1];//8
        String favHobby = arHobbies[1]; //Tennis
        //overwrite array elements
        numbers[2] = 100;
        System.out.println(numbers[2]);//8
        System.out.println(arEvenNumbers[1]);
    }
}
