public class AbsExample {
    public static void main(String[] args) {
        int intNumber = 5;
        long longNumber = -10L;
        float floatNumber = -7.5f;
        double doubleNumber = -15.8;

        // Using Math.abs() for different numeric types
        int absInt = Math.abs(intNumber);
        long absLong = Math.abs(longNumber);
        float absFloat = Math.abs(floatNumber);
        double absDouble = Math.abs(doubleNumber);

        // Displaying the results
        System.out.println("Absolute value of int: " + absInt);
        System.out.println("Absolute value of long: " + absLong);
        System.out.println("Absolute value of float: " + absFloat);
        System.out.println("Absolute value of double: " + absDouble);
    }
}

