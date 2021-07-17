package logical;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        int CELSIUS_TO_FAHRENHEIT = 1;
        int FAHRENHEIT_TO_CELSIUS = 2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Press 1 to convert temperature from celsius to fahrenheit or press 2 for vice versa ");
        int option = sc.nextInt();

        if (option == CELSIUS_TO_FAHRENHEIT) {

            System.out.println("Enter the temperature in degree celsius : ");
            double temp1 = sc.nextDouble();

            double result = celsiusToFahrenheit(temp1);
            System.out.println("The temperature in degree Fahrenheit is: " + result);

        } else if (option == FAHRENHEIT_TO_CELSIUS) {

            System.out.println("Enter the temperature in degree Fahrenheit : ");
            double temp2 = sc.nextDouble();

            double result1 = fahrenheitToCelsius(temp2);
            System.out.println("The temperature in degree Fahrenheit is: " + result1);

        } else {

            System.out.println("Invalid Input !!! Please press 1 or 2");

        }

    }

    //returns temperature in degree Fahrenheit
    public static double celsiusToFahrenheit(double temp1) {

        double tempInFahrenheit = (temp1 * 9 / 5) + 32;
        return tempInFahrenheit;

    }

    // returns temperature in degree Celsius
    public static double fahrenheitToCelsius(double temp2) {

        double tempInCelsius = (temp2 - 32) * 5 / 9;
        return tempInCelsius;
    }
}
