package Java;

class Test1 {
	int a,b;
	
	public Test1() { // 기본생성자
		
	}
	
	public Test1(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void val1() {
		System.out.println(112);
	}
}

class Test2 extends Test1 {
	public Test2(int a, int b) {
		super(a,b);		//super는 상위 클래스를 가리키는 키워드 (a,b)는 생성자를 의미
	}	
		
		/* 하위 클래스가 호출될 때 자동으로 상위 클래스의 기본 생성자를 호출한다.
		그런데 상위 클래스에 매개변수가 있는 생성자가 있으면 자바 는 자동으로 상위 클래스의 기본 생성자를 만들어주지 않는다.
		따라서 상위 클래스에 기본 생성자를 추가해야한다. */
	
}

public class Inheritance {

	public static void main(String[] args) {
		

	}

}
