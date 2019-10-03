package dynamicProgramming;

public class waysToGetTotal {
	public static void main(String[] args) {
		int total = 5;
		int[] denominations = {1, 2, 3};
		System.out.println(new waysToGetTotal().minNumberOfWays(denominations, total));
	}

	private int minNumberOfWays(int[] denominations, int total) {
		int n = denominations.length;
		int[][] t = new int[n][total + 1];
		for (int i = 0; i < n; i++) {
			t[i][0] = 1;
		}
		for (int i = 1; i < total + 1; i++) {
			t[0][i] = 1;
		}
//		printer(t);
//		System.exit(12);
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= total; j++) {
				if (j >= denominations[i]) {
					t[i][j] = t[i - 1][j] + t[i][j - denominations[i]];
				} else {
					t[i][j] = t[i - 1][j];
				}
			}
		}
		printer(t);
		System.exit(12);
		return t[n - 1][total];
	}

	private void printer(int[][] jobs) {
		for (int[] i : jobs) {
			for (int j : i) {
				System.out.print(j + " - ");
			}
			System.out.println();
		}
	}
}
