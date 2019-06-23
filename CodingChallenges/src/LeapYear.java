public class LeapYear {
    public static boolean isLeapYear (int year) {
        boolean leap = false;
        if (year > 9999 || year < 1 ) {return false;}

        if (year % 4 == 0) {
            //step2

            if (year % 100 == 0) {
                if (year % 400 == 0) { leap = true;} else {return false;}
            }
            leap = true;


        return leap;

        }
        return leap;
    }

}