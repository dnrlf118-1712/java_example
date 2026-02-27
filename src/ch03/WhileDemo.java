package ch03;

import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.println("숫자를 입력하세요. 종료하시려면 -1을 입력하세요:");

			int number = in.nextInt();

			if (number == -1) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			System.out.println("계속 실행합니다.");
		}

		in.close();
	}
}