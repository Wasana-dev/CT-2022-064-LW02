import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        System.out.println("\nThis program is a loan calculator");

        double loanAmount, annualInterestRate, monthlyInterestRate, monthlyPayment, totalPayment;
        int loanPeriod, numberOfPayments;
        final int MONTHS_IN_YEAR = 12;

        //getting inputs
        Scanner input = new Scanner(System.in);

        System.out.print("Loan amount: ");
        loanAmount = input.nextDouble();

        System.out.print("Annual interest rate (%): ");
        annualInterestRate = input.nextDouble();

        System.out.print("Loan period (years): ");
        loanPeriod = input.nextInt();

        //calculation
        monthlyInterestRate = annualInterestRate / 100.0 / MONTHS_IN_YEAR;

        numberOfPayments = loanPeriod * MONTHS_IN_YEAR;

        monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 / (1 + monthlyInterestRate), numberOfPayments));

        totalPayment = monthlyPayment * numberOfPayments;

        //print
        System.out.println("Your monthly payment is Rs. " + monthlyPayment);
        System.out.print("Your total payment is Rs. " + totalPayment);
    }
}
