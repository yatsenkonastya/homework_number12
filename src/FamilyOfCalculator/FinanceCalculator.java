package FamilyOfCalculator;

public class FinanceCalculator extends SimpleCalculator  {
    public FinanceCalculator(){

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
            System.out.println("Sorry,we can't divide by zero" + e.getMessage());
        }
    }
    @Override
    public void multiplication (double a, double b){
        System.out.println("Multiplication: " + a + " * " + b + " = " + (a * b));
    }
    public void depositInterest (double firstSum, double annualRate, int dayOfDeposit){
        double interestPaid = (firstSum * annualRate * dayOfDeposit / 365) / 100;
        System.out.println("Your interest income on the deposit will be = " + interestPaid);
    }
    public void sellMargin (double sellingPrice, double costPrice){
        double margin = (sellingPrice - costPrice) / sellingPrice * 100;
        System.out.println("Your selling margin will be = " + margin + " %");
    }
}
