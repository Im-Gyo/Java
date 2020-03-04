package Java;

class student {
	String name;
	student(String name){
		this.name = name;
	}
	
	public boolean equals(Object obj) {		// stu와 stu1은 원래는 서로 다른 객체로 인식된다. 하지만 두 개의 객체가 논리적으로는 같은 값을 가지고 있기 때문에 
											// equals 메소드를 오버라이딩해서 같은 값으로 인식하게 만들었다.
											// 파라미터 데이터타입을 Object로 한 이유는 String이 아닌 데이터 타입을 받아 로직상에서 형변환을 해서 비교하려고 했기 때문이다.
		student _obj = (student)obj;
		return name == _obj.name;
	}
}

class Ob extends Object { 	// 모든 클래스는 Object를 암시적으로 상속받고 있다. (모든 클래스의 조상)
	int a,b;
	public Ob(int a, int b) {
		this.a = a;
		this.b = b;
	}	
	
	public String toString() {		// 인스턴스에 a,b값을 알기 위해 toString 메소드를 오버라이딩 했다.
									// 원래 toString() 메소드는 객체를 문자로 표현하는 메소드이다.
		return "Left : " + a + "right : " + b;
		
	}
	
}

public class ObjectDemo {

	public static void main(String[] args) {
		Ob O1 = new Ob(1,2);
		System.out.println(O1);			// 자바는 toString을 직접 호출하지 않아도 sysout으로 객체를 호출하면 자동으로 toString이 호출되도록 약속되어 있다.
		System.out.println(O1.toString());
		
		student stu = new student("ego");
		student stu1 = new student("ego");
		System.out.println(stu == stu1);
		System.out.println(stu.equals(stu1));
	}

}
