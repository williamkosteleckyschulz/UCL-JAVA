/* Compare 2 numbers inputed by the user and see if they are equal or
 if one is superior than the other using if statements*/
import java.util.Scanner;
public class userComparison2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = sc.nextInt();

        System.out.print("Enter the second number: ");
        int y = sc.nextInt();

        if(x < y)
        {
            System.out.printf("The value of x (%d) is less than the value of y (%d). \n", x, y);
        }

        if(x == y)
        {
            System.out.printf("The value of x (%d) equals the value of y (%d).\n", x, y);
        }

        if(x > y)
        {
            System.out.printf("The value of x (%d) is greater than the value of y (%d).\n", x, y);
        }
    }
}
