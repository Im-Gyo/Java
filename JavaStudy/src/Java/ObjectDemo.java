package Java;

class student {
	String name;
	student(String name){
		this.name = name;
	}
	
	public boolean equals(Object obj) {		// stu�� stu1�� ������ ���� �ٸ� ��ü�� �νĵȴ�. ������ �� ���� ��ü�� �������δ� ���� ���� ������ �ֱ� ������ 
											// equals �޼ҵ带 �������̵��ؼ� ���� ������ �ν��ϰ� �������.
											// �Ķ���� ������Ÿ���� Object�� �� ������ String�� �ƴ� ������ Ÿ���� �޾� �����󿡼� ����ȯ�� �ؼ� ���Ϸ��� �߱� �����̴�.
		student _obj = (student)obj;
		return name == _obj.name;
	}
}

class Ob extends Object { 	// ��� Ŭ������ Object�� �Ͻ������� ��ӹް� �ִ�. (��� Ŭ������ ����)
	int a,b;
	public Ob(int a, int b) {
		this.a = a;
		this.b = b;
	}	
	
	public String toString() {		// �ν��Ͻ��� a,b���� �˱� ���� toString �޼ҵ带 �������̵� �ߴ�.
									// ���� toString() �޼ҵ�� ��ü�� ���ڷ� ǥ���ϴ� �޼ҵ��̴�.
		return "Left : " + a + "right : " + b;
		
	}
	
}

public class ObjectDemo {

	public static void main(String[] args) {
		Ob O1 = new Ob(1,2);
		System.out.println(O1);			// �ڹٴ� toString�� ���� ȣ������ �ʾƵ� sysout���� ��ü�� ȣ���ϸ� �ڵ����� toString�� ȣ��ǵ��� ��ӵǾ� �ִ�.
		System.out.println(O1.toString());
		
		student stu = new student("ego");
		student stu1 = new student("ego");
		System.out.println(stu == stu1);
		System.out.println(stu.equals(stu1));
	}

}
