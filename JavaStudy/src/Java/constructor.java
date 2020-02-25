package Java;


class Test {
	int a, b;
	public Test(int a, int b) {
		this.a = a;
		this.b = b;
	}
}

public class constructor {
	public static void main(String[] args) {		
		Test T1 = new Test(1,2);
		System.out.println(T1);
	}	
}