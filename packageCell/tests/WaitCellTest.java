package gooseGame.cell;

import static org.junit.Assert.*;
import gooseGame.Player;
import gooseGame.cell.WaitCell;

import org.junit.Test;

public class WaitCellTest {

	@Test
	public void testWaitCell() {
		WaitCell cell = new WaitCell(23,3);
		Player p1 = new Player();
		Player p2 = new Player();
		
		cell.welcome(p1);
		assertEquals(cell, p1.getCell());
		assertEquals(false, cell.canBeLeftNow()); /* 1st turn, 2 remaining */
		assertEquals(false, cell.canBeLeftNow()); /* 2nd turn, 1 remaining */
		
		cell.welcome(p2);
		assertEquals(cell, p2.getCell());
		assertEquals(false, cell.canBeLeftNow()); /* 1st turn, 2 remaining */
		assertEquals(false, cell.canBeLeftNow()); /* 2nd turn, 1 remaining */
		assertEquals(false, cell.canBeLeftNow()); /* 3rd turn, 0 remaining */
		assertEquals(true, cell.canBeLeftNow());  /* 4th turn, can left */
	}

}
