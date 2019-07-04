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


    public static int getEvenDigitSum (int number){
        if (number <0 ) {return -1;}
        int sum = 0;

        // e.g. 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5

        while (number >0 ){

            // extracting least-significant digit
            int digit = number % 10;
            if (digit %2 ==0) {
                sum += digit;
            }

            // drop the least-significant digit
            number /=10; // same as number = number /10;
        }

        return sum;
    }

    public static boolean hasSharedDigitDos (int first, int second) {
        if ((first <= 10 || first >= 99) || (second <= 10 || second >= 99)) {return false;}

        while (first >0 ){

            // extracting least-significant digit
            int digit = first % 10;
            if (hasDigit(digit,second) ) {
                return true;
            }

            // drop the least-significant digit
            first /=10; // same as number = number /10;
        }

        return false;

    }


    public static boolean hasDigit (int pattern, int number){
        if ((pattern < 0 || pattern >= 9) ) {return false;}

        while (number >0 ){

            // extracting least-significant digit
            int digit = number % 10;
            if (digit  ==pattern) {
                return true;
            }

            // drop the least-significant digit
            number /=10; // same as number = number /10;
        }

        return false;

    }


    public static boolean hasSharedDigitNoSirve (int first, int second) {
        if ((first <= 10 || first > 99) || (second <= 10 || second > 99)) {return false;}

        while (first >0 ){

            // extracting least-significant digit
            int digit = first % 10;

            while (second >0 ){

                // extracting least-significant digit
                int digit2 = second % 10;
                if (digit2  == digit) {
                    return true;
                }

                // drop the least-significant digit
                second /=10; // same as number = number /10;
            }

            // drop the least-significant digit
            first /=10; // same as number = number /10;
        }
        return false;
    }


    public static boolean  hasSharedDigit(int first, int second ){
        if ((first <= 10 || first > 99) || (second <= 10 || second > 99)) {return false;}

        int a = first % 10;
        int b = first / 10;
        int c = second % 10;
        int d = second /10;
      if (((a - c == 0) || (a - d ==0)) || ((b - c ==0) || (b - d ==0) )) {return true;}
        //System.out.println(" a "+a +" b "+b +" c "+c  +" d "+d );
        //System.out.println(b - d ==0);
      return false;
    }


    public static boolean hasSameLastDigit (int first, int second, int third ) {
        if (!isValid(first) || !isValid(second) || !isValid(third)) {return false;}

        int a =  first % 10;
        int b =  second % 10;
        int c =  third % 10;

        if ((a - b == 0) || (b - c ==0) || (a - c ==0) ) {return true;}

        return false;
    }

    public static boolean isValid (int numero){
        if (numero >= 10 && numero <= 1000) {return true;}
        return false;
    }



    public static int getGreatestCommonDivisor (int first, int second) {
    if ((first < 10 ) || (second < 10 )) {return -1;}
    int i;
    int min;
    if (first < second) {min = first; } else {min = second;}
    for ( i = min ; i > 1; i--) {
        if (( first % i ==0 ) && (second % i ==0)) {return i ;}
    }
    return i;
    }

    public static void printFactors(int i) {
        if (i < 1) {
            System.out.println("Invalid Value");
        } else {
            for (int fun = 1; fun <= i; fun++) {
                if (i % fun == 0) {
                    System.out.println(fun);
                }

            }
        }
    }

    public static boolean isPerfectNumber(int number){
        if (number < 1) {
            return false;

        } else {
            int tot = 0;
            for (int fun = 1; fun < number; fun++) {
                //System.out.println("tot"+tot+"fun"+fun );
                if (number % fun == 0) {
                    tot =tot + fun;
                }
            }
            //System.out.println("tot"+tot+"number"+number );
            if (tot == number) {return true;}
        }
        return false;
    }

    public static void main(String[] args) {
        //System.out.println("Then sum of the digits in number 125 is "+ sumaDigitos(125));
        //System.out.println("the number 121 is palindrome = " + isPalindrome(121));
        //System.out.println("the number -1221 is palindrome = " + isPalindrome(-1221));
       // System.out.println(sumFirstAndLastDigit(101));
        //System.out.println(getEvenDigitSum(252));
        //System.out.println(hasDigit(2,25));
        //System.out.println(hasSharedDigit(12,13));
        System.out.println("same digit:" + hasSameLastDigit(22,23,34));
        //System.out.println(getGreatestCommonDivisor(81,153));
        //printFactors(6);
        //System.out.println(isPerfectNumber(28));
    }

}
