package jeudeloie.boards;

import jeudeloie.Board;
import jeudeloie.cells.GooseCell;
import jeudeloie.cells.NormalCell;

public class BoardGoose extends Board {

	public BoardGoose() {
		super(69);
	}

	public void init() {
		for (int i = 1 ; i < 69 ; i++) {
			this.board[i] = new GooseCell(i);
		}
		this.board[69] = new NormalCell(69);
	}

}
