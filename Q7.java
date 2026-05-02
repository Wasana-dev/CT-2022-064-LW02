import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        System.out.println("\n--This program prints your Body Mass Index (BMI)--");
        int h, w;

        //getting inputs
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height (cm): ");
        h = input.nextInt();

        System.out.print("Enter your weight (kg): ");
        w = input.nextInt();

        //calculation
        double bmi = w / (Math.pow ((h / 100.0), 2));
        System.out.println(bmi);
        String status;
        if (bmi >= 20 && bmi <= 25) {
            status = "is normal.";
        } else {
            status = "should be within 20 and 25.";
        }

        //print
        System.out.println("Your BMI is " + bmi + " and it " + status);
    }
}
