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
}
