package dynamicProgramming;

import java.util.Arrays;

public class knapsack {
	public static void main(String[] args) {

		int[] arr = new int[10];
		for (int i=0; i<5; i++) {
			arr[i] = i+1;
		}
		Arrays.sort(arr);
		for (int i=0; i<10; i++) {
			System.out.println(arr[i]);
		}

		System.exit(25);
		int[] values = {60, 100, 120};
		int[] weights = {10, 20, 30};
		int capacity = 50;
		System.out.println(new knapsack().zeroOneKnapsack(values, weights, capacity));
	}

	private int zeroOneKnapsack(int[] values, int[] weights, int capacity) {
		int wt = weights.length;
		int[][] knapsack = new int[wt + 1][capacity + 1];
		for (int i = 0; i <= wt; i++) {
			knapsack[i][0] = 0;
		}
		for (int i = 1; i <= capacity; i++) {
			knapsack[0][i] = 0;
		}
		for (int i = 1; i <= wt; i++) {
			for (int j = 1; j <= capacity; j++) {
				if (j >= weights[i]) {
					knapsack[i][j] = Math.max(knapsack[i - 1][j],
							values[i - 1] + knapsack[i - 1][j - weights[i - 1]]);
				} else {
					knapsack[i][j] = knapsack[i - 1][j];
				}
			}
		}
//		return knapsack[];
		return 0;
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
