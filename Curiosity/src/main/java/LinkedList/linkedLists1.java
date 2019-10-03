package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class linkedLists1 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		int []elements = {0,3,2,0};
		for (int i : elements) {
			list.add(i);
		}
		for (int i : new linkedLists1().findSums(list)) {
			System.out.print(i + " ");
		}
	}

	private LinkedList<Integer> findSums(LinkedList<Integer> list) {
		LinkedList<Integer> myList = new LinkedList<>();
		ArrayList<Integer> TempList = new ArrayList<>();
		int sum = 0;
		for (int i : list) {
			sum += i;
			TempList.add(i);
			if (i==0) {
				myList.add(sum);
				sum=0;
				TempList.clear();
			}
		}
		for (int i : TempList) {
			myList.add(i);
		}
		return myList;
	}
}
