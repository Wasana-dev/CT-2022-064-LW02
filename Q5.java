import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        System.out.println("\n--This program converts the temperature in Celsius--");
        double fahrenheit, celsius;

        //getting input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit: ");
        fahrenheit = input.nextInt();

        //calculation
        celsius = (((double) 5 / 9) * (fahrenheit - 32));

        //print
        System.out.println("Temperature is " + celsius + "C.");
    }
}
