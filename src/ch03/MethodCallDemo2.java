package ch03;

public class MethodCallDemo2 {

	public static void main(String[] args) {
		RefValue ref = new RefValue();
		System.out.println(ref.x);

	}

	public static void ChangeReFerence(RefValue ref) {

	}

}

class RefValue {
	int x;
}