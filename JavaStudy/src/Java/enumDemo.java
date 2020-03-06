package Java;

enum Fruit{		//enum은 사실상 class이며 열거형(상수들의 집합)이라고 부른다.
				//enum은 생성자가 private이기 때문에 인스턴스 생성이 불가능하다.
	APPLE("red"), BANANA("yellow"), MELON("green");		// 각 상수는 public static final Fruit APPLE = new Fruit(); 와 같다.
	//APPLE 생성자로 호출한 red를 Fruit생성자의 매개변수로 들어가고, 그 매개변수는 color변수에 들어간다. this.color의 값은 클래스변수 color로 들어가며 APPLE상수에 저장되는 Fruit인스턴스 변수인 color값이 red로 저장
	private String color;
	public String getColor() {	// color 변수가 private이기 때문에 getter로 선언
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

		for(Fruit f : Fruit.values()) {	//fruit이 가지고 있는 각각의 데이터들을 배열처럼 가져올 수 있음.
			System.out.println(f);
		}
	
	}

}
