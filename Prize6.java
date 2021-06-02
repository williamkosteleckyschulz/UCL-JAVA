import java.util.Random;

public class Prize6
{
    public static void main(String[] args)
    {
        Random ng = new Random(); // ng means : number Generator

        int randomNum = ng.nextInt(10) + 1; // [0....9] + 1 = [1....10]

        //System.out.printf("%s %d %n", "The random number is:", randomNum);

        switch (randomNum) {
            case 1:
                System.out.println("a holiday in Ibiza.");
                break;
            case 2:
                System.out.println("a pie in the sky.");
                break;
            case 3:
                System.out.println("a castle in the air and an end of the rainbow.");
                break;
            case 4:
                System.out.println("an end of the rainbow.");
                break;
            case 5: case 6: case 7:
                System.out.println("an empty promise.");
                break;
            default:
                System.out.printf("nothing :(%n" + "Good luck next time.%n");
                break;
        }
    }
}
