package pkgEnum;

import static org.junit.Assert.*;

import org.junit.Test;

public class eGameDifficultyTest {

	@Test
	public void get_Test1() {
		eGameDifficulty easy = eGameDifficulty.EASY;
		eGameDifficulty medium = eGameDifficulty.MEDIUM;
		eGameDifficulty hard = eGameDifficulty.HARD;
		assertTrue(eGameDifficulty.get(0) == null);
		assertTrue(eGameDifficulty.get(99) == null);
		assertTrue(eGameDifficulty.get(10) == easy);
		assertTrue(eGameDifficulty.get(49) == easy);
		assertTrue(eGameDifficulty.get(50) == medium);
		assertTrue(eGameDifficulty.get(100) == hard);
		assertTrue(eGameDifficulty.get(101) == hard);
		assertTrue(eGameDifficulty.get(Integer.MAX_VALUE) == hard);
	}

}
