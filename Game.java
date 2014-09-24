package gooseGame;


public class Game {
	
	private Player[] thePlayers;
	private Board board;
	private int nextPlayer;
	
	public Game(Board board, Player[] players){
		this.board = board;
		this.thePlayers = players;
		this.nextPlayer = 0;
	}
	
	public Player nextPlayer(){
		return this.thePlayers[(nextPlayer+1) % (this.thePlayers.length)];
	}
	
	public void play(){
		while (!(this.isFinished())) {
			this.board.playTurn(this.nextPlayer(), this.diceThrow());
		}
			
	}
	
	public boolean isFinished(){
		boolean isFinished = true;
		if (!(this.board.lastCellReached())) {
			for (Player p : this.thePlayers) {
				if (!(p.getCell().isRetaining()))
					isFinished = false;
			}
		}
		else {
			isFinished = false;
		}
		return isFinished;
	}
	
	public int diceThrow(){
		return 0;
	}

	public Player getWinner(){
		if (this.board.lastCellReached()) {
			return this.board.getLastCell().getPlayer();
		}
		return null;
	}
	
}
