package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * input --> String "adithya"
 * output --> a2d1i1t1h1y1
 */

public class compressString {

	public void compressStr(String str) {

		char[] ch = str.toLowerCase().toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character ca : ch) {
			if (map.containsKey(ca)) {
				map.put(ca, map.get(ca) + 1);
			} else {
				map.put(ca, 1);
			}
		}

		Set<Character> set = map.keySet();
		for (Character cd : set) {
			if (map.get(cd) > 1) {
				System.out.print(cd + "" + map.get(cd));
			} else {
				System.out.print(cd + "" + map.get(cd));
			}
		}

	}

	public static void main(String[] args) {

		compressString cs = new compressString();
		cs.compressStr("adithya");

	}

}
