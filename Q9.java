import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        System.out.println("\n--This program computes the amount of money from an investment--");
        double money, years, rate, totalMoney;

        //getting inputs
        Scanner input = new Scanner(System.in);

        System.out.print("Hou much money do you want to invest: ");
        money = input.nextDouble();

        System.out.print("For how many years: ");
        years = input.nextDouble();

        System.out.print("What is the rate (%): ");
        rate = input.nextDouble();

        //calculation
        totalMoney = money * Math.pow((1 + rate / 100.0), years);

        //print
        System.out.print("The amount of money you can earn : Rs. " + totalMoney);
    }
}
