package ch03;

public class RerumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printScre(90);
		printScre(100);
		printScre(-10);

	}

	public static void printScre(int score) {
		// 입력받은 인자 (점수)를 출력하는 함수
		// 단, 0~100 점사이의 값이 아닌점수가 잘못전달되면 잘못된점수입니다
		if (score < 0 || score > 100) {
			System.out.println("당신의 점수는 " + score + "점 입니다");
			return;
		}
		System.out.println("당신의 점수는 " + score + "점 입니다");
//      return;		
	}

}
