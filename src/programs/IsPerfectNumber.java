package programs;

public class IsPerfectNumber {

	public boolean isPerfectNumber(int number) {
		int temp = 0;
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				System.out.println("i----" + i);
				temp = temp + i;
				System.out.println(temp);
			}
		}

		if (number == temp) {
			return true;
		}
		return false;

	}

	public void isPrefectNumber(int number) {

		int temp = 0;
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				temp = temp + i;
			}
		}

		if (temp == number) {
			System.out.println(number + " is a perfect number");
		} else {
			System.out.println(number + " is not a perfect number");
		}
	}

	public static void main(String[] args) {
		IsPerfectNumber obj = new IsPerfectNumber();
		// boolean b = obj.isPerfectNumber(27);
		// System.out.println(b);

		obj.isPrefectNumber(6);
		obj.isPrefectNumber(28);
	}

}
