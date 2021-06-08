import java.util.Scanner;

public class CalorieCalculator4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter body weight (kg): ");
        double bw = sc.nextDouble(); // bw = bodyWeight

        System.out.print("Please enter height (m): ");
        double h = sc.nextDouble(); // h = height

        System.out.print("Please enter average speed (m/s): ");
        double s = sc.nextDouble(); // s = averageSpeed

        System.out.print("Please enter time walked (min): ");
        int t = sc.nextInt(); // t = timeWalked

        System.out.print("Enter time climbing stairs (min): ");
        int tcs = sc.nextInt(); // tcs = time climbing stairs

        formulaWalking(bw, h, s, t);
        formulaClimbing(bw, tcs);
    }

    public static double formulaWalking(double bw, double h, double s, int t) {
        // The formula tcb walking
        double tcb = t * ((0.035 * bw) + (Math.pow(s,2) / h * 0.029 * bw));
        System.out.printf("The number of calories burnt is: %.2f (kcal) \n", tcb);

        return 0;
    }

    public static double formulaClimbing(double bw, int tcs) {
        // The formula tcb climbing
        double tcb = 6.2 * bw * tcs / 60;
        System.out.printf("The number of calories burnt is: %.2f (kcal) \n", tcb);

        return 0;
    }
}
