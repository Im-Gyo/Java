package Java;

abstract class A { // �߻� �޼ҵ带 �ϳ��� �����ϰ� ������ �߻� Ŭ������ �ȴ�.
	static final int num = 3; 	// final Ű����� ���� ������ ���� ����. final Ű����� �޼ҵ峪 class���� ����� ��� ����� �Ұ����ϴ�.
	
	public abstract void b();	// �޼ҵ� b�� �ñ״�ó�� ����, ��ü���� ������ ����Ŭ�������� �������̵� �Ǿ����.
	
//	public abstract void c() {
//		System.out.println("�߻�C");
//	} 
//  - ������ �ִ� �޼ҵ�� abstract Ű���带 ���� �� ����. - 
	
// �߻� Ŭ���� �������� �߻� �޼ҵ尡 �ƴ� �޼ҵ尡 ������ �� �ִ�.	
	public void d() {
		System.out.println("�Ϲ� �޼ҵ�");
	}
}

class B extends A {	// �߻� Ŭ������ ��ӹ޾� �������̵��ؼ� ���.
	public void b() { // �޼ҵ� �������̵�
		System.out.println("�߻�A");	
	}
}


public class Abstract {

	public static void main(String[] args) {
		//A obj = new A();
		// �߻� Ŭ������ �޼ҵ��� ������ �������� �ʱ� ������ �ν��ͽ�ȭ ���Ѽ� ����� �� ����.
		B obj = new B();
		obj.b();
	}

}
