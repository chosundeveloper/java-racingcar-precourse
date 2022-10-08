package racingcar.game;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("게임")
class GameTest {

    @DisplayName("게임 실행")
    @Test
    void startGame() {
        Game game = new Game();
        game.start();
        assertThat(game.status()).isEqualTo(GameStatus.PLAYING);
    }

    @DisplayName("게임 종료")
    @Test
    void endGame() {
        Game game = new Game();
        game.end();
        assertThat(game.status()).isEqualTo(GameStatus.STOP);
    }
}
