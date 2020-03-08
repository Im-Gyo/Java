package Java;

interface Info2{
	int getLevel2();
}

abstract class Info{
	public abstract int getLevel();
}

class Person<T, S /*extends Info*/> {	// T라는 데이터타입은 존재하지 않는다, 인스턴스를 생성할 때 데이터 타입을 지정받아 필드의 데이터 타입을 지정한다.
										// 복수의 제네릭도 사용이 가능하다.
										// 제네릭으로 올 수 있는 데이터 타입을 특정 클래스의 자식으로 제한할 수 있다.
										// class Person<T extends Info> 즉 Person의 T는 info 클래스나 그 자식 외에는 올 수 없다.
	public T info;		
	public S id;
	Person(T info, S id){
		this.info = info;
		this.id = id;
	}
	
	public <U> void PrinfInfo(U info) {		// 제네릭은 메소드에 적용할 수도 있다.
		System.out.println(info);
	}
	
}

class StudentInfo implements Info2{		// extends는 상속 뿐 아니라 interface관계에서도 사용할 수 있다.
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
		Integer i = new Integer(10);			// 제네릭은 참조 데이터 타입에 대해서만 사용이 가능하다. new Integer는 기본 데이터 타입인 int를 참초 데이터 타입으로 변환해준다. 이런 클래스를 래퍼(wrapper) 클래스 라고 한다.
		Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(e, i);
		Person p2 = new Person(e, i); // 위의 코드와 동일하게 동작한다. 이유는 e와 i의 데이터 타입을 자바가 알고 있기 때문이다.
		System.out.println(p1.id.intValue());
		
		/*Person<StudentInfo> p2 = new Person<String>("부장");
		String ei2 = p2.info;
		System.out.println(ei2.rank);*/  // p2.info가 String이고 String은 rank필드가 없기 때문에 컴파일에 실패한다.
	}
}