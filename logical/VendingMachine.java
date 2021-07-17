package logical;

import java.util.Scanner;

public class VendingMachine {
    static int[] notes = new int[]{1000, 500, 100, 50, 10, 5, 2, 1};
    static int i;

    static int[] notesCounter = new int[8];
    static int totalNotes = 0;

    public static void main(String[] args) {
        System.out.println("Enter the amount : ");
        Scanner sc = new Scanner(System.in);

        int amount = sc.nextInt();
        moneyCalculator(amount);
    }
    public static void moneyCalculator(int amount){
        for (i = 0; i < notes.length; i++){
            if (amount >= notes[i]){
                notesCounter[i] = amount / notes[i];
                amount %= notes[i];
                totalNotes += notesCounter[i];
                moneyCalculator(amount);
                return;
            }
            if (amount == 0)
                break;
        }
        System.out.println("The minimum number of notes are : " + totalNotes);
        System.out.println("Currency Count is : ");
        for (i = 0; i < notesCounter.length; i++){
            if (notesCounter[i] != 0)
                System.out.println(notes[i] + " : " + notesCounter[i]);

        }

    }

    }

