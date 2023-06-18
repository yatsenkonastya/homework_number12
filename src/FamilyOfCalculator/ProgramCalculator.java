package FamilyOfCalculator;

import java.util.Arrays;

public class ProgramCalculator extends SimpleCalculator{
    public ProgramCalculator(){

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
    public void hexToBit(int numberHex) {

        int printNumberHex = numberHex;

        String bit = "";
        int i = 0;
        boolean flag = true;

        while (flag) {
            if (i == 0) {
                if ((numberHex % 2) == 0) {
                    bit += "0";
                } else bit += "1";
                i++;
            } else {
                if (numberHex != 1){
                    numberHex  = numberHex / 2;
                    if ((numberHex % 2) == 0) {
                        bit += "0";
                    } else  bit += "1";
                } else flag = false;
                i++;
            }
        }

        char[] arrayBit = bit.toCharArray();

        i = 0;
        while(i < ((arrayBit.length-1) / 2)){
            char temp = arrayBit[i];
            arrayBit[i] = arrayBit[arrayBit.length - 1 - i];
            arrayBit[arrayBit.length - 1 - i] = temp;
            i++;
        }
        System.out.println("Number of " + printNumberHex + " in bits " + Arrays.toString(arrayBit));
    }
}
