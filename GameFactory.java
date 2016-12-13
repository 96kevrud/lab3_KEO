import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * Factory class for available games.
 */
public class GameFactory implements IGameFactory {

	/**
	 * Returns an array with names of games this factory can create. Used by GUI
	 * list availible games.
	 */
	private GameModel gameModel;
	@Override
	public String[] getGameNames() {
		return new String[] { "Gold","Reversi"};
	}

	/**
	 * Returns a new model object for the game corresponding to its Name.
	 * 
	 * @param gameName
	 *            The name of the game as given by getGameNames()
	 * @throws IllegalArgumentException
	 *             if no such game
	 */
	@Override
	public GameModel createGame(final String gameName) {
		if (gameName.equals("Gold")) {
			return new GoldModel();
		}else if(gameName.equals("Reversi")) {
			GameModel gameModel = new ReversiModel();
			gameModel.addObserver(new ReversiScoreView());
			return gameModel;

		}

		throw new IllegalArgumentException("No such game: " + gameName);
	}
}
