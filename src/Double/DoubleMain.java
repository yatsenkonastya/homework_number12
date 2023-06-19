package Double;

public class DoubleMain {

    public static void main(String[] args) {

        double value = 352;
        Double doubleValue = Double.valueOf(value);
        Double doubleValue1 = Double.valueOf(31);
        System.out.println("Double type: " + doubleValue);
        System.out.println("Double type: " + doubleValue1 + "\n");

        String str = "63526";
        double strDouble = Double.parseDouble(str);
        System.out.println("String to double: " + strDouble + "\n");

        int doubleToInt = doubleValue.intValue();
        short doubleToShort = doubleValue.shortValue();
        long doubleToLong = doubleValue1.longValue();
        float doubleToFloat = doubleValue.floatValue();
        boolean doubleToBoolean = doubleValue1.isNaN();
        byte doubleToByte = doubleValue.byteValue();

        System.out.println("int value: " + doubleToInt);
        System.out.println("short value: " + doubleToShort);
        System.out.println("long value: " + doubleToLong);
        System.out.println("float value: " + doubleToFloat);
        System.out.println("boolean value: " + doubleToBoolean);
        System.out.println("byte value: " + doubleToByte);

        String d = Double.toString(3.14);
        System.out.println("\n");
        System.out.println("Double to string value is " + d);
        System.out.println("Is double value became to string? " + (d instanceof String));
    }
}
