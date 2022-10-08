package racingcar.game;

public class Game {

    private GameStatus status;

    public void start() {
        this.status = GameStatus.PLAYING;
    }

    public GameStatus status() {
        return this.status;
    }

    public void end() {
        this.status = GameStatus.STOP;
    }
}
