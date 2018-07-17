package programs;

/*
 * input --> {4,3,2,1}
 * output --> {1,2,3,4} 
 */

public class selectionSort {

	public void selSort(int[] array) {

		for (int i = 0; i < array.length; i++) {
			int index = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[index]) {
					index = j;
				}
			}

			int temp = array[index];
			array[index] = array[i];
			array[i] = temp;

		}

		for (int k = 0; k < array.length; k++) {
			System.out.print(array[k] + " ");
		}
	}

	public static void main(String[] args) {
		selectionSort sr = new selectionSort();
		int[] array = { 4, 3, 2, 1, 2, 3 };
		sr.selSort(array);
	}

}
