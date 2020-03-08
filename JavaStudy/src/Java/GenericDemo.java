package Java;

interface Info2{
	int getLevel2();
}

abstract class Info{
	public abstract int getLevel();
}

class Person<T, S /*extends Info*/> {	// T��� ������Ÿ���� �������� �ʴ´�, �ν��Ͻ��� ������ �� ������ Ÿ���� �����޾� �ʵ��� ������ Ÿ���� �����Ѵ�.
										// ������ ���׸��� ����� �����ϴ�.
										// ���׸����� �� �� �ִ� ������ Ÿ���� Ư�� Ŭ������ �ڽ����� ������ �� �ִ�.
										// class Person<T extends Info> �� Person�� T�� info Ŭ������ �� �ڽ� �ܿ��� �� �� ����.
	public T info;		
	public S id;
	Person(T info, S id){
		this.info = info;
		this.id = id;
	}
	
	public <U> void PrinfInfo(U info) {		// ���׸��� �޼ҵ忡 ������ ���� �ִ�.
		System.out.println(info);
	}
	
}

class StudentInfo implements Info2{		// extends�� ��� �� �ƴ϶� interface���迡���� ����� �� �ִ�.
	public int grade;
	StudentInfo(int grade){
		this.grade = grade;
	}
	public int getLevel2() {
		return this.grade;
	}
}

class EmployeeInfo extends Info {
	public int rank;
	EmployeeInfo(int rank){
		this.rank = rank;
	}
	public int getLevel() {
		return this.rank;
	}
}

public class GenericDemo {

	public static void main(String[] args) {
		EmployeeInfo e = new EmployeeInfo(1);
		Integer i = new Integer(10);			// ���׸��� ���� ������ Ÿ�Կ� ���ؼ��� ����� �����ϴ�. new Integer�� �⺻ ������ Ÿ���� int�� ���� ������ Ÿ������ ��ȯ���ش�. �̷� Ŭ������ ����(wrapper) Ŭ���� ��� �Ѵ�.
		Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(e, i);
		Person p2 = new Person(e, i); // ���� �ڵ�� �����ϰ� �����Ѵ�. ������ e�� i�� ������ Ÿ���� �ڹٰ� �˰� �ֱ� �����̴�.
		System.out.println(p1.id.intValue());
		
		/*Person<StudentInfo> p2 = new Person<String>("����");
		String ei2 = p2.info;
		System.out.println(ei2.rank);*/  // p2.info�� String�̰� String�� rank�ʵ尡 ���� ������ �����Ͽ� �����Ѵ�.
	}
}