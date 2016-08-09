
public class Multiply {
	int calculateMultiplication(int a, int b) {
		int x = Math.max(a, b);
		int n = Math.min(a, b);
		return multiply(x, n);
	}

	int multiply(int x, int n) {
		if (n == 1)
			return x;
		if (n == 0)
			return 0;
		if (n % 2 == 0) {
			n = n >> 1;
			int d = multiply(x, n);
			return d + d;
		} else {
			int d = x + multiply(x, (n - 1));
			return d;
		}
	}
	public static void main(String[] args){
		Multiply m = new Multiply();
		int value = m.calculateMultiplication(6, 5);
		System.out.println(value);
	}
}
