package gooseGame.cell;

import static org.junit.Assert.*;
import gooseGame.cell.NormalCell;
import gooseGame.Player;

import org.junit.Test;

public class NormalCellTest {

	@Test
	public void testStateOfTheCellAtAnyMomentOfTheGame() {
		NormalCell cell = new NormalCell(2);
		assertEquals(true, cell.canBeLeftNow());
		assertEquals(false, cell.isRetaining());
		assertEquals(2, cell.getIndex());
	}

	@Test
	public void testInteractionCellPlayer() {
		NormalCell cell = new NormalCell(2);
		Player player = new Player();
		cell.welcome(player);
		assertEquals(true, cell.isBusy());
		assertEquals(player, cell.getPlayer());
		assertEquals(cell, player.getCell());
	}

}
