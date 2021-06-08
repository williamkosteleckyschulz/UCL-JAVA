import java.util.Scanner;

public class MinCharValue3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter Character 1: ");
        char char1 = sc.nextLine().charAt(0);

        System.out.print("Please enter Character 1: ");
        char char2 = sc.nextLine().charAt(0);

        System.out.print("Please enter Character 1: ");
        char char3 = sc.nextLine().charAt(0);

        character(char1, char2, char3);
    }

    public static char character (char a, char b, char c)
    {
      int x = a;
      int y = b;
      int z = c;

      System.out.printf("The int value of '%c' is: %d%n", a, x);
      System.out.printf("The int value of '%c' is: %d%n", b, y);
      System.out.printf("The int value of '%c' is: %d%n", c, z);

      int min = Math.min(a, Math.min(b, c));
      System.out.printf("The char with the smallest int value is: %c%n", (char)min);

        return 0;
    }
}
