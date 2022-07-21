import java.util.Scanner;

public class Variables2 {
    
    public static void main(String[] args) {
        Calculation calc = new Calculation();
    calc.calcMethod();
    }
    
}

class Calculation{

    private double number;
    private double result;

    public void calcMethod() {
        Scanner input = new Scanner(System.in);
        number = input.nextDouble();
        result = number * 2;
        System.out.println(result);
    }
}