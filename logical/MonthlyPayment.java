package logical;

import java.util.Scanner;

public class MonthlyPayment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Principal Amount: ");
        double p = input.nextDouble();
        System.out.print("Enter the Number of Years: ");
        double y = input.nextDouble();
        System.out.print("Enter the Rate of Interest: ");
        double r = input.nextDouble();

        monthlyPayment(p, y, r);
    }
    private static void monthlyPayment(double principal, double rateOfInterest, double year) {
        double n = 12 * year;
        double r = rateOfInterest / (12 * 100);
        double payment = (principal * r) / (1 - Math.pow((1 + r),(-n)));
        System.out.println("The monthly payment is: Rs. " +payment);
    }
}
