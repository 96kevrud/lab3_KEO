/**
 * Created by kajen on 2016-12-10.
 */
public abstract class GameUtils implements GameModel{

    protected void setGameboardState(final int x, final int y, final GameTile tile, final GameTile[][] board) {
        board[x][y] = tile;
    }

    protected void setGameboardState(final Position pos, final GameTile tile, final GameTile[][] board) {
        board[pos.getX()][pos.getY()] = tile;
    }
}
