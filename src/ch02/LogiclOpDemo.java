package ch02;

public class LogiclOpDemo {

	public static void main(String[] args) {
		// 논리연산
		boolean a = true;
		boolean a1 = false;
		boolean b = true;
		boolean b1 = false;

		System.out.println(a && b);// true
		System.out.println(a && b1);// false

		System.out.println(a || b1);// true

		System.out.println(!a);// false
		System.out.println(a ^ b);// false
		System.out.println();

		// 쇼트서킷

		// by zero 에제 ==> 쇼트서킷읋 간단히 바꿔보자
		int i = 0;
		if (i == 0) {
			System.out.println("0으로 나눌수없습니다");
		} else {
			System.out.println(5 / i);
		}

		if ((i != 0) && ((5 / i > 0))) {

			System.out.println("나눈값이 0보다큽니다");
		}

		// 조건 연산/삼항 연산으로 변환
		int j = (i != 0) ? 5 / i : 0;
		System.out.println(j);

		// 연산자 우선순위

		int x = 3, y = 3, z = 3;

		int res = x * y / z % 2;

		System.out.println(res);
	}

}
