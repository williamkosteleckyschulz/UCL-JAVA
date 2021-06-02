import java.util.Scanner;
//Imports the class Random, which allows generating pseudo-random numbers.
import java.util.Random;

public class Random5 {

    public static void main(String[] args) {
        int currentPoints = 20;
        System.out.println("You are given 20 points for this game.");
        System.out.println("Each wrong guess will reduce score by 1.");

        //Creates an object of type Random.
        Random numberGenerator = new Random();

        //nextInt is the method of Random class to return a (pseudorandom)
        //number between 0 (inclusive) and the specified value (exclusive).
        //In this case the specified value is 5
        // [1....5] [min = 1, max = 5]
        int randomNum = numberGenerator.nextInt(5) + 1; // [0....4] + 1 = [1....5]


        //Uncomment the following line to print the randomly generated number.
        //System.out.printf("%s %d", "The random number is:", randomNum);

        Scanner keyboard = new Scanner(System.in);
        int userNum;

        do {
            System.out.print("Guess a number between 1 and 5: ");
            userNum = keyboard.nextInt();
            currentPoints--;
            System.out.printf("Current score:  %d%n", currentPoints);
        }while (userNum != randomNum);

        System.out.printf("%s %d %n",
                "Congrats! Final score is: ", currentPoints);
    }
}
