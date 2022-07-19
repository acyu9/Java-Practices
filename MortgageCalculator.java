package Java;
import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = input.nextInt();

        while(principal < 1000 || principal > 1_000_000) {
            System.out.println("Princpal must be between $1k and $1M.");
            System.out.print("Principal: ");
            principal = input.nextInt();
        }
        
        //alternative way is to use an infinite loop until condition desired met
        float rate = 0;
        while (true) {
            System.out.print("Annual Interest Rate (%): ");
            rate = input.nextFloat();
            if (rate >= 0 && rate <= 30) {
                break;
            }
            System.out.println("Annual interest rate must be between 0 and 30.");
        }
        
        //convert rate % to decimal then to monthly rate
        float r = (rate / 100) / 12;

        byte period = 0;
        while (period < 1 || period > 30) {
            System.out.print("Period (Years): ");
            period = input.nextByte();
            if (period >= 1 && period <= 30)
            {
                break;
            }
            System.out.println("Period must be between 1 and 30.");
        }
        
        //mortgage calculations
        int n = period * 12;
        double power = Math.pow(1 + r, n);
        double mortgage = principal * r * power / (power - 1);

        //format mortgage to currency format
        //the format class is an abstract class so can't create instance/use new operator
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String mortgageCurrency = currency.format(mortgage);

        System.out.print("Mortage: " + mortgageCurrency);

        // The close() method releases the resources held by the Scanner
        ((Scanner) input).close();
    }
}
