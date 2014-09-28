package gooseGame.cell;

import gooseGame.Cell;
import gooseGame.Player;

/**
 * Class for the start cell. 
 * There can only be one start cell on the board, and it is the first cell (index = 0). 
 * It's the only cell where there can be more than one player.
 * 
 * @author Marion Tommasi - Alexandre Moevi
 *
 */
public class StartCell implements Cell {

	private int index = 0;

	/**
	 * We don't have to know the players who are on the start cell.
	 */
	public Player getPlayer() throws IllegalStateException {
		throw new IllegalStateException();
	}

	public boolean canBeLeftNow() {
		return true;
	}

	public boolean isRetaining() {
		return false;
	}

	public int getIndex() {
		return this.index;
	}

	public int handleMove(int diceThrow) {
		return diceThrow;
	}

	/**
	 * Even though there are players on the start cell, it's never busy (the
	 * players can always return to the start cell, without swapping with the
	 * players already there).
	 */
	public boolean isBusy() {
		return false;
	}

	public void welcome(Player player) {
		return;
	}

}
