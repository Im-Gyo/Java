package Java;

class Test1 {
	int a,b;
	
	public Test1() { // �⺻������
		
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
		super(a,b);		//super�� ���� Ŭ������ ����Ű�� Ű���� (a,b)�� �����ڸ� �ǹ�
	}	
		
		/* ���� Ŭ������ ȣ��� �� �ڵ����� ���� Ŭ������ �⺻ �����ڸ� ȣ���Ѵ�.
		�׷��� ���� Ŭ������ �Ű������� �ִ� �����ڰ� ������ �ڹ� �� �ڵ����� ���� Ŭ������ �⺻ �����ڸ� ��������� �ʴ´�.
		���� ���� Ŭ������ �⺻ �����ڸ� �߰��ؾ��Ѵ�. */
	
}

public class Inheritance {

	public static void main(String[] args) {
		

	}

}
