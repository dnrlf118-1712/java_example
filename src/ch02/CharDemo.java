package ch02;

public class CharDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// char c = 'A';
		char c = 65;
		// char c = '\u0041';
		System.out.println(c);

		String str = "hello";// 0번쩨 위치에 있는문자를 꺼내보자 .
		char c1 = str.charAt(0);
		System.out.println(c1);

		// 숫자를 문자로 형변환; 3=> '3'
		char c2 = 3 + '0'; // '3'
		System.out.println(c2);
		// 문자를 술자로 현변환
		int il = c2 - '0'; // 3
		System.out.println(il);
		// 문자를 문자열로 형변환
		String str2 = c1 + "";
		System.out.println(str2);
		// 숫자를 문자열로 형변환
		String str3 = 7 + "";
		System.out.println(str3);

		// 문자열을 숫자로 형변환

		// 순자형태의 문자열을 숫자로
		String str6 = "30000" + 10; // ==> "3000010"
		int i6 = Integer.parseInt(str6) + 10;
		System.out.println(i6);

		// (doule) 숫자형태의 문자열을 숫자로
		String str7 = "3.140002";
		double d2 = Double.parseDouble(str7);

		String str4 = 7 + 7 + ""; // 7+7=14 + "" => "14"
		String str5 = "" + 7 + 7; // ""+7="7"+7 => "77"

	}

}
