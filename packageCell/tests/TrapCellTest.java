package gooseGame.cell;

import static org.junit.Assert.*;
import gooseGame.cell.TrapCell;

import org.junit.Test;

public class TrapCellTest {

	@Test
	public void test() {
		TrapCell cell = new TrapCell(56);
		assertEquals(false, cell.canBeLeftNow());
		assertEquals(true, cell.isRetaining());
	}
}
