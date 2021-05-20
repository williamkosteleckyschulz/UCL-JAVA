// Compare 2 numbers with if statements
public class Comparison1
{
    public static void main(String[] args)
    {
        int x = 10;
        int y = 30;

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
