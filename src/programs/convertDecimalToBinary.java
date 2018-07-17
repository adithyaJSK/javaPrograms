package programs;

import java.util.ArrayList;

public class convertDecimalToBinary {

	public static void convertDectoBin(int number) {

		ArrayList<Integer> array = new ArrayList<Integer>();

		while (number > 0) {
			array.add(number % 2);
			number = number / 2;
		}

		int length = array.size() - 1;
		while (length >= 0) {
			System.out.print(array.get(length));
			length--;

		}
	}

	public static void main(String[] args) {
		convertDectoBin(9);
	}
}
