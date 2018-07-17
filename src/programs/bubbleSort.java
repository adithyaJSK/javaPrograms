package programs;

public class bubbleSort {

	public void bubbSort(int[] array) {
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		for (int k = 0; k < array.length; k++) {
			System.out.print(array[k] + " ");
		}

	}

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 3, 1, 5, 2 };
		int[] array1 = { 0, 2, 3, 1, 4, 2, 3, 6, 8, 1 };
		bubbleSort bs = new bubbleSort();
		bs.bubbSort(array1);

	}
}
