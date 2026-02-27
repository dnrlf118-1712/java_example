//package ch03;
//
//import java.util.Scanner;
//
//public class Ex2 {
//
//	public static void main(String[] args) {
//		// 구구단 작성하기
//		// 요구사항 - 사용자로부터 구구단을 몇단을 출력할것인지를 입력밭아서 해당의 구구단을 출력하라
//		// 단 , 2 ~ 9 단까지 입력받아 출력한다. 그보다 작거나 큰수가 입력되면 출력할수가 없다라고 하고종료한다.
//		// 기술적요구사항 - while 문을 이용하여 여러번 입력받는 로직을 작성해주세요
//
//		Scanner in = new Scanner(System.in);
//		System.out.println("구구단 몇단을 출력할까요 ?");
//		int dan = in.nextInt();
//		
//		//범위 체크
//		if (2 > dan || dan > 9) {
//			System.out.println("2단부터 9단까지만 출력할수있습니다.");
//		} else {
//			for (int i = 1; i <= 9; i++)// 출력
//				// System.out.println(dan + "X" + i + " = " + (dan * i));
//				System.out.printf("%d X %d = %2d\n", dan, i, dan * i);
//		}

//		System.out.println("2 x 1 = 2");
//		System.out.println("2 x 2 = 4");
//		System.out.println("2 x 3 = 6");
//		System.out.println("2 x 4 = 8");
//		System.out.println("2 x 5 = 10");
//		System.out.println("2 x 6 = 12");
//		System.out.println("2 x 7 = 14");
//		System.out.println("2 x 8 = 16");
//		System.out.println("2 x 9 = 18");

//	}
//}
//package ch03;
//
//import java.util.Scanner;
//
//public class Ex2 {
//
//	public static void main(String[] args) {
//
//		Scanner in = new Scanner(System.in);
//
//		while (true) {
//			System.out.print("구구단 몇 단을 출력할까요? (2~9) : ");
//			int dan = in.nextInt();
//
//			// 범위 체크
//			if (dan < 2 || dan > 9) {
//				System.out.println("2단부터 9단까지만 출력할 수 있습니다. 프로그램을 종료합니다.");
//				break; // 반복 종료
//			}
//
//			// 구구단 출력
//			int i = 1;
//			while (i <= 9) {
//				System.out.printf("%d X %d = %2d\n", dan, i, dan * i);
//				i++;
//			}
//
//			System.out.println(); // 한줄로 나오게
//		}
//
//		in.close();
//	}
//}
package ch03;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int dan; // do 밖에서 선언 (중요!)

		do {
			System.out.print("구구단 몇 단을 출력할까요? (2~9) : ");
			dan = in.nextInt();

			if (dan < 2 || dan > 9) {
				System.out.println("2단부터 9단까지만 출력할 수 있습니다. 프로그램을 종료합니다.");
				break;
			}

			int i = 1;
			while (i <= 9) {
				System.out.printf("%d X %d = %2d\n", dan, i, dan * i);
				i++;
			}

			System.out.println();

		} while (true); // 무한 반복

		in.close();
	}
}