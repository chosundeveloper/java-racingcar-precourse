package racingcar.referee.ui;

import camp.nextstep.edu.missionutils.Console;

public class InputMovingNumber {

    private static final String SHOW_INPUT_MOVING_NUMBER_MESSAGE = "시도할 횟수는 몇회인가요?";
    private static final String RETRY_SHOW_INPUT = "숫자를 입력해 주세요";

    public static int readMovingNumber() {
        System.out.println(SHOW_INPUT_MOVING_NUMBER_MESSAGE);
        try {
            return Integer.parseInt(Console.readLine());
        } catch (NumberFormatException e) {
            System.out.println(RETRY_SHOW_INPUT);
            System.out.println();
            return readMovingNumber();
        }
    }
}
