package Java;


class AC {
	public void AC1() {
		AC2();	//���� Ŭ�����̱� ������ AC2 ���� ����.
	}
	
	private void AC2() {
		System.out.println("private");
	}
}

public class AccessModifier { 	// ���������ڰ� public�� Ŭ������ �ٸ� ��Ű���� Ŭ���������� ����� �� �ְ�, default�� ���� ���� ��Ű�������� ��� ����.
								//public Ŭ������ Ŭ������� �ҽ��ڵ��� ���ϸ��� ���ƾ��Ѵ�.

	public static void main(String[] args) {
		AC ac = new AC();
		ac.AC1(); // ���������ڰ� public���� �����߱� ������ �ٸ� Ŭ�������� ������ �� �ִ�.
		//ac.AC2(); ���������ڰ� private�� �����߱� ������ �ٸ� Ŭ�������� ������ �� ����.
	}
}
