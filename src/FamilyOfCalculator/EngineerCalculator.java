package FamilyOfCalculator;

public class EngineerCalculator extends SimpleCalculator {
    public EngineerCalculator() {
    }
    @Override
    public void summ (double a, double b){
        System.out.println("Summ: " + a + " + " + b + " = " + (a + b));
    }
    @Override
    public void subtraction (double a, double b){
        System.out.println("Subtraction: " + a + " - " + b + " = " + (a - b));
    }
    @Override
    public void division (double a, double b){
        try {
            System.out.println("Division: " + a + " / " + b + " = " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("We can't divide " + e.getMessage());
        }
    }
    @Override
    public void multiplication (double a, double b){
        System.out.println("Multiplication: " + a + " * " + b + " = " + (a * b));
    }

    public void ceil(double number) {
        System.out.println("Int ceil " + number + " = " + Math.ceil(number));
    }

    public void sinNumber(double number) {
        if (number < 360) {
            System.out.println("Sin of " + number + " = " + Math.sin(number));
        } else {
            System.out.println("Please enter value less than 360 degrees");
        }
    }
    }
