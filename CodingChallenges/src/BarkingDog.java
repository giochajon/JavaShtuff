public class BarkingDog {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,1));
        System.out.println(shouldWakeUp(false,2));
        System.out.println(shouldWakeUp(true,8));
        System.out.println(shouldWakeUp(true,-1));
    }


    public static boolean shouldWakeUp (boolean barking, int hora){
        boolean deveriamos = false;
        if (hora <0 || hora > 23) {return false;}
        if (barking && (hora < 8 || hora >= 23)) {deveriamos = true;}



        return deveriamos;

    }
}
