public class DecimalComparator {


    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.203,3.2038));

        System.out.println(areEqualByThreeDecimalPlaces(3.203,3.2038));

        System.out.println(giveMeTwoDecimals(20.3034));
    }



    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){

        //DecimalFormat myFormat = new DecimalFormat("#.000");

        System.out.println(String.format("%.4f",firstNumber).substring(0,String.format("%.4f",firstNumber).length()-1));
        System.out.println(String.format("%.4f",secondNumber).substring(0,String.format("%.4f",secondNumber).length()-1));



        if (String.format("%.4f",firstNumber).substring(0,String.format("%.4f",firstNumber).length()-1).equals(String.format("%.4f",secondNumber).substring(0,String.format("%.4f",secondNumber).length()-1)))  {return true;}

        return false;
    }

    public static boolean areEqualByTwoDecimalPlaces(double firstNumber, double secondNumber){

        System.out.println(String.format("%.3f",firstNumber).substring(0,String.format("%.3f",firstNumber).length()-1));
        System.out.println(String.format("%.3f",secondNumber).substring(0,String.format("%.3f",secondNumber).length()-1));

        if (String.format("%.3f",firstNumber).substring(0,String.format("%.3f",firstNumber).length()-1).equals(String.format("%.3f",secondNumber).substring(0,String.format("%.3f",secondNumber).length()-1)))  {return true;}

        return false;

    }

    public static float giveMeTwoDecimals(double myNumber){

        String s = (String.format("%.3f",myNumber).substring(0,String.format("%.3f",myNumber).length()-1));

        float f = Float.parseFloat(s);

        return f;

    }

}
