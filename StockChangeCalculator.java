import java.text.DecimalFormat;
import java.util.Scanner;

public class StockChangeCalculator {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.print("Enter the stock symbol: ");
        String sym = get.next();
        System.out.print("Enter " + sym + 4 + "'s " + "day 1 value: ");
        double day1 = get.nextDouble();
        System.out.print("Enter " + sym + "'s " + "day 2 value: ");
        double day2 = get.nextDouble();

        double result = ((day2 - day1)/day1 * 100);
        DecimalFormat f = new DecimalFormat("##.00");
        System.out.println(sym + " has changed " + f.format(result) + "% in one day.");
        
    }
}