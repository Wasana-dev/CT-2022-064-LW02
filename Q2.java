import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("\n--This program converts centimeter to feet and inches--");
        int cm, feet, inch;
        double inches;

        //getting inputs
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length in centimeter: ");
        cm = input.nextInt();

        //calculation
        inches = cm / 2.54;
        feet = (int) (inches / 12);
        inch = (int) (inches % 12);

        //print
        System.out.println(cm + " cm = " + feet + " feet " + inch + " inches");
    }
}
