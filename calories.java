// import Scanner into the program
import java.lang.Math;
import java.util.Scanner;

/* This program calculates the total number of calories burnt by taking input of ones
 (body weight, height, average speed, time walked) */

public class calories
{
    public static void main(String[] args)
    {
        //main method begins execution of Java application

        Scanner sc = new Scanner(System.in); //import scanner into main
        /* Creates a new object of type Scanner from the standard input of the program
        (in this case probably the console) and int i = input.nextInt() uses the nextInt Method of that object,
        which allows you to enter some text and it will be parsed into an integer */

        System.out.print("Please enter body weight (kg): ");
        double bw = sc.nextDouble(); // bw = bodyWeight
        /* The nextDouble() method of java.util.Scanner class scans the next token of the input as a Double.
        If the translation is successful, the scanner advances past the input that matched */
        System.out.print("Please enter height (m): ");
        double h = sc.nextDouble(); // h = height

        System.out.print("Please enter average speed (m/s): ");
        double s = sc.nextDouble(); // s = averageSpeed

        System.out.print("Please enter time walked (min): ");
        int t = sc.nextInt(); // t = timeWalked

        // The formula for calculating the total calories bunt (tcb)
        double tcb = t * ((0.035 * bw) + (Math.pow(s,2) / h * 0.029 * bw)); // tcb = totalCaloriesBurnt

        System.out.printf("The number of calories burnt is: %.2f (kcal) \n", tcb);
    }// end method main
}// end class Greeter
