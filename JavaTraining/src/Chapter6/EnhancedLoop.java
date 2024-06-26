package Chapter6;

public class EnhancedLoop {
    public static void main(String[] args) {
        String[] arHobbies = {"Chess","Tennis","Soccer","Hiking"};//length = 4
                            //0      1     2      3     4      5     6
        double[] arPrices = {7.5, 14.59, 18.30, 9.00, 15.50, 8.59, 15.59};

        for(double price : arPrices){
            if (price > 9.00)
            System.out.println(price);
        }
    }
}
