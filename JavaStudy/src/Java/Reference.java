package Java;

class RefA{
	public int id;
	RefA(int id){
		this.id = id;
	}
}


public class Reference {
	
	public static void RefValue() {		//����b�� a�� �����ϰ� �ִ�.
		int a = 1;
		int b = a;
		b = b + 1;
		System.out.println(a);
	}
	
	public static void RefReferance() {	// ���� B�� A�� ��� �ν��Ͻ��� ���� ����.
		RefA A = new RefA(1);
		RefA B = A;
		B.id = 2;
		System.out.println(A.id);
	}

	public static void main(String[] args) {
		RefValue();
		RefReferance();
	}

}
