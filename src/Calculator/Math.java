package Calculator;

public class Math {
    static public void sum (double a, double b){

        System.out.println(a + " + " + b + " = " + (a + b));
    }
    static public void multiplication (double a, double b){
        System.out.println(a + " * " + b + " = " + (a * b));
    }
    static public void percentageOfTheNumber (double number, double percent){
        System.out.println(percent + "% " + "of the number " + number + " = " + (number * percent / 100));
    }
}
