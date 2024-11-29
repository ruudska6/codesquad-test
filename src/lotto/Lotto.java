package lotto;

import java.util.ArrayList;
import java.util.List;

public class Lotto {
    private static List<Integer> lottoNumbers = new ArrayList<>();

    public void generateLottoNumbers() {
        lottoNumbers = RandomNumberGenerator.generateRandomNumbers();
    }

    public List<Integer> getLottoNumbers() {
        return lottoNumbers;
    }

    public int checkWinningNumbers(List<Integer> userNumbers) {
        int matchCount = 0;
        for (int number : userNumbers) {
            if (lottoNumbers.contains(number)) {
                matchCount++;
            }
        }
        return matchCount;
    }
}
