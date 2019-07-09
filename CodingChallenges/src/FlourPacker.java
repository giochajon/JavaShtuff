public class FlourPacker {

    public static boolean canPack( int bigCount,int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0  ) { return false;   }

        if (((goal % 5) <= smallCount) && ((goal /5 )<= bigCount )) {

          return true;

        }

        //else if   ((goal ) <= smallCount ) {return true;}
        //else if ( (goal % (bigCount*5) ) <= smallCount) { return true;}

         else if ( (goal / 5) > bigCount) {
            return ((((goal / 5) - bigCount) * 5) <= smallCount);
        }

        return false;
    }


    public static void main(String[] args) {
        System.out.println(canPack(0,5,6)); //false
        System.out.println(canPack(1,0,4)); //false
        System.out.println(canPack(2,0,9)); //false
        System.out.println(canPack(2,2,11)); //true
        System.out.println(canPack(2,1,5)); //true
        System.out.println(canPack(4,18,19)); //true
        System.out.println(canPack(0,5,5)); //true
        System.out.println(canPack(2,10,18)); //true



//        double total = 0.2;
//        for (int i=0 ; i<1000; i++) { total = total + 0.2;}
//        System.out.println("total: "+ total);


    }

}
