package Java;

abstract class A { // 추상 메소드를 하나라도 포함하고 있으면 추상 클래스가 된다.
	
	public abstract void b();	// 메소드 b의 시그니처만 정의, 구체적인 구현은 하위클래스에서 오버라이딩 되어야함.
	
//	public abstract void c() {
//		System.out.println("추상C");
//	} 
//  - 내용이 있는 메소드는 abstract 키워드를 가질 수 없다. - 
	
// 추상 클래스 내에서는 추상 메소드가 아닌 메소드가 존재할 수 있다.	
	public void d() {
		System.out.println("일반 메소드");
	}
}


public class Abstract {

	public static void main(String[] args) {
		//A obj = new A();
		// 추상 클래스는 메소드의 내용이 존재하지 않기 때문에 인스터스화 시켜서 사용할 수 없다.
	}

}
