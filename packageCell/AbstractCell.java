package gooseGame.cell;

import gooseGame.Player;
/**
 * Class to construct the cells of the board.
 * 
 * authors Marion Tommasi - Alexandre Moevi
 * /
public abstract class AbstractCell implements Cell {

	private int index;
	private Player player;

	public AbstractCell(int i) {
		this.index = i;
		this.player = null;
	}

	@Override
	public boolean canBeLeftNow() {
		return true;
	}

	@Override
	public boolean isRetaining() {
		return false;
	}

	@Override
	public int getIndex() {
		return this.index;
	}

	@Override
	public int handleMove(int diceThrow) {	
		return (this.index + diceThrow);
	}

	@Override
	public boolean isBusy() {
		return (this.player==null);
	}

	@Override
	public Player getPlayer() {
		return this.player;
	}

	@Override
	public void welcome(Player player) {
		this.player = player;
		player.setCell(this);
	}

}
