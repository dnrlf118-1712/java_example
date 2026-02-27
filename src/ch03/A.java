package ch03;

public class A {

	public static void main(String[] args) {
		Mamath math = new Mamath();
		System.out.println(math.add(10, 20));
//		System.out.println(math.sub(10, 20));
		System.out.println(math.add(10.0, 20.0));
		System.out.println(math.add(10.0, 20.0, 30.0));
		System.out.println(math.add(10L, 20L));
		System.out.println(math.add(10L, 20L, 30L));

	}

}

class Mamath {
//	long add(long a, long b) {
//		return a + b;
//	}
//
//	long add(int a, int b) {
//		return a + b;
//	}
//
//	long add(int a, int b, int c) {
//		return a + b + c;
//	}
//
//	long add(long a, long b, long c) {
//		return a + b + c;
//	}
//
//	long sub(long a, long b) {
//		return a - b;
//	}

	long add(long a, long b) {
		return a + b;
	}

	long add(long a, long b, long c) {
		return a + b + c;
	}

	double add(double a, double b) {
		return a + b;
	}

	double add(double a, double b, double c) {
		return a + b + c;
	}
}
