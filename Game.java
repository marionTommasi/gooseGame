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
		return this.thePlayers[(nextPlayer++) % (this.thePlayers.length)];
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
	
	public int rollDice() {
		return (new Random()).nextInt(6) + 1;
	}

	public Player getWinner(){
		if (this.board.lastCellReached()) {
			return this.board.getLastCell().getPlayer();
		}
		return null;
	}
	
	public void printWinner(Player player) {
		if (player != null) {
			System.out.println("And the winner is... " + player.getName());
		} else {
			System.out.println("All players are stuck...GAME OVER");
		}
	}

	public static void main(String[] args) {		
		Player[] array = new Player[args.length - 1];
		Board theBoard;
		for (int i = 1 ; i < args.length; i++) {
			array[i - 1] = new Player(args[i]);
		}
		switch(args[0]) {
		case "Goose" : theBoard = new BoardGoose(); break;
		case "Trap" : theBoard = new BoardTrap(); break;
		default : theBoard = new BoardClassic();
		}
		Game test = new Game(theBoard, array);
		test.play();
		test.printWinner(test.getWinner());
	}
}
