package logical;


import java.util.Scanner;

public class SimulateStopWatch {
    public static void main(String[] args) {
        long time,time2 = 0;
        time= System.nanoTime();
        Scanner sc = new Scanner(System.in);
        int a=0;
        while(a!=1){
            System.out.println("Enter 1 to stop the watch");
            a=sc.nextInt();
            time2=System.nanoTime();

        }
        System.out.println((time2-time)/1e+9+" is the number of seconds the stop watch ran for ");

     }

        }

