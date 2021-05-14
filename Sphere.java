// import Scanner into the program
import java.lang.Math;
import java.util.Scanner;

public class Sphere
{
    public static void main(String[] args)
    {
        //main method begins execution of Java application

        Scanner sc = new Scanner(System.in); //import scanner into main
        /* Creates a new object of type Scanner from the standard input of the program
        (in this case probably the console) and int i = input.nextInt() uses the nextInt Method of that object,
        which allows you to enter some text and it will be parsed into an integer */

        System.out.print("Please enter the value for the radius: ");
        double radius = sc.nextDouble(); /* The nextDouble() method of java.util.Scanner class scans the next token of the input as a Double.
        If the translation is successful, the scanner advances past the input that matched */

        double diameter = 2 * radius;
        double surfaceArea = 4 * Math.PI * Math.pow(radius,2); /* Math.PI = π; and Math.pow(radius,x)
        radius is tha variable and the number on the right is the power given to the variable. Here radius is squared*/
        double volume = (4/3) * Math.PI * Math.pow(radius,3);

        System.out.printf("The diameter of the sphere is: %.2f\n", diameter); /* %.2f is a placeholder for double and
        gives 2 digits after the decimal point */
        System.out.printf("The surface area of the sphere is: %.2f\n", surfaceArea);
        System.out.printf("The volume of the sphere is: %.2f\n", volume);
    }// end method main
}// end class Greete
