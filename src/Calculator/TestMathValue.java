package Calculator;
import java.util.Scanner;

public class TestMathValue {
    static Scanner scan = new Scanner(System.in);
    static double value;


    static public double scanFirstValue(){
        System.out.println("Введіть перший елемент");
        value = scan.nextDouble();
        return value;
    }
    static public double scanSecondValue(){
        System.out.println("Введіть другий елемент");
        value = scan.nextDouble();
        return value;
    }
    public static void main(String[] args) {
        System.out.println(" 1 - Сума; \n 2 - Множення;\n 3 - Відсоток від числа");
        System.out.println("Введіть номер потрібного вичислення");

        int value = scan.nextInt();

        switch (value){
            case 1: Math.sum(scanFirstValue(), scanSecondValue()); break;
            case 2: Math.multiplication(scanFirstValue(), scanSecondValue()); break;
            case 3: Math.percentageOfTheNumber(scanFirstValue(), scanSecondValue()); break;
            default:
                throw new IllegalStateException("Некорректне число: " + value);
        }
        scan.close();
    }
}
