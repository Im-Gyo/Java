package Java;


class AC {
	public void AC1() {
		AC2();	//같은 클래스이기 떄문에 AC2 접근 가능.
	}
	
	private void AC2() {
		System.out.println("private");
	}
}

public class AccessModifier { 	// 접근제어자가 public인 클래스는 다른 패키지의 클래스에서도 사용할 수 있고, default인 경우는 같은 패키지에서만 사용 가능.
								//public 클래스는 클래스명과 소스코드의 파일명이 같아야한다.

	public static void main(String[] args) {
		AC ac = new AC();
		ac.AC1(); // 접근제어자가 public으로 선언했기 때문에 다른 클래스에서 접근할 수 있다.
		//ac.AC2(); 접근제어자가 private로 선언했기 때문에 다른 클래스에서 접근할 수 없다.
	}
}
