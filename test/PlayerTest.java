package gooseGame;

import static org.junit.Assert.*;
import gooseGame.Cell;
import gooseGame.Player;
import gooseGame.cell.NormalCell;
import gooseGame.cell.StartCell;

import org.junit.Test;

public class PlayerTest {

	@Test
	public void testPlayer() {
		Player p = new Player("Aragorn");
		assertEquals(null, p.getCell());
		assertEquals("Aragorn", p.getName());

		Player p2 = new Player();
		assertEquals(null, p2.getCell());
		p2.setCell(new StartCell());
		p2.setName("Marguerite Duras");
		assertEquals("Marguerite Duras", p2.getName());
		
		Cell cell = new NormalCell(34);
		p.setCell(cell);
		assertEquals(cell, p.getCell());
		
		Player p3 = new Player("Aragorn");
		p3.setCell(cell);
		assertTrue(p3.equals(p));/* p3 and p have the same name and are on the same cell */
		assertFalse(p3.equals(p2));/* p3 and p2 have different names and are on different cells */
		p3.setCell(new StartCell());
		assertFalse(p3.equals(p));/* p3 and p have the same name but are on different cells */
		assertFalse(p3.equals(p2));/* p3 and p2 are on the same cell but have different names */
	}

}

