import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        System.out.println("--\nThis program computes the volume of a sphere--");
        double r, v;

        //getting inputs
        final double PI = 3.14;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of sphere: ");
        r = input.nextDouble();

        //calculation
        v = (4.0 / 3) * (PI / (Math.pow(r, 3)));

        //print
        System.out.println("Volume of the sphere is " + v);
    }
}
