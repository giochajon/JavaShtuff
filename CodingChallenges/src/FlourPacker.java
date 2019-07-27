public class FlourPacker {

    public static boolean canPack( int bigCount,int smallCount, int goal) {
        double mygoal = (double)goal;
        double mysmallCount =(double)smallCount;
        double mybigCount = (double)bigCount;


        if (mybigCount < 0 || mysmallCount < 0 || mygoal < 0  ) { return false;   }

        if (((mygoal % 5) <= mysmallCount) && ((mygoal /5 )<= bigCount )) {

          return true;

        }

        //else if   ((goal ) <= smallCount ) {return true;}
        //else if ( (goal % (bigCount*5) ) <= smallCount) { return true;}

         else if ( (mygoal / 5) > mybigCount) {
            return ((((mygoal / 5) - mybigCount) * 5) <= mysmallCount);
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
