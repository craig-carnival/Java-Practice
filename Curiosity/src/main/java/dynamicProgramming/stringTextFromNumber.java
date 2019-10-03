package dynamicProgramming;

/*
https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class stringTextFromNumber {
	public List<String> letterCombinations(String digits) {
		int index;
		String[][] arr = {{},
				{},
				{"a", "b", "c"},
				{"d", "e", "f"},
				{"g", "h", "i"},
				{"j", "k", "l"},
				{"m", "n", "o"},
				{"p", "q", "r", "s"},
				{"t", "u", "v"},
				{"w", "x", "y", "z"}};
		List<String> myList = new ArrayList<>();
		List<String> tempList;
		for (int i = 0; i < digits.length(); i++) {
			index = ((int) digits.charAt(i)) - 48;
			if (i == 0) {
				myList.addAll(Arrays.asList(arr[index]));
			} else {
				tempList = crossMultiply(myList, arr[index]);
				myList.clear();
				myList.addAll(tempList);
			}
		}
		return myList;
	}

	private List<String> crossMultiply(List<String> one, String[] two) {
		List<String> tempList = new ArrayList<>();
		for (String x : one) {
			for (String y : two) {
				tempList.add(x.concat(y));
			}
		}
		return tempList;
	}

	public static void main(String[] args) {
		System.out.println(new stringTextFromNumber().letterCombinations("23"));
	}
}
