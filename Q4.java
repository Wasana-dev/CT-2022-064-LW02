import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("\n--This program calculates the number of calories you need in one day--");
        double weight, calories;

        //getting inputs
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your body weight (pounds): ");
        weight = input.nextInt();

        //calculation
        calories = weight * 19;

        //print
        System.out.println("You need " + calories + "cal per day.");
    }
}
