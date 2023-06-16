package Learn;

class Operation {
	int sq(int n) {
		return n * n;
	}
}

class cir {
	Operation op;
	double pi = 3.14;

	double area(int redius) {
		op = new Operation();
		int rsquare = op.sq(redius);
		return pi * rsquare;
	}
}

public class Aggregation {
	public static void main(String[] args) {
		cir c = new cir();
		double result = c.area(5);
		System.out.println(result);
	}
}
