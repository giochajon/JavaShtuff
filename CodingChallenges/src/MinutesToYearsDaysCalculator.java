public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if (minutes < 0 ) {
            System.out.println("Invalid Value");}
        else {
            long ano = minutes / 525600;
            long dia = (minutes % 525600) / 1440;
            System.out.println(minutes + " min = " + ano + " y and " + dia + " d");
        }

    }

    public static void main(String[] args) {
       printYearsAndDays(561600);
    }

}
