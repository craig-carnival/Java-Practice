package StringManipulation;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringsYo {
	public static void main(String[] args) {
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
