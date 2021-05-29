import java.util.Scanner;

public class PositiveInteger2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        System.out.print("Enter a positive number: ");
        int pNmb = sc.nextInt(); // pNmb means positive number

        if (pNmb > 0) {
            for (int i = 0; i < pNmb; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
                System.out.printf("The result of the sum is:  %d%n", sum);
            } else {
                System.out.println("!!!The number you entered is not positive!!!");
        }
    }
}
