package logical;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.print("Enter the number to find whether it is prime or not: ");
        Scanner input = new Scanner(System.in);
        int primeFactor = input.nextInt();

        boolean result = isPrime(primeFactor);
        if (result == false)
            System.out.println(primeFactor + " is not a prime number.");
        else
            System.out.println(primeFactor + " is a prime number.");
    }

    private static boolean isPrime(int number) {
        boolean flag = true;
        if (number == 1 || number == 0)
            flag = false;
        else {
            for ( int i=2; i <= number/2; i++) {
                if( number%i ==0)
                    flag = false;
            }
        }
        return flag;
    }
}
