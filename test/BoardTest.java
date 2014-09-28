package gooseGame;

import static org.junit.Assert.*;
import gooseGame.board.ClassicBoard;

import org.junit.Test;

public class BoardTest {

	Board board = new ClassicBoard();
	Player p1 = new Player("Casimir");
	
	@Test
	public void testNormalize() {
		int i = 65;
		int j = 70;
		int k = 27;
		int fin = 63;
		assertEquals(61, board.normalize(i)); /* move back two cells */
		assertEquals(56, board.normalize(j)); /* move back 7 cells */
		assertEquals(27, board.normalize(k)); /* 27 is smaller than 63, normalize has no effect */
		assertEquals(63, board.normalize(fin)); /* 63 is on the board, normalize has no effect */
	}
	
	
	@Test
	public void testSwap() {
		Player p2 = new Player("Dora l'exploratrice");
		Cell cell1 = board.getCell(6);
		Cell cell2 = board.getCell(28);
		
		p1.setCell(cell1);
		p2.setCell(cell2);
		board.swap(p1, p2);
		assertEquals(cell1, p2.getCell());
		assertEquals(cell2, p1.getCell());
		assertEquals(p1, cell2.getPlayer());
		assertEquals(p2, cell1.getPlayer());
		
		/* with the start cell */
		Cell start = board.getCell(0);
		p2.setCell(start);
		board.swap(p1, p2);
		assertEquals(cell2, p2.getCell());
		assertEquals(start, p1.getCell());
		assertEquals(p2, cell2.getPlayer());
	}

	@Test
	public void testMoveTo() {
		Cell start = board.getCell(25);
		Cell dest = board.getCell(56);
		p1.setCell(start);
		board.moveTo(p1, dest);
		assertEquals(dest, p1.getCell());
		assertEquals(dest, p1.getCell());
		assertFalse(start.isBusy());
	}

	@Test
	public void testLastCellReached() {
		assertFalse(board.lastCellReached());
		p1.setCell(board.getLastCell());
		assertTrue(board.lastCellReached());
	}

}
