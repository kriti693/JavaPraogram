package Simple;

public class UnioOfTwoArray {
	public static void main(String[] args) {
		SortedArray s = new SortedArray();
		int count = 0;
		int a1[] = { 1, 2, 3, 4, 5 };
		int a2[] = { 1, 2, 3 };
		s.sortArray(a1);
		s.sortArray(a2);
		int i = 0;
		int j = 0;
		while (i < a1.length && j < a2.length) {

			if (a1[i] < a2[j]) {
				System.out.println(a1[i] + " ");
				i++;

			}

			else if (a1[i] > a2[j]) {
				System.out.println(a2[j] + " ");
				j++;
			}

			else {
				System.out.println(a1[i] + " ");
				i++;
				j++;
			}

		}

		while (i < a1.length) {
			System.out.println(a1[i] + " ");
			i++;
		}
		while (j < a2.length) {
			System.out.println(a2[j] + " ");
			j++;
		}

	}

}
