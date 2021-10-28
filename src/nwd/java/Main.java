package nwd.java;

public class Main {

    public static void main(String[] args) {
//        formatting
        String s = System.lineSeparator();
        /*find more info on Primitive Data Types at
        https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html*/

        /*Float: The float data type is a single-precision 32-bit IEEE 754 floating point.
        Its range of values is beyond the scope of this discussion,
        but is specified here https://docs.oracle.com/javase/specs/jls/se7/html/jls-4.html#jls-4.2.3.
        As with the recommendations for byte and short,
        use a float (instead of double) if you need to save memory in large arrays of
        floating point numbers. This data type should never be used for precise values,
        such as currency. For that, you will need to use the java.math.BigDecimal class instead.
        Numbers and Strings covers BigDecimal and other useful classes provided by the Java platform. */

        /*Double: The double data type is a double-precision 64-bit IEEE 754 floating point.
        Its range of values is beyond the scope of this discussion,
        but is specified here https://docs.oracle.com/javase/specs/jls/se7/html/jls-4.html#jls-4.2.3.
        For decimal values, this data type is generally the default choice.
        As mentioned above, this data type should never be used for precise values, such as currency.*/

//  Let's visualize these datatypes

        System.out.println("~~Float~~");
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float Maximum Value = " + myMaxFloatValue);

        System.out.println(s);

        System.out.println("~~Double~~");
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = 5.25f;
        double myDoubleValue = 5.25d;


    }
}
