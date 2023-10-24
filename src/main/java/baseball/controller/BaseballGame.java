package baseball.controller;

import baseball.domain.Balls;
import baseball.domain.GameResult;
import baseball.domain.GameStatus;

public class BaseballGame {

    private final Balls answerBall;
    private GameStatus gameStatus;

    public BaseballGame(Balls answerBalls, GameStatus gameStatus) {
        this.answerBall = answerBalls;
        this.gameStatus = gameStatus;
    }

    public boolean isPlaying() {
        return gameStatus.isPlaying();
    }

    public GameResult getTryResultList(Balls playerBalls) {
        return answerBall.getTryResultList(playerBalls);
    }

    public void checkGameWin(GameResult gameResult) {
        if (gameResult.isThreeStrike()) {
            gameStatus = GameStatus.WIN;
        }
    }

    public static BaseballGame from(Balls answerBalls) {
        return new BaseballGame(answerBalls, GameStatus.PLAYING);
    }
}
