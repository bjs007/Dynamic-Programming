
public class Product {

	int minProduct(int a, int b) {
		int smaller = a < b ? a : b;
		int bigger = a > b ? a : b;
		int[] memo = new int[smaller + 1];
		return 0;
	}

	int minProductHelper(int smaller, int bigger, int[] memo) {
		if (smaller == 0)
			return 0;
		else if (smaller == 1)
			return bigger;
		else if (memo[smaller] > 0) {
			return memo[smaller];
		}
		int s = smaller >> 1;

		int side1 = minProductHelper(s, bigger, memo);
		int side2 = side1;
		if (smaller % 2 == 1)
			side2 = minProductHelper(smaller - s, bigger, memo);
		memo[smaller] = side1 + side2;
		return memo[smaller];
	}
}
