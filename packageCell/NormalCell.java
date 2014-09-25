package cell;

import gooseGame.Player;

/**
 * Class for the normal cells.
 * Note : the special cells are considered as normal cells with just few peculiarities.
 * 
 * @author marion
 *
 */
public class Normal implements Cell {
	
	private int index;
	private Player player;
	
	public Normal(int i){
		this.index = i;
		this.player = null;
	}
	
	public boolean canBeLeftNow() {
		return true;
	}

	public boolean isRetaining(){
		return false;
	}

	public int getIndex(){
		return this.index;
	}

	public int handleMove(int diceThrow){
		return (this.index + diceThrow);
	}

	public boolean isBusy(){
		return (this.player==null);
	}

	public Player getPlayer(){
		return this.player;
	}

	public void welcome(Player player){
		this.player = player;
		player.setCell(this);
	}

}
