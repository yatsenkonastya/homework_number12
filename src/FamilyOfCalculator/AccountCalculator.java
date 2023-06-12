package FamilyOfCalculator;

public class AccountCalculator extends SimpleCalculator {
    public AccountCalculator(){

    }
    public static void yearSalary (double salary, double months){
        double netSalary = months  * salary - 23.0 * salary;
        System.out.println("Your year salary after tax will be = " + netSalary);
    }
    public static void monthCredit (double sum, double month){
            System.out.println("Monthly fee will be: " + sum + " / " + month + " = " + (sum / month));
        }
    }

