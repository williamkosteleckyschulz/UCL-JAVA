// import Scanner into the program
import java.util.Scanner;

//This program is to enter a four digit number and turn it into 4 separate digits

public class digit
{
    public static void main(String[] args)
    {
        //main method begins execution of Java application

        Scanner sc = new Scanner(System.in); //import scanner into main
        /* Creates a new object of type Scanner from the standard input of the program
        (in this case probably the console) and int i = input.nextInt() uses the nextInt Method of that object,
        which allows you to enter some text and it will be parsed into an integer */

        System.out.print("Please enter a four-digit number: ");
        int number = sc.nextInt(); //example : 1234

        int d1 = number / 1000; // d1 = 1234 / 1000 = 1 as it is an int

        int d2 = number / 100 - d1 * 10; // d2 = 12 - 10

        int d3 = number / 10 - d1 * 100 - d2 * 10; // d3 = 123 - 100 - 20 = 3

        int d4 = number - d1 * 1000 - d2 * 100 - d3 * 10; // d4 = 1234 - 1000 - 200 - 30 = 4

        System.out.printf("Digits in %d are: %d %d %d %d\n", number, d1, d2, d3, d4);
    }// end method main
}// end class Greeter
