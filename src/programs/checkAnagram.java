package programs;

public class checkAnagram {

	String s1 = "fuck";
	String s2 = "kucf";

	public boolean checkAnag(String a1, String a2) {

		char[] chars = a1.toCharArray();
		StringBuilder a2String = new StringBuilder(a2);
		for (Character ca : chars) {
			int index = a2String.indexOf("" + ca);
			System.out.println(index);
			if (index != -1) {
				a2String.deleteCharAt(index);
			}
		}

		if (a2String.length() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		checkAnagram ca = new checkAnagram();
		boolean status = ca.checkAnag(ca.s1, ca.s2);
		System.out.println("Anagram status of " + ca.s1 + " and " + ca.s2 + " is " + status);

	}

}
