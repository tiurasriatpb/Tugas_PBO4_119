import java.util.Random;

public class NumberGenerator {
    public int generateNumber() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }
}