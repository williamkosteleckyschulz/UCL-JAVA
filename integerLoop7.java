import java.util.Scanner;
public class integerLoop7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int nmb = 0;
        int sum = 0;
        while (nmb != -1 || sum < 15){
            System.out.print("Enter integer value to sum up (-1 to terminate)): ");
            nmb = sc.nextInt(); // nmb is for number
            sum += nmb;
        }
        

        sum++;
        System.out.printf("The sum is: %d%n", sum);
    }
}