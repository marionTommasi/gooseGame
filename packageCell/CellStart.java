package jeudeloie.cells;

import jeudeloie.Cell;
import jeudeloie.Player;

public class CellStart implements Cell {

	private int index = 0;
	
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

	public boolean isBusy() {
		return false;
	}

	public void welcome(Player player) {return;}

}
