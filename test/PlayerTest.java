package gooseGame;

import static org.junit.Assert.*;
import gooseGame.Cell;
import gooseGame.Player;
import gooseGame.cell.NormalCell;

import org.junit.Test;

public class PlayerTest {

	@Test
	public void testPlayer() {
		Player p = new Player("Aragorn");
		assertEquals(null, p.getCell());
		assertEquals("Aragorn", p.getName());

		Player p2 = new Player();
		assertEquals(null, p2.getCell());
		p2.setName("Marguerite Duras");
		assertEquals("Marguerite Duras", p2.getName());
		
		Cell cell = new NormalCell(34);
		p.setCell(cell);
		assertEquals(cell, p.getCell());
		
		Player p3 = new Player("Aragorn");
		p.setCell(cell);
		assertTrue(p3.equals(p));
		assertFalse(p3.equals(p2));
	}

}

