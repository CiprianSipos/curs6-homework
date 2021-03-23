package ro.fasttrackit.curs6homework;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Insert temerature in Fahrenheit: ");
        double temperature = input.nextDouble();
        System.out.println("Temperature converted to celsius is: "+ fahrenheitToCelsius(temperature));

    }
    public static double fahrenheitToCelsius(double temperature){
        double conversionRate=(double)5/9;
        return (temperature-32)*conversionRate;

    }
}
