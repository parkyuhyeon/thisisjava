package exercise04;

public class Util {
	public static <K, V> V getValue(Pair<K, V> pair, K k) {
		boolean keyCompare = pair.getKey() == k;
		
		if (keyCompare) {
			return pair.getValue();
		} else {
			return null;
		}
	}
}
