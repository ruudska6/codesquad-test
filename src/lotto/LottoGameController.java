package lotto;

import java.util.Collections;
import java.util.List;

public class LottoGameController {
    private final InputView inputView;
    private final OutputView outputView;

    public LottoGameController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void run() {
        Lotto lotto = new Lotto();
        lotto.generateLottoNumbers();

        List<Integer> userInputNumbers = inputView.getUserInput();
        List<Integer> lottoNumbers = lotto.getLottoNumbers();

        sortNumbers(userInputNumbers);
        sortNumbers(lottoNumbers);

        outputView.printUserInputs(userInputNumbers);
        outputView.printLottoNumbers(lottoNumbers);

        int matchCount = lotto.checkWinningNumbers(userInputNumbers);
        outputView.printMatchCount(matchCount);
    }

    private void sortNumbers(List<Integer> numbers) {
        Collections.sort(numbers);
    }
}
