import java.util.Scanner;

public class Q1 {
    static void main(String[] args) {
        double A, B, C, X, Y, R;
        final double PI = 3.14;

        //getting inputs
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter a value for 'A': ");
        A = input.nextDouble();

        System.out.print("Enter a value for 'B': ");
        B = input.nextDouble();

        System.out.print("Enter a value for 'C': ");
        C = input.nextDouble();

        System.out.print("Enter a value for 'X': ");
        X = input.nextDouble();

        System.out.print("Enter a value for 'Y': ");
        Y = input.nextDouble();

        System.out.print("Enter a value for 'R': ");
        R = input.nextDouble();

        //Part a
        double expression1 = Math.pow(B, 2) + (4 * A * C);
        double answer1 = Math.sqrt(expression1);
        System.out.println("\nThe square root of (B^2 + 4AC) " + answer1);

        //Part b
        double expression2 = X + (4 * Math.pow(Y, 3));
        double answer2 = Math.sqrt(expression2);
        System.out.println("The square root of (X + 4Y^3) is " + answer2);

        //Part c
        double expression3 = X * Y;
        double answer3 = Math.cbrt(expression3);
        System.out.println("The cube root of the product of X and Y is " + expression3);

        //Part d
        double area = PI * (R * R);
        System.out.println("Are of the circle is " + area);
    }
}
