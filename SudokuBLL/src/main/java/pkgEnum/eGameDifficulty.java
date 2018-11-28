package pkgEnum;
import java.util.HashMap;
import java.util.Map;
import java.lang.Integer;



public enum eGameDifficulty {
	
	EASY(10), MEDIUM(50), HARD(100);
	
	
	private final int
	iDifficulty;
	
	private static final Map<Integer, eGameDifficulty> lookup = new HashMap<Integer, eGameDifficulty>();
	
	static {
		for (eGameDifficulty diff : eGameDifficulty.values()) {
			lookup.put(diff.getiDifficulty(), diff);
		}
	}
	
	private eGameDifficulty(int iDifficulty) {
		this.iDifficulty = iDifficulty;
	}
	
	public int getiDifficulty() {
		return iDifficulty;
	}
	
	public static eGameDifficulty get(int iDifficulty) {
		eGameDifficulty difficulty = null;
		if (iDifficulty >= HARD.getiDifficulty()) {
			difficulty = HARD;
		} else if (iDifficulty >= MEDIUM.getiDifficulty()) {
			difficulty = MEDIUM;
		} else if (iDifficulty >= EASY.getiDifficulty()) {
			difficulty = EASY;
		}
		return difficulty;
	}
	
	
	
}
