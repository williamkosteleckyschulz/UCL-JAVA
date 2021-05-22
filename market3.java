import java.util.Scanner;
public class market3
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the weight of apples to be boxed: ");
        int w = sc.nextInt(); // w is for weight
        int box;

        if(w % 10 == 0)
        {
            box = w / 10;
            System.out.printf("The number of boxes you need is: %d\n", box);
        }
        else{
            box = w / 10 + 1;
            System.out.printf("The number of boxes you need is: %d\n", box);
        }
    }
}
