package Java;

enum Fruit{		//enum�� ��ǻ� class�̸� ������(������� ����)�̶�� �θ���.
				//enum�� �����ڰ� private�̱� ������ �ν��Ͻ� ������ �Ұ����ϴ�.
	APPLE("red"), BANANA("yellow"), MELON("green");		// �� ����� public static final Fruit APPLE = new Fruit(); �� ����.
	//APPLE �����ڷ� ȣ���� red�� Fruit�������� �Ű������� ����, �� �Ű������� color������ ����. this.color�� ���� Ŭ�������� color�� ���� APPLE����� ����Ǵ� Fruit�ν��Ͻ� ������ color���� red�� ����
	private String color;
	public String getColor() {	// color ������ private�̱� ������ getter�� ����
		return this.color;
	}
	Fruit(String color) {
		System.out.println("Call " + this);
		this.color = color;
	}
}

public class enumDemo {

	public static void main(String[] args) {
		Fruit type = Fruit.APPLE;
		System.out.println(type.getColor());
		System.out.println(Fruit.APPLE.getColor());

		for(Fruit f : Fruit.values()) {	//fruit�� ������ �ִ� ������ �����͵��� �迭ó�� ������ �� ����.
			System.out.println(f);
		}
	
	}

}
