package FamilyOfCalculator;

public class FinanceCalculator extends SimpleCalculator  {
    public FinanceCalculator(){

    }
    public static void depositInterest (double firstSum, double annualRate, int dayOfDeposit){
        double interestPaid = (firstSum * annualRate * dayOfDeposit / 365) / 100;
        System.out.println("Your interest income on the deposit will be: " + interestPaid);
    }
    public static void sellMargin (double sellingPrice, double costPrice){
        double margin = (sellingPrice - costPrice) / sellingPrice * 100;
        System.out.println("Your selling margin will be: " + margin + " %");
    }
}
