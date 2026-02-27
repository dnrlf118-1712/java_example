
package ch03;

import java.util.Scanner;

public class HHH {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int balance = 0; // 잔고
		boolean run = true; // 반복 제어용

		while (run) {

			System.out.println("-------------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고조회 | 4. 종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택 > ");

			String input = sc.nextLine(); // 🔥 nextLine 사용
			int menu = Integer.parseInt(input); // 문자열 → 정수 변환

			if (menu == 1) {
				System.out.print("예금액 > ");
				int money = Integer.parseInt(sc.nextLine());
				balance += money;

			} else if (menu == 2) {
				System.out.print("출금액 > ");
				int money = Integer.parseInt(sc.nextLine());
				balance -= money;

			} else if (menu == 3) {
				System.out.println("잔고 > " + balance);

			} else if (menu == 4) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}

		sc.close();
	}
}
