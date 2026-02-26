package ch02;

public class incrementOpDemo {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;

		x++; // x = 0; x + 1 ; 두개가합쳐진구조
		++y; // y = y + 1

		System.out.println(x);
		System.out.println(y);

		System.out.println(x++);
		System.out.println(++y);

		System.out.println("x = " + x);
		System.out.println("y = " + y);

	}

}
