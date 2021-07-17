package logical;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int decimal = input.nextInt();

        decToBinary(decimal);
    }
    private static void decToBinary(int num)
    {
        //System.out.println(Integer.toBinaryString(num));
        int binary[] = new int[100];
        int index = 0;
        while(num > 0){
            binary[index++] = num%2;
            num = num/2;
        }
        System.out.print("Decimal to Binary: ");
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
    }
    }

