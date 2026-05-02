import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        System.out.println("\n--This program prints your age--");
        int bornYear, age;

        //getting inputs
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your born year: ");
        bornYear = input.nextInt();

        //calculation
        age = 2026 - bornYear;

        //print
        System.out.print("You were born in " + bornYear + " and you will be (are) " + age + " this year.");
    }
}
