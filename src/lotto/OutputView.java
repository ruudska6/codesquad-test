package lotto;

import java.util.List;

public class OutputView {

    public void printUserInputs(List<Integer> userInputs) {
        System.out.print("플레이어의 숫자: ");
        for (int i = 0; i < userInputs.size(); i++) {
            System.out.print(userInputs.get(i));
            if (i < userInputs.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public void printLottoNumbers(List<Integer> lottoNumbers) {
        System.out.print("로또 당첨 숫자: ");
        for (int i = 0; i < lottoNumbers.size(); i++) {
            System.out.print(lottoNumbers.get(i));
            if (i < lottoNumbers.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public void printMatchCount(int matchCount) {
        System.out.println("일치한 숫자 개수: " + matchCount + "개");
    }
}
