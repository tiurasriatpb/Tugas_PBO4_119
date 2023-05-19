import java.util.Scanner;

public class Player {
    public boolean guessNumber(int targetNumber) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Guess a number: ");
            int guess = scanner.nextInt();
            scanner.nextLine();

            if (guess == targetNumber) {
                return true;
            } else {
                return false;
            }
        }
    }
}