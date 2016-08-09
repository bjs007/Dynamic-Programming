import java.util.Arrays;

public class TripleStep {

	int[] memo;

	TripleStep(int n) {
		memo = new int[n + 1];
		Arrays.fill(memo, -1);
	}

	int possibleWays(int n) {

		if (n < 0)
			return 0;
		if (n == 0)
			return 1;
		if (memo[n] > 0)
			return memo[n];
		memo[n] = possibleWays(n - 1) + possibleWays(n - 2) + possibleWays(n - 3);
		return memo[n];
	}

	public static void main(String arg[]) {
		TripleStep ts = new TripleStep(10);
		int steps = ts.possibleWays(10);
		System.out.println(steps);
	}
}

/*
 * Time complexity: Time complexity is 0(3^n)
 * 
 */