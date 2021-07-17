package logical;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class CouponNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of times you want to generate the coupon number: ");
        int number = input.nextInt();
        CouponNumbers(number);
    }
    private static void CouponNumbers(int number) {
        //For distinct numbers, use Set, since all its implementations remove duplicates
        Set<Integer> couponNumber = new LinkedHashSet<Integer>();
        //set range according to the number of times user want to generate coupon
        int range=10;
        if(number!=0 && number<=10)
            range = 10;
        else
            range *= number;
        while (couponNumber.size() < number) {
            couponNumber.add((int) Math.floor(Math.random() * range) + 1);
        }
        System.out.println("Distinct coupon numbers are: "+couponNumber);


    }
}
