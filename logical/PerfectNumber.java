package logical;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();

        int perfect_number = PerfectNumber(number);
        if(perfect_number == number)
            System.out.println(number +" is a perfect  number");
        else
            System.out.println(number +" is not a perfect number because of " +perfect_number);

    }
    private static int PerfectNumber(int num){
        int i = 1;
        int sum = 0;
        for (i=1; i<num; i++) {
            if(num%i==0)
                sum += i;
        }
        return sum;
    }
}
