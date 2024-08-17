import java.util.Random;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxRounds = 5;
        int score = 0;
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You have" + maxRounds + "rounds ro play!");


        for(int round=1;round<=maxRounds;round++){
            int randomNumber=random.nextInt(100)+1;
            int attempts=0;
            int maxAttempts=10;
            boolean guessedCorrectly=false;



            System.out.println("\nRound" + round);
            System.out.println("Guess a number between 1 and 100... You have " + maxAttempts + " attempts");

            while(attempts<maxAttempts){
                System.out.println("Enter your guess:");
                int guess=scanner.nextInt();
                attempts++;


                if(guess == randomNumber){
                    System.out.println("Congratulations..! You have guessed the correvct number.");
                    guessedCorrectly=true;
                    score += maxAttempts-attempts+1;
                    break;
                }
                else if(guess<randomNumber){
                    System.out.println("Too Low Number! Try Again");
                }
                else{
                    System.out.println("Too High Number! Try Again");
                }
            }
            if(!guessedCorrectly){
                System.out.println("Sorry! You hsve used all your attempts. The correct number was: "+randomNumber);
            }
            System.out.println("Your Score so fsr:"+score);
        }
        System.out.println("\nGame Over!!! Your final score is:"+score);
        System.out.println("Thank you for playing!");
    }
}
