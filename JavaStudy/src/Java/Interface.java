package Java;


interface inter1{
	int apple = 1; // �������̽��� ����� ������ ������ public static final�� �Ӽ��� ���´�.(�������� ��밡��)
	public void a();
	//private void c();
	//�������̽��� ����� �ݵ�� public �̾�� �Ѵ�.
}

//interface ������ ����� �����ϴ�.
interface inter2 extends inter1{
	public void b();
}


// Newinterface �������̽��� �����ߴ�.
// interface�� ����Ŭ����(�������̽�)���� ���� �Ծ��� ����Ŭ����(�����޴�Ŭ����)���� ������ �����ؾ��Ѵ�.
// �������� �ַ� ����ϸ�, ���� ��� ������ Ŭ������ ���� �����Ѵٰ� �ϸ� ���� �������̽��� �����ؼ� �����Ѵ�.

// - ��Ģ -
// �ϳ��� Ŭ������ �������� �������̽��� ������ �� �ִ�.
// class Jinterface implements Newinterface, Newinterface2
class Jinterface implements Newinterface {
	int a, b;
	
	@Override
	public void interobj(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("�������̽�");
	}		
}

public class Interface {

	public static void main(String[] args) {
		
		Jinterface Jinter = new Jinterface();
		Jinter.interobj(1, 2);
	}

}

// interface�� abstract�� ��� ������ interface�� �ϳ��� ������ ���¸� ������ �ְ�, abstract�� �Ϲ����� Ŭ�����̴�.
// ������ interface�� ��ü���� ������ ���� �� ����, abstract�� ��ü���� ������ ���� �� �ִ�.