package FamilyOfCalculator;
import java.util.Scanner;

public class MainCheck {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println(" Choose calculator:\\s\n" +
                        "                1 - accounting calculator\\s\n" +
                        "                2 - engineer calculator\n" +
                        "                3 - financial calculator\n" +
                        "                4 - programming calculator\n" +
                        "                5 - simple calculator\n"


                );
        int value = scan.nextInt();
        switch (value){
            case 1:
                AccountCalculator.sum(2,5);
                AccountCalculator.division(9, 7);
                AccountCalculator.multiplication( 18, 9);
                AccountCalculator.subtraction(24, 12);
                AccountCalculator.yearSalary(7840, 12);
                AccountCalculator.monthCredit(300, 3);
                System.out.println("---------------------------------");
                break;
            case 2:
                EngineerCalculator.sum(5, 9);
                EngineerCalculator.division(9, 7);
                EngineerCalculator.multiplication(9,5);
                EngineerCalculator.subtraction(8, 4);
                EngineerCalculator.ceil(27.92);
                EngineerCalculator.sinNumber(280);
                System.out.println("---------------------------------");
                break;
            case 3:
                FinanceCalculator.sum(89, 6);
                FinanceCalculator.division(5,7);
                FinanceCalculator.multiplication(9, 4);
                FinanceCalculator.subtraction(4, 2);
                FinanceCalculator.depositInterest(6000,7,250);
                FinanceCalculator.sellMargin(100,60.5);
                System.out.println("---------------------------------");
                break;
            case 4:
                ProgramCalculator.sum(62, 51);
                ProgramCalculator.division(90, 43);
                ProgramCalculator.multiplication(54, 22);
                ProgramCalculator.subtraction(78,90.7);
                ProgramCalculator.hexToBit(128);
                System.out.println("---------------------------------");
                break;
            case 5:
                SimpleCalculator.division(76, 54);
                SimpleCalculator.subtraction(43, 58);
                SimpleCalculator.sum(3, 9);
                SimpleCalculator.multiplication(9, 11);
                System.out.println("---------------------------------");
                break;

        }
        scan.close();
    }
}
