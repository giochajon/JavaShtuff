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

    public static void main(String[] args) {
        System.out.println("Then sum of the digits in number 125 is "+ sumaDigitos(125));
    }

}
