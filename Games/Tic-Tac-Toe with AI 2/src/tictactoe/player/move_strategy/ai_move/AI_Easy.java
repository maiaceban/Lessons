package tictactoe.player.move_strategy.ai_move;

import tictactoe.player.MoveStrategy;
import tictactoe.player.Move;
import tictaktoe.game.Game;
import tictaktoe.game.GameField;

public class AI_Easy implements MoveStrategy {
    @Override
    public void move() {
        System.out.println("Making move level \"easy\"");
        GameField field = Game.getField();
        char currentPlayer = Game.getCurrentPlayer();
        Move move = Game.getRandomXAndYNotOccupied();
        field.set(move.x, move.y, currentPlayer);
    }
}