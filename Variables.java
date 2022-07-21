import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();

        //need to make an instance of the class Calculation in order to access the method
        Calculation calc = new Calculation();
        double answer = calc.calcMethod(number);
        System.out.println(answer);
    }
}

class Calculation{
    //the method takes a double argument and returns a double type
    public double calcMethod(double x) {
        double result = x * 2;
        return result;
    }
}