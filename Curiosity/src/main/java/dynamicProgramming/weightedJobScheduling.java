package dynamicProgramming;

import java.util.Arrays;

public class weightedJobScheduling {
	public static void main(String[] args) {
		int[][] jobs = {{2, 5, 6},
				{6, 7, 4},
				{7, 9, 2},
				{1, 3, 5},
				{5, 8, 11},
				{4, 6, 5}};
		System.out.println(new weightedJobScheduling().scheduleJobs(jobs));
	}

	private int scheduleJobs(int[][] jobs) {

		// sorting jobs in increasing order based on end time
		int small, pos, tempval, tempstart, tempend;
		for (int i = 0; i < jobs.length; i++) {
			small = jobs[i][1];
			pos = i;
			for (int j = i + 1; j < jobs.length; j++) {
				if (jobs[j][1] < small) {
					small = jobs[j][1];
					pos = j;
				}
			}
			tempstart = jobs[i][0];
			tempend = jobs[i][1];
			tempval = jobs[i][2];
			jobs[i][0] = jobs[pos][0];
			jobs[i][1] = jobs[pos][1];
			jobs[i][2] = jobs[pos][2];
			jobs[pos][0] = tempstart;
			jobs[pos][1] = tempend;
			jobs[pos][2] = tempval;
		}

		// making a temp array
		int[] tempProfit = new int[jobs.length];
		for (int i = 0; i < jobs.length; i++) {
			tempProfit[i] = jobs[i][2];
		}

		printer(jobs);

		// actual code here
		int n = jobs.length;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i - 1; j++) {
				if (jobs[j][1] <= jobs[i][0]) {
					if (tempProfit[i] < tempProfit[j] + jobs[i][2]) {
						tempProfit[i] = tempProfit[j] + jobs[i][2];
					}
				}
			}
		}

		Arrays.sort(tempProfit);
		return tempProfit[tempProfit.length - 1];
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
