public class NumberToWords {

    public static int reverse (int number) {
    boolean negative = false;
        if (number < 0) { negative = true; number = number * -1; }

        int digits = getDigitCount(number);

    int temp = 0;
    int temp2 = 0;

    for (int i = digits; i>=1 ; i--) {
            temp = number % 10;
            temp = temp * (int) Math.pow(10, i);
            temp2 = temp2 + temp;
        number = number / 10;
    }
        if (negative) {return temp2 /-10 ;} else
        {return temp2 /10;}
    }

    public static int getDigitCount (int number) {
        if (number < 0) { return -1;
        } else {
            return (int) String.valueOf(number).length();

        }
    }


    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {

            int digits = getDigitCount(number);
            int inv = reverse(number);
            String word = "";

            for (int i = digits; i >= 1; i--) {

                switch (inv % 10) {
                    case 1:
                        word = word + "One ";
                        break;
                    case 2:
                        word = word + "Two ";
                        break;
                    case 3:
                        word = word + "Three ";
                        break;
                    case 4:
                        word = word + "Four ";
                        break;
                    case 5:
                        word = word + "Five ";
                        break;
                    case 6:
                        word = word + "Six ";
                        break;
                    case 7:
                        word = word + "Seven ";
                        break;
                    case 8:
                        word = word + "Eight ";
                        break;
                    case 9:
                        word = word + "Nine ";
                        break;
                    default:
                        word = word + "Zero ";


                }

                inv = inv / 10;


            }
            System.out.println(word);
        }
    }


    public static void main(String[] args) {
        //int x = getDigitCount(101);
        //System.out.println("gato" + x);
       System.out.println(reverse(-2));
        numberToWords(123);
    }

}
