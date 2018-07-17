package programs;

import java.util.HashMap;
import java.util.Set;

public class commonElementinArray {

	public void commonElements(Object[] arr1, Object[] arr2) {

		HashMap<Object, Integer> map = new HashMap<Object, Integer>();
		for (Object obj1 : arr1) {
			if (map.containsKey(obj1)) {
				map.put(obj1, map.get(obj1) + 1);
			} else {
				map.put(obj1, 1);
			}
		}

		for (Object obj2 : arr2) {
			if (map.containsKey(obj2)) {
				map.put(obj2, map.get(obj2) + 1);

			} else {
				map.put(obj2, 1);
			}
		}

		Set<Object> set = map.keySet();

		for (Object obj : set) {
			if (map.get(obj) > 1) {
				System.out.println(obj + " ---- " + map.get(obj));
			}
		}
	}

	public static void main(String[] args) {

		Object[] arr1 = { 1, 2, 2, 3, 3, 4, 5 };
		Object[] arr2 = { 2, 3, 4, 4, 6, 5, 6, 7, 8, 9 };

		Object[] strings1 = { "adithya", "adit", "adithya", "jaya" };
		Object[] strings2 = { "jayasimha", "kopp", "kopp", "simha", "adithya" };

		commonElementinArray cd = new commonElementinArray();
		cd.commonElements(strings1, strings2);
	}

}
