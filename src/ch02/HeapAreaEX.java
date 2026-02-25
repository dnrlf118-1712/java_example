package ch02;

public class HeapAreaEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		Object obj = new Object(); // 1. 4바이트 확보 2. 힙영역에 object 객체생성 3.주소를 1번에 확보한 변수에 할당
		String str = new String(); // 1. 4확보 2.힙영역에 String 객체생성("hello")3.조소를 한번에 확보한 변수에

		int value = 3;

		String.out.println(str); // 0x100
		String.out.println(obj); // 0x200
	}

}
