package FamilyOfCalculator;

public class AccountCalculator extends SimpleCalculator {
    public AccountCalculator(){

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
    public void yearSalary (double salary, double months){
        double netSalary = months  * salary - 23.0 * salary;
        System.out.println("Your year salary after tax will be = " + netSalary);
    }
    public void monthCredit (double sum, double month){
            System.out.println("Monthly fee will be: " + sum + " / " + month + " = " + (sum / month));
        }
    }

