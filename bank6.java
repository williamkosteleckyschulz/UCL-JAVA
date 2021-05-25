import java.util.Scanner;

public class bank6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount: ");
        int amount = sc.nextInt();
        int notes50 = amount / 50;
        int notes20 = (amount % 50) / 20;
        int notes10 = ((amount % 50)%20) / 10;
        int notes5 = (((amount % 50)%20)%10) / 5;


        if (amount > 250 || amount < 5) {
            System.out.println("Amount requested exceeds the daily limit of withdrawals (£250)");
        } else {
            if (amount <= 250 && amount > 0) {
                System.out.println("Notes given out are: ");

                System.out.printf("£50 = %d%n", notes50);

                System.out.printf("£20 = %d%n", notes20);

                System.out.printf("£10 = %d%n", notes10);

                System.out.printf("£5 = %d%n", notes5);
            } else {
                System.out.print("Amount requested is below the £5 minimal");
            }
        }
    }
}
