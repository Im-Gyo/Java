package Java;

class overload{
	int a, b, c;
	
	// �޼ҵ� ���� ������ �Ű����� ���� �ٸ�
	public void sum(int a, int b) {	
		this.a = a;
		this.b = b;
		System.out.println(this.a + this.b);
	}
	
	//�޼ҵ� ���� ������ �Ű����� ���� �ٸ�
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
		// ȣ��ɶ� �Ű����� ���� ���� �ٸ� �޼ҵ尡 ȣ��ȴ�.
		// �̸��� ������ �ñ״�ó�� �ٸ� �޼ҵ带 �ߺ����� ������ �� �ִ� ��� (overloading, �����ε�) ��� �ÿ��� ����. 
	}
}
