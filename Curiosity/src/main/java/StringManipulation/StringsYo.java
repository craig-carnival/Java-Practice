package StringManipulation;

/*
* removed all not necessary impprts
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class StringsYo {
	public static void main(String[] args) throws IOException {
		// Made chandes to use the function
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String x = read.readLine();
		String regex = read.readLine();
		System.out.println(findRemaining(x, regex));
	}

	static String findRemaining(String abc, String regex) {
		if (abc.contains(regex)) {
			abc = abc.replaceFirst(regex, "");
			return findRemaining(abc);
		} else {
			return abc;
		}
	}
}
