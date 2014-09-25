package gooseGame;

/**
 * Class for the wait cell.
 * When a player jumps on a wait cell, he/she must wait a certain number of turn,
 * defined at the construction of the cell. 
 * (Except if another player jumps on the same cell and take his/her place.)
 * 
 * @author marion
 *
 */
public class Wait extends Normal {

	private int nbTurns;
	private int timer;	
	
	/**
	 * 
	 * @param i the index of the cell
	 * @param n the number of turn the player must wait.
	 */
	public Wait(int i, int n){
		super(i);
		this.nbTurns = n;
		this.timer = n;
	}

	/**
	 * Is true only if the player has wait <code>nbTurns</code>, i.e when <code>timer = -1</code>
	 * @return true if the player can left the cell, false otherwise
	 */
	public boolean canBeLeftNow() {
		this.timer--;
		return (this.timer==-1);
	}

	/**
	 * The timer is reset to 0 when a player jumps on this cell.
	 * @param player 
	 */
	public void welcome(Player player){
		super.welcome(player);
		this.timer = nbTurns;
	}

}
