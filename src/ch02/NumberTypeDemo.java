package ch02;

public class NumberTypeDemo {

	public static void main(String[] args) {
		// 소리가 1시간(60*60초)동안 가는거리
		int mach;
		int distance;
		mach = (int) 340.0f;// douvle 을 int 로 명시적(강제) 형변환
		distance = 60 * 60 * mach;
		System.out.printf("소리가 1시간(60*60초)동안 가는거리 %d 입니다\n", distance);

		// 반지름이 10.0 인원의 넒이
		final double PI = 3.14;
		// int radius = 10;
		double radius = 10.0; // int 가 douvble 로 자동 형변환
		double area = PI * radius * radius;
		System.out.printf("반지름이 10.0 인원의 넒이는 %f입니다 \n", area);

		long l = (long) 3.14d;
	}

}
