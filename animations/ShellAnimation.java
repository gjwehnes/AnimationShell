
public class ShellAnimation implements Animation {

	private static int universeCount = 0;
	private Universe current = null;
	
	public static int getUniverseCount() {
		return universeCount;
	}

	public static void setUniverseCount(int count) {
		ShellAnimation.universeCount = count;
	}

	public Universe switchUniverse(Object event) {

		universeCount++;
		
		if (universeCount == 1) {
			current = new ShellUniverse();
		}
		else {
			current = null;
		}
		
		return current;

	}

	public Universe getCurrentUniverse() {
		return current;
	}
	
}
