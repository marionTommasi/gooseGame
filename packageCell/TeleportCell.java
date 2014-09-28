package gooseGame.cell;

/**
 * Class for the teleport cell.
 * The teleport cell sends a player to another predetermined cell.
 * 
 * @author marion
 *
 */
public class TeleportCell extends AbstractCell {

	private int destination;
	
	public TeleportCell(int i, int dest){
		super(i);
		this.destination = dest;
	}

	/**
	 * Sends the player to the cell number <code>destination</code>
	 */
	public int handleMove(int diceThrow){
		return (this.destination);
	}

}
