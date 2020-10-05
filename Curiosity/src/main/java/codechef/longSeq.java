package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Removed HashSet and Arrays

public class longSeq {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(reader.readLine());
		int ones, zeroes;
		boolean []results = new boolean[testCases];
		for (int i=0; i<testCases; i++) {
			ones = zeroes = 0;
			String number = reader.readLine();
			for (int j=0; j<number.length(); j++) {
				if (number.charAt(j) == '0')
					zeroes++;
				else
					ones++;
			}
			results[i] = ((ones >= 1) && (zeroes == 1)) || ((zeroes >= 1) && (ones == 1));

		}
		for (boolean x : results) {
			if (x)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}
