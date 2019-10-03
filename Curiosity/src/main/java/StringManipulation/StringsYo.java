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
		LocalDate date = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E");
		System.out.println(dtf.format(date));
	}

	static String findRemaining(String abc) {
		if (abc.contains("Abc")) {
			abc = abc.replaceFirst("Abc", "");
			return findRemaining(abc);
		} else {
			return abc;
		}
	}
}
