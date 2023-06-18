package FamilyOfCalculator;

public class EngineerCalculator extends SimpleCalculator {
    public EngineerCalculator() {
    }
    @Override
    public void sum (double a, double b){
        System.out.println("Sum: " + a + " + " + b + " = " + (a + b));
    }
    @Override
    public void subtraction (double a, double b){
        System.out.println("Subtraction: " + a + " - " + b + " = " + (a - b));
    }
    @Override
    public void division (double a, double b){
        if(b == 0){
            throw new ArithmeticException("Sorry,we can't divide by zero");
        } else {
            System.out.println("Division: " + a + " / " + b + " = " + (a / b));
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
        if (number > 360) {
            System.out.println("Please enter value less than 360 degrees");
        } else {
            System.out.println("Sin of " + number + " = " + Math.sin(number));
        }
    }
}
