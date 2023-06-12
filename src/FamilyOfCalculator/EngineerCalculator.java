package FamilyOfCalculator;

public class EngineerCalculator extends SimpleCalculator {
    public EngineerCalculator() {

    }

    public static void ceil(double number) {
        System.out.println("Int ceil " + number + " = " + Math.ceil(number));
    }

    public static void sinNumber(double number) {
        if (number > 360) {
            System.out.println("Please enter value less than 360 degrees");
        } else {
            System.out.println("Sin of " + number + " = " + Math.sin(number));
        }
    }
}
