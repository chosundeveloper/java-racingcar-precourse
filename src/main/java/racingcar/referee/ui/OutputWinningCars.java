package racingcar.referee.ui;

import racingcar.car.domain.Car;
import racingcar.referee.domain.WinningCars;

import java.util.List;

public class OutputWinningCars {

    public static void printWinningCars(WinningCars winningCars) {
        System.out.println("최종 우승자 : " + winningCarNames(winningCars.cars()));
    }

    public static String winningCarNames(List<Car> cars) {
        StringBuilder names = new StringBuilder();
        for (int i = 0; i < cars.size(); i++) {
            appendCarName(cars, names, i);
            appendDelimiter(cars, names, i);
        }
        return names.toString();
    }

    private static void appendCarName(List<Car> cars, StringBuilder names, int i) {
        String carName = cars.get(i).carName();
        names.append(carName);
    }

    private static void appendDelimiter(List<Car> cars, StringBuilder names, int i) {
        if (i != cars.size() - 1) {
            names.append(", ");
        }
    }
}
