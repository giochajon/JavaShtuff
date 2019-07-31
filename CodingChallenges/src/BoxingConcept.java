import java.util.ArrayList;

public class BoxingConcept {

    public static void main(String[] args) {

        // Boxng is representing a primitive type as a class
        // an array list can only take classes not primitives so it is an excelent example of boxing
        // autoboxing is when such class takes a value directly instead of using a setter example: Integer myIntValue = 56; instead of Integer.valueOf(56);




        ArrayList<Double> myDoubleValues = new ArrayList<Double>();

        for(double dbl=5.0; dbl<=10.5; dbl += 0.5) {
            myDoubleValues.add(dbl);
        }

        for(int i=0; i<myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i);
            System.out.println(i + "  --> " + value);
        }

    }

}
