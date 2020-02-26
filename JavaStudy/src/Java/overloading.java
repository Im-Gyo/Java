package Java;

class overload{
	int a, b, c;
	
	// 메소드 명이 같지만 매개변수 수가 다름
	public void sum(int a, int b) {	
		this.a = a;
		this.b = b;
		System.out.println(this.a + this.b);
	}
	
	//메소드 명이 같지만 매개변수 수가 다름
	public void sum(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println(this.a + this.b + this.c);
	}
}

class overload2 extends overload {
	public void sum(int a, int b, int c, int d) {
		System.out.println(125656);
	}
}

public class overloading {

	public static void main(String[] args) {
		overload2 load1 = new overload2();
		load1.sum(1,2);
		load1.sum(1,2,3);
		load1.sum(1, 2, 3, 4);
		// 호출될때 매개변수 수에 따라 다른 메소드가 호출된다.
		// 이름은 같지만 시그니처는 다른 메소드를 중복으로 선언할 수 있는 방법 (overloading, 오버로딩) 상속 시에도 가능. 
	}
}
