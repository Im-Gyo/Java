package Java;

class AA {
	public void x() {
		System.out.println("x.A");
	}
}

class BB extends AA {		// Ŭ���� A�� ��ӹް� �ִ�.
	public void y() {
		System.out.println("y");
	}
	
	public void x() {
		System.out.println("x.B");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		AA obj = new BB();	// Ŭ���� B�� ������ Ÿ���� Ŭ���� A�� �ν��Ͻ�ȭ ���״�.
							// Ŭ���� B�� Ŭ���� A�� �༼�� �ϴ� �� �̴�.
		obj.x();			// ������ Ŭ���� A�� ���� �Ǿ� �ִ� �޼ҵ�� ����� �� �ְ�, ���� Ŭ����B���� Ŭ����A(�θ� Ŭ����)�� ���ǵǾ� �ִ� �޼ҵ带 �������̵� �߱� ������, Ŭ����B���� �������̵� �� �޼ҵ�x()�� ��µȴ�.
		
		//obj.y();			// Ŭ����B�� Ŭ���� A(�θ� Ŭ����) ������ Ÿ������ ���ǰ� �Ǿ���, ���� Ŭ���� B���� ���Ӱ� ������ �޼ҵ�� ����� �� ����.
							// ������ B obj = new B()�� �ν��Ͻ�ȭ �ߴٸ�, �� �޼ҵ�� ����� �����ϴ�.

	}

}
