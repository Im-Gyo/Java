package Java;
interface I1{
	public void A();
}

interface I2{
	public void B();
}

class polinter implements I1, I2 {

	@Override
	public void B() {
		System.out.println("���� I2");
	}

	@Override
	public void A() {
		System.out.println("���� I1");
	}
	
}

public class Polymorphism3 {

	public static void main(String[] args) {
		polinter obj = new polinter();
		I1 obj1 = new polinter();
		I2 obj2 = new polinter();
		
		obj.A();	// obj�ν��Ͻ��� interface I1�� I2 ��θ� �����ϰ� �ִ� polinterŬ������ ������Ÿ������ �����߱� ������ ���� interface���� ������ �޼ҵ���� ����� �� �ִ�..
		obj.B();
		
		obj1.A();	// obj1�ν��Ͻ��� interface I1 �� ������Ÿ������ �ν��Ͻ�ȭ �߱� ������, I1���� ������ �޼ҵ常 ����� �� �ִ�. (Ŭ������ polinter�� �������̵� �� �޼ҵ� ���)
		//obj1.B();
		
		obj2.B();	// obj2�ν��Ͻ��� interface I2 �� ������Ÿ������ �ν��Ͻ�ȭ �߱� ������, I2���� ������ �޼ҵ常 ����� �� �ִ�. (Ŭ������ polinter�� �������̵� �� �޼ҵ� ���)
		//obj2.A();
		
	}
		
		/* ������, polinter�� ����Ʈ���̴�. �� ����Ʈ���� ��� �� I1�� ��ȭ�̰� I2�� �����̶�� ���� ��, 
		 * �θ�Բ� ����Ʈ���� �帮�鼭 ������ ���� ��ȭ�� I1�� ������� �����ϰ�
		 * ����̿��� ����Ʈ���� �ָ� ������ ���� ���� I2�� ������� ������ �ؼ� 
		 * ���� ����Ʈ�������� �ٸ� ����� �ϰԲ� ����� �� �̴�.*/
		
}
