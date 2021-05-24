import java.util.Scanner;
public class incomeTax5
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);

        double tax;

        System.out.print("Enter income in GBP: ");
        int income = sc.nextInt();

        // nested if…else statements

        if (income <= 12500) {
            System.out.println("You don't need to pay any tax.");
        } else {
            if (12500 < income && income <= 50000) {
                tax = 0.2 * income;
                System.out.printf("Your tax is: %.2f GBP%n", tax);
            } else {
                if (50000 < income && income <= 150000) {
                    tax = 0.4 * income;
                    System.out.printf("Your tax is: %.2f GBP%n", tax);
                } else {
                    tax = 0.45 * income;
                    System.out.printf("Your tax is: %.2f GBP%n", tax);
                }
            }
        }

        // if…else if statements

        if(income <= 12500) {
            System.out.println("You don't need to pay any tax.");
        } else if (12500 < income && income <= 50000) {
            tax = 0.2 * income;
            System.out.printf("Your tax is: %.2f GBP%n", tax);
        } else if (50000 < income && income <= 150000) {
            tax = 0.4 * income;
            System.out.printf("Your tax is: %.2f GBP%n", tax);
        } else {
            tax = 0.45 * income;
            System.out.printf("Your tax is: %.2f GBP%n", tax);
        }
    }
}


