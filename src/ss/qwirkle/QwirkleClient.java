package ss.qwirkle;

import ss.qwirkle.common.Game;
import ss.qwirkle.common.Game.GameType;
import ss.qwirkle.common.player.AIPlayer;
import ss.qwirkle.common.player.HumanPlayer;
import ss.qwirkle.common.player.ai.BasicBehaviour;
import ss.qwirkle.common.ui.TUI;

/**
 * Main class for the client-side program.
 * @author Karanum
 */
public class QwirkleClient {

	public static void main(String[] args) {
		Game.type = GameType.SINGLEPLAYER;
		int count = 0;
		for (int i = 0; i < 1000; i++) {
			count += 1;
			Game game = new Game();
			game.setup(new TUI(game));
			//game.addPlayer(new HumanPlayer(game, "Mark"));
			game.addPlayer(new AIPlayer(game, "Mark", new BasicBehaviour()));
			game.addPlayer(new AIPlayer(game, "Dylan", new BasicBehaviour()));
			//game.addPlayer(new AIPlayer(game, "Bart", new BasicBehaviour()));
			//game.addPlayer(new AIPlayer(game, "PJ", new BasicBehaviour()));
			game.start();
			System.out.println(count);
		}
	}
	
}
