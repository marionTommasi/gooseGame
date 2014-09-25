package gooseGame;

/**
 * Class for the teleport cell.
 * The teleport cell sends a player to another predetermined cell.
 * 
 * @author marion
 *
 */
public class Teleport extends Normal {

	private int destination;
	
	public Teleport(int i, int dest){
		super(i);
		this.destination = dest;
	}

	/**
	 * Send the player to the cell number <code>destination</code>
	 */
	public int handleMove(int diceThrow){
		return (this.destination);
	}

}
