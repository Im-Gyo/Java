package Java;

class Over1{
	int a, b;
	
	public void Over1() {
		System.out.println(11);
	}
}

class Over2 extends Over1{
	public void Over2() {	//����Ŭ������ Over1 �޼ҵ� ����
		super.Over1();
	}
	
	public void Over1() {	
		System.out.println(152);
	}
	//��ӹ��� �޼ҵ带 ������ �Ѵ�. (�޼ҵ� �������̵�, �ߺ��� �ȵ� super���)
	//���� Ŭ�������� ���� Ŭ������ ������ �޼ҵ带 �����ϸ� �θ� Ŭ�����κ��� ���� ���� �⺻ ���� ����� ����
	
	//�������̵��� �ϱ� ���� ����(����Ŭ������ ����Ŭ���� �ΰ��� �ǹ�)
	//�޼ҵ��� �̸�
	//�޼ҵ��� �Ű����� ���ڿ� ������Ÿ��, ����
	//�޼ҵ��� ����Ÿ��
}

public class overriding {

	public static void main(String[] args) {
		Over2 O2 = new Over2();
		O2.Over1();
		O2.Over2();
	}

}
