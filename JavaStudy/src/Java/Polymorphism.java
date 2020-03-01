package Java;

class AA {
	public void x() {
		System.out.println("x.A");
	}
}

class BB extends AA {		// 클래스 A를 상속받고 있다.
	public void y() {
		System.out.println("y");
	}
	
	public void x() {
		System.out.println("x.B");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		AA obj = new BB();	// 클래스 B의 데이터 타입을 클래스 A로 인스턴스화 시켰다.
							// 클래스 B는 클래스 A의 행세를 하는 것 이다.
		obj.x();			// 때문에 클래스 A에 정의 되어 있는 메소드는 사용할 수 있고, 현재 클래스B에서 클래스A(부모 클래스)에 정의되어 있는 메소드를 오버라이딩 했기 때문에, 클래스B에서 오버라이딩 한 메소드x()가 출력된다.
		
		//obj.y();			// 클래스B는 클래스 A(부모 클래스) 데이터 타입으로 정의가 되었고, 따라서 클래스 B에서 새롭게 정의한 메소드는 사용할 수 없다.
							// 하지만 B obj = new B()로 인스턴스화 했다면, 이 메소드는 사용이 가능하다.

	}

}
