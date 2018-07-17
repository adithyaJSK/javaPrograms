package programs;

public class findMiddleIndexWhereRightSumEqualToLeftSum {

	public static int middleIndex(int[] arrayNum) throws Exception {

		int leftSum = 0;
		int rightSum = 0;

		int startIndex = 0;
		int endIndex = arrayNum.length - 1;

		while (true) {
			if (leftSum > rightSum) {
				rightSum = rightSum + arrayNum[endIndex--];
			} else {
				leftSum = leftSum + arrayNum[startIndex++];
			}

			if (startIndex > endIndex) {
				if (leftSum == rightSum) {
					break;
				} else {
					throw new Exception("Please provide correct array");
				}
			}
		}

		return endIndex;
	}

	public static void main(String[] args) throws Exception {

		int[] incorrectArray = { 2, 2, 3, 4, 2, 1, 2 };
		int[] correctArray = { 2, 2, 3, 4, 2, 1 };
		try {
			// int index = middleIndex(incorrectArray);
			int index = middleIndex(correctArray);
			System.out.println("Starting from index 0, adding numbers till index " + index
					+ " and adding rest of the numbers can be equal");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
