import java.util.Scanner;

public class Interim4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int nNmb = sc.nextInt();
        int sum = nNmb;
        int i = nNmb;

        if (nNmb > 0){

            if (nNmb % 2 == 1){
                // If number is odd
                i--;
            }
            while (i > 0){
                sum -= i ;
                System.out.printf("%d - %d = %d%n", nNmb, i, sum);
                nNmb = sum;
                i -= 2;
            }
            System.out.printf("The result of deduction is: %d%n", sum);
        }
        else{
            System.out.println("!!!The number you entered is not positive!!!");
        }
    }
}
