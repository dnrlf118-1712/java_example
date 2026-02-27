package ch03;

public class MethcdCallDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		System.out.println("increment 메서드 호출전 x값은" + x);
		increment(x);
		System.out.println("increment 메서드 호출후 x값은" + x);

	}

	public static void increment(int n) { // call by value -- read read inly
		System.out.println("increment 메서드 시작할때 n값은" + n);
		n++;
		System.out.println("increment 매서드 종료할때 n값은" + n);
	}

}!
