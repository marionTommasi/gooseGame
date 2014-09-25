package gooseGame.cell;

/**
* Class for the trap cell.
* A player who jumps on a trap cell cannot move further until another player take his/her place.
*
* @author marion
*
*/
public class TrapCell extends AbstractCell {

	public TrapCell(int i){
		super(i);
	}

	/**
	 * The trap cell can never be left.
	 */
	public boolean canBeLeftNow() {
		return false;
	}

	/**
	 * The trap cell is the only cell who is retaining.
	 */
	public boolean isRetaining(){
		return true;
	}

}


