package Java;


interface inter1{
	int apple = 1; // 인터페이스로 선언된 변수는 무조건 public static final의 속성을 갖는다.(구현없이 사용가능)
	public void a();
	//private void c();
	//인터페이스의 멤버는 반드시 public 이어야 한다.
}

//interface 끼리도 상속이 가능하다.
interface inter2 extends inter1{
	public void b();
}


// Newinterface 인터페이스를 구현했다.
// interface는 상위클래스(인터페이스)에서 만든 규약을 하위클래스(구현받는클래스)에서 강제로 구현해야한다.
// 협업에서 주로 사용하며, 예를 들어 로직과 클래스를 각자 구현한다고 하면 서로 인터페이스를 제공해서 소통한다.

// - 규칙 -
// 하나의 클래스가 여러개의 인터페이스를 구현할 수 있다.
// class Jinterface implements Newinterface, Newinterface2
class Jinterface implements Newinterface {
	int a, b;
	
	@Override
	public void interobj(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("인터페이스");
	}		
}

public class Interface {

	public static void main(String[] args) {
		
		Jinterface Jinter = new Jinterface();
		Jinter.interobj(1, 2);
	}

}

// interface와 abstract는 비슷 하지만 interface는 하나의 고유한 형태를 가지고 있고, abstract는 일반적인 클래스이다.
// 때문에 interface는 구체적인 로직을 가질 수 없고, abstract는 구체적인 로직을 가질 수 있다.