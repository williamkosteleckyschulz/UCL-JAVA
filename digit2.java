import java.util.Scanner;
public class digit2
{
    public static void main(String[] args)
    {
        Scanner scr = new Scanner (System.in);

        System.out.print("Enter a four-digit integer:");
        int number = scr.nextInt();

        int d1 = number%10;
        int d2 = number/10%10;
        int d3 = number/100%10;
        int d4 = number/1000%10;
        System.out.printf("Digits in %d are: %d %d %d %d\n", number, d4, d3, d2, d1);
    }
}
