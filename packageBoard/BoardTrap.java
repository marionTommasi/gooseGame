package jeudeloie.boards;

import jeudeloie.Board;
import jeudeloie.cells.TrapCell;
import jeudeloie.cells.NormalCell;

public class BoardTrap extends Board {

	public BoardTrap() {
		super(9);
	}

	public void init() {
		for (int i = 1 ; i < 9 ; i++) {
			this.board[i] = new TrapCell(i);
		}
		this.board[9] = new NormalCell(9);
	}
	
}
