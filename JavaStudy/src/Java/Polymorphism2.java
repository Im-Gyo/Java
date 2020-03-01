package Java;

abstract class Demo {
	int a,b;
	public void val(int a, int b) {	// 값을 받음
		this.a = a;
		this.b = b;
	}
	
	abstract public int sum();	// 추상메소드
	abstract public int avg();	// 추상메소드
	
	public void run() {		// 결과값을 실행시키는 메소드로 추상메소드를 실행시킨다.
		sum();
		avg();
	}	
}

class plus extends Demo {
	
	// 부모클래스 Demo에서 선언한 추상메소드들을 오버라이드 하고 있다.
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
	// 데이터타입이 Demo인 객체를 매개변수로 받는 exe메소드, Demo 클래스의 run()메소드를 실행시킨다.
	public static void exe(Demo val) {
		System.out.println("결과");
		val.run();
	}

	public static void main(String[] args) {
		Demo obj1 = new plus();		// 상속받은 부모클래스를 데이터타입으로 인스턴스화 시켰다.
		Demo obj2 = new minus();	// 상속받은 부모클래스를 데이터타입으로 인스턴스화 시켰다.
		obj1.val(1, 2);		// 부모클래스를 상속받은 인스턴스 이기 때문에 Demo클래스의 val메소드를 사용했다.
		obj2.val(3, 4);
		
		exe(obj1);	// Demo를 데이터타입으로 하는 매개변수(객체)에 선언한 obj인스턴스를 전달해 Demo클래스에 있는 run()메소드를 실행시켰다.
		exe(obj2);	// 결국, obj1,2 각각은 plus, minus 클래스로 선언이 됐지만, 데이터 타입은 Demo이기 때문에 
					// Demo클래스 행세를 하는 것이고, Demo클래스에서 정의된 메소드들은 사용이 가능하지만, 정의가 안된 메소드들은 하위클래스에서 정의를 했더라도 사용이 불가능하다.
					// 하지만, Demo에서 이미 정의된 메소드들은 메소드 자체는 정의가 되어있기 때문에, 하위 클래스에서 오버라이드해서 사용이 가능하다.
					// 만약 이렇게 한가지 클래스로 다른 기능을 할 수 있는 다형성이 없다면, 위의 exe메소드의 데이터 타입은 각각의 데이터 타입으로 따로 선언을 해주어야 할 것 이다. (ex : plus val, minus val)
					// Demo를 데이터 타입으로 갖는 매개변수 val은 Demo클래스나 그 자식클래스는 run()메소드가 있다는 것을 보장받는다.
		
	}

}
