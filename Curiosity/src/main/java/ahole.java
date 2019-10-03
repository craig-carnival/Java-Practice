public class ahole {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		arr = new ahole().rotLeft(arr, 3);
		for (int i : arr) {
			System.out.print(i + " ");
		}
//		int j = Math.max()
	}

	private int[] rotLeft(int[] arr, int d) {
		d = d % arr.length;
		int newPosition; int []makenew = arr.clone();
		for (int j = 0; j < arr.length; j++) {
			newPosition = j - d;
			if (newPosition < 0)
				arr[newPosition + arr.length] = makenew[j];
			else
				arr[newPosition] = makenew[j];
		}
		return arr;
	}
}
