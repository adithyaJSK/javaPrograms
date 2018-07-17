package programs;

import java.util.HashMap;
import java.util.Set;

public class uniqueElementsinArray {

	public void uniqueElementsArray(Object[] array) {

		HashMap<Object, Integer> map = new HashMap<Object, Integer>();
		for (Object integers : array) {
			if (map.containsKey(integers)) {
				map.put(integers, map.get(integers) + 1);
			} else {
				map.put(integers, 1);
			}
		}

		Set<Object> set = map.keySet();

		for (Object in : set) {
			if (map.get(in) == 1) {
				System.out.println(in + " ---- " + map.get(in));
			}
		}

	}

	public static void main(String[] args) {

		Object[] array = { 1, 1, 1, 2, 2, 3, 4, 5, 6 };
		Object[] status = { true, false };
		Object[] chars = { "a", "s", "d", "f", "a" };
		Object[] strings = { "adithya", "adi", "thya", "adi", "adithya" };
		uniqueElementsinArray ur = new uniqueElementsinArray();
		ur.uniqueElementsArray(strings);
	}

}
