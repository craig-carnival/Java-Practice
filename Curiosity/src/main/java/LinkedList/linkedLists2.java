package LinkedList;

import java.util.LinkedList;

public class linkedLists2 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		int []elements = {1,2,3,4,5,6,7,8,9,10};
		for (int i : elements) {
			list.add(i);
		}
		for (int i : new linkedLists2().deleteNumbers(list, 3, 2)) {
			System.out.print(i + " ");
		}
	}

	private LinkedList<Integer> deleteNumbers(LinkedList<Integer> list, int m, int n) {
		LinkedList<Integer> myList = new LinkedList<>();
		int i=0, j=0;
		while (i<list.size()) {
			if (j==m) {
				i+=n;
				j=0;
			}
			if (i<list.size())
			myList.add(list.get(i));
			i++;
			j++;
		}
		return myList;
	}
}
