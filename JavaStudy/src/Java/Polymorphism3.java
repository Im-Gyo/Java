package Java;
interface I1{
	public void A();
}

interface I2{
	public void B();
}

class polinter implements I1, I2 {

	@Override
	public void B() {
		System.out.println("나는 I2");
	}

	@Override
	public void A() {
		System.out.println("나는 I1");
	}
	
}

public class Polymorphism3 {

	public static void main(String[] args) {
		polinter obj = new polinter();
		I1 obj1 = new polinter();
		I2 obj2 = new polinter();
		
		obj.A();	// obj인스턴스는 interface I1과 I2 모두를 구현하고 있는 polinter클래스를 데이터타입으로 선언했기 때문에 각각 interface에서 선언한 메소드들을 사용할 수 있다..
		obj.B();
		
		obj1.A();	// obj1인스턴스는 interface I1 을 데이터타입으로 인스턴스화 했기 때문에, I1에서 선언한 메소드만 사용할 수 있다. (클래스는 polinter라서 오버라이드 한 메소드 사용)
		//obj1.B();
		
		obj2.B();	// obj2인스턴스는 interface I2 을 데이터타입으로 인스턴스화 했기 때문에, I2에서 선언한 메소드만 사용할 수 있다. (클래스는 polinter라서 오버라이드 한 메소드 사용)
		//obj2.A();
		
	}
		
		/* 예를들어서, polinter는 스마트폰이다. 이 스마트폰의 기능 중 I1은 전화이고 I2는 게임이라고 했을 때, 
		 * 부모님께 스마트폰을 드리면서 설명할 때는 전화기 I1의 기능으로 설명하고
		 * 어린아이에게 스마트폰을 주며 설명할 때는 게임 I2의 기능으로 설명을 해서 
		 * 같은 스마트폰이지만 다른 기능을 하게끔 만드는 것 이다.*/
		
}
