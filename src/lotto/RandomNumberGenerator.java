package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberGenerator {
    List<Integer> randomNumbers = new ArrayList<>();
    Random random = new Random();

    public void generateRandomNumbers() {
        while (randomNumbers.size() != 6) {
            int randomNumber = random.nextInt(45) + 1;
            if (!isDuplicate(randomNumber)) {
                randomNumbers.add(randomNumber);
            }
        }
    }

    private boolean isDuplicate(int number) {
        return randomNumbers.contains(number);
    }
}
