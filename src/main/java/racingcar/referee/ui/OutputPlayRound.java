package racingcar.referee.ui;

import racingcar.car.domain.Car;
import racingcar.referee.domain.RacingCars;

public class OutputPlayRound {

    public static void printPlayRound(RacingCars racingCars) {
        for (Car car : racingCars.cars()) {
            int position = car.carPosition().position();
            StringBuilder content = new StringBuilder(car.carName() + " : ");
            convertFromPositionToDash(position, content);
            System.out.println(content);
        }
        System.out.println();
    }

    private static void convertFromPositionToDash(int position, StringBuilder print) {
        for (int i = 0; i < position; i++) {
            print.append("-");
        }
    }
}
