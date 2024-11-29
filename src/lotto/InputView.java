package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static final String USER_INPUT_MESSAGE = "1~45 중 로또 번호를 여섯개 입력하세요";
    List<Integer> userInputs = new ArrayList<>();

    public List<Integer> getUserInput() {
        System.out.println(USER_INPUT_MESSAGE);
        Scanner scanner = new Scanner(System.in);

        while (userInputs.size() != 6) {
            int userInput = scanner.nextInt();
            if(isDuplicate(userInput)) {
                System.out.println("같은 번호" + userInput + "이 이미 선택되었습니다. 다른 번호를 선택하세요");
            } else {
                userInputs.add(userInput);
            }
        }
        scanner.close();
        return userInputs;
    }

    private boolean isDuplicate(int number) {
        return userInputs.contains(number);
    }
}
