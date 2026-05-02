import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("\n--This program prints out the temperature in Fahrenheit--");
        double celsius, fahrenheit;

        //getting inputs
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        celsius = input.nextDouble();

        //calculation
        fahrenheit = (1.8 * celsius) + 32;

        //print
        System.out.println("Temperature is " + fahrenheit + "F.");
    }
}
