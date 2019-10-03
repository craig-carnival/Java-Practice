package dynamicProgramming;

import java.util.Arrays;

public class coinChangeProblem {
	public static void main(String[] args) {
		long total = 4;
		long[] denominations = {1, 2, 3};
		System.out.println(new coinChangeProblem().getWays(total, denominations));
	}

	private long getWays(long n, long[] c) {
		long[] table = new long[(int) n + 1];
		Arrays.fill(table, 0);
		table[0] = 1;
		for (int i = 0; i < c.length; i++) {
			for (long j = c[i]; j <= n; j++) {
				int ab = (int) (j - c[i]);
				table[(int) j] += table[ab];
			}
		}
		return table[(int) n];

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
