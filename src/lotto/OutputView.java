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
}
