package jeudeloie.boards;

import jeudeloie.Board;
import jeudeloie.cells.CellGoose;
import jeudeloie.cells.CellNormal;

public class BoardGoose extends Board {

	public BoardGoose() {
		super(69);
	}

	public void init() {
		for (int i = 1 ; i < 69 ; i++) {
			this.board[i] = new CellGoose(i);
		}
		this.board[69] = new CellNormal(69);
	}

}
