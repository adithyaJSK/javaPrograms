package programs;

public class primeNumber {

	public void primeNum(int n) {

		boolean status = false;
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				status = true;
				break;
			} else {
				status = false;
			}
		}

		if (!status) {
			System.out.println("Given number " + n + " is a prime number");
		} else {
			System.out.println("Given number " + n + " is not a prime number");
		}
	}

	public static void main(String[] args) {
		primeNumber pn = new primeNumber();
		pn.primeNum(31);
	}

}
