package gooseGame.cell;

import static org.junit.Assert.*;
import gooseGame.cell.TeleportCell;

import org.junit.Test;

public class TeleportCellTest {

	@Test
	public void testTeleport() {
		TeleportCell cell = new TeleportCell(35, 22);
		assertEquals(22, cell.handleMove(3));
		assertEquals(22, cell.handleMove(4));
	}

}
