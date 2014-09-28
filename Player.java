package gooseGame;

/**
 * Class for the players. A player and his/her goose are assimilated.
 * 
 * @author Marion Tommasi - Alexandre Moevi
 *
 */
public class Player {

	private Cell cell;	
	private String name;
	

	public Player(){
		this.cell = null;
	}

	/**
	 * 
	 * @param name the name of the player
	 */
	public Player(String name){
		this.name = name;
		this.cell = null;
	}
	
	/**
	 * 
	 * @return the cell where the player is.
	 */
	public Cell getCell(){
		return this.cell;
	}
	
	/**
	 * 
	 * @param cell the cell where the player arrives on
	 */
	public void setCell(Cell cell){
		this.cell = cell;
	}
	
	/**
	 * 
	 * @return the name of the player
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Changes the name of the player.
	 * 
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Two players are equals if they are the same player i.e are on the same cell with the same name.
	 */
	public boolean equals(Object o){
		if (o == this) return true;
		if (o == null) return false;
		if (!(o instanceof Player)) return false;
		Player p = (Player) o;
		return ((p.getCell().getIndex() == this.getCell().getIndex()) && (p.getName().equals(this.getName())));
	}
}
