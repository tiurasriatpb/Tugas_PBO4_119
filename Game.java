public class Game {
    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();
        Player player = new Player();

        int targetNumber = generator.generateNumber();
        boolean isCorrect = player.guessNumber(targetNumber);

        if (isCorrect) {
            System.out.println("Congratulations! You guessed the correct number.");
        } else {
            System.out.println("Sorry, you didn't guess the correct number. The target number was: " + targetNumber);
        }
    }
}