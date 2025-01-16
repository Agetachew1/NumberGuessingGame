import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess;
        numberToGuess = random.nextInt(100)+1;
        int userGuess;
        int tries = 0;

        System.out.println("I'm thinking of a number between 1 and 100." +
                "Can you guess it?");
        do{
            System.out.println("Enter your guess: ");
            userGuess = scanner.nextInt();
            tries++;

            if(userGuess < numberToGuess){
                System.out.println("Too low! Try again.");
            }else if(userGuess > numberToGuess){
                System.out.println("Too high! Try again.");
            }else{
                System.out.printf("Congratulation! You guessed it in %d tries.\n",tries);
            }
        }while(userGuess != numberToGuess);
    }
}