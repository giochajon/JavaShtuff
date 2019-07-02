public class sumDigits {

    public static int sumaDigitos(int number){

        if (number < 10) { return -1;}

        int sum = 0;

        // e.g. 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5

     while (number >0 ){

         // extracting least-significant digit
         int digit = number % 10;
         sum += digit;

         // drop the least-significant digit
         number /=10; // same as number = number /10;


     }

     return sum;
    }

    public static boolean isPalindrome(int number){
        if (number <0 ) {number =number * -1;}
        int acc = 0;
        int testNumber = number;

        while (testNumber >0 ){
            int digit = testNumber % 10;
            acc += digit;
            acc = acc  * 10;
            testNumber /=10; // same as number = number /10;

            //System.out.println("digit = "+digit + " acc " + acc );

        }


        if (acc/10 == number) {return true;}
        return false;


    }

    public static int sumFirstAndLastDigit (int number){
        if (number <0 ) {return -1;}
        int first = number % 10;
        int last = number ;
        do {
            if ((last /10)   <= 0  ) {
                break;
            }
           last = last / 10;
            //System.out.println("first"+first+" last "+last);

       } while (((last % 10) > 0) || ( (last /10) >0 ));

        return first+last;
    }

    public static void main(String[] args) {
        //System.out.println("Then sum of the digits in number 125 is "+ sumaDigitos(125));
        //System.out.println("the number 121 is palindrome = " + isPalindrome(121));
        //System.out.println("the number -1221 is palindrome = " + isPalindrome(-1221));
        System.out.println(sumFirstAndLastDigit(101));
    }

}
