package gooseGame;

import gooseGame.board.ClassicBoard;
import gooseGame.board.GooseBoard;

import java.util.Random;

/**
 * 
 * @author Marion Tommasi - Alexandre Moevi
 *
 */
public class Game {

	private Player[] thePlayers;
	private Board board;
	private int nextPlayer;

	/**
	 * Creates a new game.
	 * 
	 * @param board
	 * @param players
	 */
	public Game(Board board, Player[] players) {
		this.board = board;
		this.thePlayers = players;
		this.nextPlayer = 0;
	}

	/**
	 * 
	 * @return the next player
	 */
	public Player nextPlayer() {
		return this.thePlayers[(nextPlayer++) % (this.thePlayers.length)];
	}

	/**
	 * Plays the entire game : move the players until one of them reached the
	 * last cell or all of them are trap.
	 */
	public void play() {
		while (!(this.isFinished())) {
			this.board.playTurn(this.nextPlayer(), rollDice() + rollDice());
		}

	}

	/**
	 * Tests if the game is finished, i.e if one player has reached the last
	 * cell or all of them are trap.
	 * 
	 * @return true if the game is finished, false otherwise
	 */
	public boolean isFinished() {
		boolean isFinished = true;
		if (!(this.board.lastCellReached())) {
			for (Player p : this.thePlayers) {
				if (!(p.getCell().isRetaining()))
					isFinished = false;
			}
		} else {
			isFinished = false;
		}
		return isFinished;
	}

	/**
	 * 
	 * @return a random number between 1 and 6.
	 */
	public int rollDice() {
		return (new Random()).nextInt(6) + 1;
	}

	/**
	 * Tests if the last cell is reached, and if it's the case, return the
	 * player on it.
	 * 
	 * @return the winner of the game if there is one, null otherwise
	 */
	public Player getWinner() {
		if (this.board.lastCellReached()) {
			return this.board.getLastCell().getPlayer();
		}
		return null;
	}

	/**
	 * Print a message to indicate the eventual winner.
	 * @param player the result of <code>getWinner</code>
	 */
	public void printWinner(Player player) {
		if (player != null) {
			System.out.println("And the winner is... " + player.getName());
		} else {
			System.out.println("All players are stuck...GAME OVER");
		}
	}

	public static void main(String[] args) {
		Player[] array = new Player[args.length - 1];
		Board theBoard;
		for (int i = 1; i < args.length; i++) {
			array[i - 1] = new Player(args[i]);
		}
		switch (args[0]) {
		case "Goose":
			theBoard = new GooseBoard();
			break;
		/* case "Trap" : theBoard = new TrapBoard(); break; */
		default:
			theBoard = new ClassicBoard();
		}
		Game test = new Game(theBoard, array);
		test.play();
		test.printWinner(test.getWinner());
	}
}
