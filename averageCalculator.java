import java.util.Scanner;
public class averageCalculator
{

    public static void main(String[] args)
    {
        Scanner scr = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scr.nextLine();

        System.out.print("Please enter Number 1: ");
        int n1 = scr.nextInt(); // n1 is number 1
        System.out.print("Please enter Number 2: ");
        int n2 = scr.nextInt(); // n2 is number 2
        System.out.print("Please enter Number 3: ");
        int n3 = scr.nextInt(); // n3 is number 3
        double average = (n1 + n2 + n3) / 3;

        System.out.printf("      Hey %s \n", name);
        System.out.printf("      The average is: %.2f\n", average);
    }
}
