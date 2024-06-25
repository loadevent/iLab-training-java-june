package Chapter3;

public class SwitchControlStructure {
    public static void main(String[] args) {
        int dayNumber = 8;
        String results = "No results";
//        if (dayNumber == 1){
//            results = "Monday";
//        }else if(dayNumber == 2){
//            results = "Tuesday";
//        }else if(dayNumber == 3){
//            results = "Wednesday";
//        }else{
//            results = "Unknown";
//        }
        /*---------------------------------------------------
        * Switch statement checks for equality*/

        switch (dayNumber){
            case 1: results = "Monday";
            break;
            case 2: results = "Tuesday";
                break;
            case 3: results = "Wednesday";
                break;
            case 4: results = "Thursday";
                break;
            case 5:results = "Friday";
            break;
            case 6: results = "Saturday";
            break;
            case 7:results = "Sunday";
            break;
            default:results = "Unknown";
        }

        System.out.println(results);

    }


}
