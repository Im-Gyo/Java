package Java;

abstract class Demo {
	int a,b;
	public void val(int a, int b) {	// ���� ����
		this.a = a;
		this.b = b;
	}
	
	abstract public int sum();	// �߻�޼ҵ�
	abstract public int avg();	// �߻�޼ҵ�
	
	public void run() {		// ������� �����Ű�� �޼ҵ�� �߻�޼ҵ带 �����Ų��.
		sum();
		avg();
	}	
}

class plus extends Demo {
	
	// �θ�Ŭ���� Demo���� ������ �߻�޼ҵ���� �������̵� �ϰ� �ִ�.
	@Override
	public int sum() {
		System.out.println("+" + (this.a + this.b));
		return 0;
	}

	@Override
	public int avg() {
		System.out.println("+" + (this.a + this.b)/2);
		return 0;
	}
}

class minus extends Demo {

	@Override
	public int sum() {
		System.out.println("-" + (this.a + this.b));
		return 0;
	}

	@Override
	public int avg() {
		System.out.println("-" + (this.a + this.b)/2);
		return 0;
	}
	
}

public class Polymorphism2 {
	// ������Ÿ���� Demo�� ��ü�� �Ű������� �޴� exe�޼ҵ�, Demo Ŭ������ run()�޼ҵ带 �����Ų��.
	public static void exe(Demo val) {
		System.out.println("���");
		val.run();
	}

	public static void main(String[] args) {
		Demo obj1 = new plus();		// ��ӹ��� �θ�Ŭ������ ������Ÿ������ �ν��Ͻ�ȭ ���״�.
		Demo obj2 = new minus();	// ��ӹ��� �θ�Ŭ������ ������Ÿ������ �ν��Ͻ�ȭ ���״�.
		obj1.val(1, 2);		// �θ�Ŭ������ ��ӹ��� �ν��Ͻ� �̱� ������ DemoŬ������ val�޼ҵ带 ����ߴ�.
		obj2.val(3, 4);
		
		exe(obj1);	// Demo�� ������Ÿ������ �ϴ� �Ű�����(��ü)�� ������ obj�ν��Ͻ��� ������ DemoŬ������ �ִ� run()�޼ҵ带 ������״�.
		exe(obj2);	// �ᱹ, obj1,2 ������ plus, minus Ŭ������ ������ ������, ������ Ÿ���� Demo�̱� ������ 
					// DemoŬ���� �༼�� �ϴ� ���̰�, DemoŬ�������� ���ǵ� �޼ҵ���� ����� ����������, ���ǰ� �ȵ� �޼ҵ���� ����Ŭ�������� ���Ǹ� �ߴ��� ����� �Ұ����ϴ�.
					// ������, Demo���� �̹� ���ǵ� �޼ҵ���� �޼ҵ� ��ü�� ���ǰ� �Ǿ��ֱ� ������, ���� Ŭ�������� �������̵��ؼ� ����� �����ϴ�.
					// ���� �̷��� �Ѱ��� Ŭ������ �ٸ� ����� �� �� �ִ� �������� ���ٸ�, ���� exe�޼ҵ��� ������ Ÿ���� ������ ������ Ÿ������ ���� ������ ���־�� �� �� �̴�. (ex : plus val, minus val)
					// Demo�� ������ Ÿ������ ���� �Ű����� val�� DemoŬ������ �� �ڽ�Ŭ������ run()�޼ҵ尡 �ִٴ� ���� ����޴´�.
		
	}

}
