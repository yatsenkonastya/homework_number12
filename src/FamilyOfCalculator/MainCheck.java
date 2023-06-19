package FamilyOfCalculator;
import java.util.Scanner;

public class MainCheck {
        public static void main(String[] args) {
            EngineerCalculator engineer = new EngineerCalculator();
            ProgramCalculator program = new ProgramCalculator();
            FinanceCalculator financial = new FinanceCalculator();
            AccountCalculator account = new AccountCalculator();
            SimpleCalculator calculator = new AccountCalculator();


            System.out.println("Overrided functions for each calculator");
            calculator.summ(6,9);
            engineer.division(7, 0);
            program.summ(3, 8);
            financial.subtraction(9,4);
            account.multiplication(5,4);
            System.out.println("\n");

            System.out.println("Special functions for each calculator");
            engineer.ceil(13);
            program.hexToBit(132);
            financial.sellMargin(300,160);
            account.monthCredit(11,1459);
    }
}
