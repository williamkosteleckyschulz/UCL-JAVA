import java.util.Scanner;
public class market4
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the maximum weight the box could take: ");
        double wb = sc.nextDouble(); // wb is for weight of box

        System.out.print("Enter the weight of apples to be boxed: ");
        double wa = sc.nextDouble(); // w is for weight of apples
        double box;

        if(wa % 10 == 0)
        {
            box = wa / wb;
            System.out.printf("The number of boxes you need is: %.0f\n", box);
        }
        else{
            box = wa / wb + 1;
            System.out.printf("The number of boxes you need is: %.0f\n", box);
        }
    }
}
