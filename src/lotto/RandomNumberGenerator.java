package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberGenerator {
    private static List<Integer> randomNumbers = new ArrayList<>();
    private static Random random = new Random();

    public static List<Integer> generateRandomNumbers() {
        while (randomNumbers.size() != 6) {
            int randomNumber = random.nextInt(45) + 1;
            if (!isDuplicate(randomNumber)) {
                randomNumbers.add(randomNumber);
            }
        }
        return randomNumbers;
    }

    private static boolean isDuplicate(int number) {
        return randomNumbers.contains(number);
    }
}
