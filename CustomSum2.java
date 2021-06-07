import java.util.Scanner;

public class CustomSum2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter Number 1: ");
        int nmb1 = sc.nextInt();

        System.out.print("Please enter Number 2: ");
        int nmb2 = sc.nextInt();

        int result = add(nmb1, nmb2);
        System.out.printf("The sum is:  %d%n", result);

    }

    public static int add (int a, int b)
    {
        int sum = Math.addExact(a, b);

        return sum;
    }
}
