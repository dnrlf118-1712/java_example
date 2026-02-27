package ch03;

public class OverloadDemo {

	public static void main(String[] args) {

		int i1 = 3, i2 = 7, i3 = 10;
		double d1 = 7.0, d2 = 3.0;
// 이코드는 printf 로 만든 코드이며 %정수, %.1f소수점 한자리 실수, \n 줄바꿈 ,을써서 보기좋게하기위함
		System.out.printf("max(%d, %d) = %d\n", i1, i2, max(i1, i2));
		System.out.printf("max(%.1f, %.1f) = %.1f\n", d1, d2, max(d1, d2));
		System.out.printf("max(%d, %d, %d) = %d\n", i1, i2, i3, max(i1, i2, i3));

// 주석처리되어있는 부분은 그냥값만 나오게 단순하게 짝코드이다 		
//		System.out.println(max(i1, i2));
//		System.out.println(max(d1, d2));
//		System.out.println(max(i1, i2, i3));

//  더 단순하게 이렇게 코드를짜도 문제없이 결과 돌출가능
//		System.out.println(max(i1, i2));
//		System.out.println(max(d1, d2));
//		System.out.println(max(i1, i2, i3));

	}

	// int 2개 비교
	public static int max(int n1, int n2) {
		return n1 > n2 ? n1 : n2;
	}

	// double 2개 비교
	public static double max(double n1, double n2) {
		return n1 > n2 ? n1 : n2;
	}

	// int 3개 비교
	public static int max(int n1, int n2, int n3) {
		return max(max(n1, n2), n3);
	}
}
