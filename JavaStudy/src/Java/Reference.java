package Java;

class RefA{
	public int id;
	RefA(int id){
		this.id = id;
	}
}


public class Reference {
	
	public static void RefValue() {		//변수b는 a를 참조하고 있다.
		int a = 1;
		int b = a;
		b = b + 1;
		System.out.println(a);
	}
	
	public static void RefReferance() {	// 변수 B와 A에 담긴 인스턴스가 서로 같다.
		RefA A = new RefA(1);
		RefA B = A;
		B.id = 2;
		System.out.println(A.id);
	}

	public static void main(String[] args) {
		RefValue();
		RefReferance();
	}

}
