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
		B.id = 2;		// 매개변수 B의 값을 다른 객체로 교환한 것이 아니라 인스턴스 변수id값을 2로 변경하고 있다.
						// 이 맥락에서 변수B는 변수 A와 참조 관계로 연결되어 있기 때문에 A와B는 모두 같은 객체를 참고하고 있다.
						// 매개변수를 다른 객체로 변경하는 것과 참조 데이터 타입(원시데이터형을 제외한 데이터형)의 매개변수에 담겨 있는 객체에 접근하는 것은 완전히 다른 의미를 가진다.
		System.out.println(A.id);
	}

	public static void main(String[] args) {
		RefValue();
		RefReferance();
	}

}
