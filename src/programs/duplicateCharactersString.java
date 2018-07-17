package programs;

import java.util.HashMap;
import java.util.Set;

public class duplicateCharactersString {

	public void duplicateCharacter(String str) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] Char = str.toCharArray();
		for (Character ch : Char) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		Set<Character> keys = map.keySet();
		for (Character cha : keys) {
			if (map.get(cha) > 1) {
				System.out.println(cha + "-----" + map.get(cha));
			}
		}

	}

	public static void main(String[] args) {

		duplicateCharactersString ds = new duplicateCharactersString();
		ds.duplicateCharacter("adithya jayasimha koppula");
	}
}
