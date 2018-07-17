package programs;

import java.util.HashMap;

public class lengthOfLongestSubString {

	public static int subString(String str) {

		char[] charArray = str.toCharArray();
		int length = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < charArray.length; i++) {
			if (!map.containsKey(charArray[i])) {
				map.put(charArray[i], i);
			} else {
				length = Math.max(length, map.size());
				map.clear();
			}
		}

		return Math.max(length, map.size());

	}

	public static void main(String[] args) {

		System.out.println(subString("blachyzowski"));
	}
}
