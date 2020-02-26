package Java;

class Over1{
	int a, b;
	
	public void Over1() {
		System.out.println(11);
	}
}

class Over2 extends Over1{
	public void Over2() {	//상위클래스의 Over1 메소드 실행
		super.Over1();
	}
	
	public void Over1() {	
		System.out.println(152);
	}
	//상속받은 메소드를 재정의 한다. (메소드 오버라이딩, 중복은 안됨 super사용)
	//하위 클래스에서 상의 클래스와 동일한 메소드를 정의하면 부모 클래스로부터 물려 받은 기본 동작 방법을 변경
	
	//오버라이딩을 하기 위한 조건(상위클래스와 하위클래스 두개를 의미)
	//메소드의 이름
	//메소드의 매개변수 숫자와 데이터타입, 순서
	//메소드의 리턴타입
}

public class overriding {

	public static void main(String[] args) {
		Over2 O2 = new Over2();
		O2.Over1();
		O2.Over2();
	}

}
