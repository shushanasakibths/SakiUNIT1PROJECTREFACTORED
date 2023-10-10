import java.util.Scanner;
import java.text.DecimalFormat;

// I learned how to use lists from here: https://www.w3schools.com/java/java_arraylist.asp

public class TipCalculatorRunner {
    private static final DecimalFormat df = new DecimalFormat("00.00");
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("This is the tip calculator!");
        System.out.println("---------------------------");
        System.out.print("Enter the number of people in your group: ");
        int numberOfPeople = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter the tip percentage as an integer: ");
        int tip = scan.nextInt();
        scan.nextLine();
        double itemPrice = 0;

        TipCalculator tipCalculator = new TipCalculator(numberOfPeople, tip);

        while (itemPrice != -1) {
            System.out.print("Please enter the price of an item you've ordered in dollars and cents, e.g. 12.50 (-1 to end):  ");
            itemPrice = scan.nextDouble();
            scan.nextLine();
            tipCalculator.addMeal(itemPrice);
            if (itemPrice == -1) {
                break;
            }
        }


        System.out.println("---------------------------");
        System.out.println("Total bill before tip: $" + df.format(tipCalculator.getTotalBillBeforeTip()));
        System.out.println("Total percentage: " + tip + "%");
        System.out.println("Total tip: $" + df.format(tipCalculator.tipAmount()));
        System.out.println("Total bill with tip: $" + df.format(tipCalculator.totalBill()));
        System.out.println("Per person cost before tip: $" + df.format(tipCalculator.perPersonCostBeforeTip()));
        System.out.println("Tip per person: $" + df.format(tipCalculator.perPersonTipAmount()));
        System.out.println("Total cost per person: $" + df.format(tipCalculator.perPersonTotalCost()));
        System.out.println("---------------------------");

    }
}