public class FlourPacker {

    public static boolean canPack( int bigCount,int smallCount, int goal) {

     // bigCount is 5 kilo
     // smallCount is 1 Kilo
     // goal is the amount of kilos to assemble the package


        if ((((bigCount * 5) / goal)  != 1  ) && ((bigCount * 5 ) + smallCount)  >= goal  )  {return true;}
        System.out.println((bigCount * 5 ) + smallCount);
        System.out.println((bigCount * 5) / goal)    ;
        return false;
    }


    public static void main(String[] args) {
        System.out.println(canPack(1,0,5));
    }

}
