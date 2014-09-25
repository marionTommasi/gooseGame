package gooseGame.cell;

/**
* Class for the goose cell.
* When a player jumps on a goose cell with a dice throw n, he/she's send n cells further.
*
* @author Maron Tommasi - Alexandre Moevi
*
*/
public class GooseCell extends AbstractCell {
	
	private int index;
	
	public GooseCell(int i){
		super(i);
	}

	/**
	 * <code>handleMove(diceThrow)</code> send the player <code>diceThrow</code> cells further.
	 * @param diceThrow the number obtained when throwing the dice
	 * @return the index of the cell where the player is sent
	 */
	@Override
	public int handleMove(int diceThrow) {
		return (this.index + diceThrow);
	}

}

