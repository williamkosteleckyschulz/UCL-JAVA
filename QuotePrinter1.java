import java.util.Scanner;

public class QuotePrinter1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Would you like a quote? [y/n]: ");
        char answer = sc.nextLine().charAt(0);

        if (answer == 'y'){
            printQuote();
        }
        else{
            printComeBackAgain();
        }
    }

    public static void printQuote() {
        System.out.printf("\"Learning never exhausts the mind.%n" +
                            "          – Leonardo da Vinci%n");
    }

    public static void printComeBackAgain() {
        System.out.println("Come back again!");
    }

}
