package logical;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.print("Enter the date: ");
        int date = input.nextInt();
        System.out.print("Enter the month: 1. JANUARY" +"\n" +
                "                 2. FEBRUARY" +"\n" + "                 3. MARCH" +"\n" +
                "                 4. APRIL" +"\n" + "                 5. MAY" +"\n" +
                "                 6. JUNE" +"\n" +"                 7. JULY" +"\n" +
                "                 8. AUGUST" +"\n" +"                 9. SEPTEMBER"+"\n" +
                "                10. OCTOBER" +"\n" +"                11. NOVEMBER"+"\n" +"                12. DECEMBER: ");
        int month = input.nextInt();

        if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
            if(date >= 1 && date <= 31)
                dayOfWeek(year, month, date);
            else
                System.out.println("Wrong DATE inserted!");
        }
        else if(month==4 || month==6 || month==9 || month==11) {
            if(date >= 1 && date <= 30)
                dayOfWeek(year, month, date);
            else
                System.out.println("Wrong DATE inserted!");
        }
        else if(month==2){
            if(date >= 1 && date <= 29)
                dayOfWeek(year, month, date);
            else
                System.out.println("Wrong DATE inserted!");
        }

    }
    private static void dayOfWeek (int y, int m, int d) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;

        if(d0==0)
            System.out.println("The day is: SUNDAY");
        else if(d0==1)
            System.out.println("The day is: MONDAY");
        else if(d0==2)
            System.out.println("The day is: TUESDAY");
        else if(d0==3)
            System.out.println("The day is: WEDNESDAY");
        else if(d0==4)
            System.out.println("The day is: THURSDAY");
        else if(d0==5)
            System.out.println("The day is: FRIDAY");
        else if(d0==6)
            System.out.println("The day is: SATURDAY");
    }
}
