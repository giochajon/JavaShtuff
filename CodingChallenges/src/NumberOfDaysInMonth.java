public class NumberOfDaysInMonth {
    public static int getDaysInMonth(int year, int month){
        if (((year<1)||(year>9999)) || ((month<1)||(month>12))) { return -1;
        } else
            if (LeapYear.isLeapYear(year) && month == 2) {return 29;} else
        {
            int result;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12 :
                result = 31;
                break;
            case 2:
                result =  28;
                break;


            //case 4: case 6: case 9: case 11:
               default:
                result =  30;
                break;

        }
        return result;


        }
    }

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(12,10000));
    }

}
