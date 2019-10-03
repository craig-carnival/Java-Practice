package dynamicProgramming;

public class sherlockAndCoin {
	private int cost(int[] B) {
		int sum = 0, sum1 = 0, sum2 = 0;
		for (int i = 0; i < B.length - 1; i++) {
			sum1 = sum2 = sum;
			if (i == 0)
				sum1 += B[i + 1] - 1;
			else
				sum1 += B[i + 1] - B[i];
			sum2 += B[i] - 1;
			int dummy = 1;
			if (sum1 > sum2) {
				B[i] = 1;
				sum = sum1;
			} else {
				B[i + 1] = 1;
				sum = sum2;
			}
		}
		return sum;
	}

	private void printer(int[][] jobs) {
		for (int[] i : jobs) {
			for (int j : i) {
				System.out.print(j + " - ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[] b = {100, 2, 100, 2, 100};
		System.out.println(new sherlockAndCoin().cost(b));
	}
}
