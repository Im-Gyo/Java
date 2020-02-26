package Java2;
import Java.Package1;	//패키지1 import
// 만약 같은 다른 패키지에 동일한 이름의 클래스 파일이 존재한다면,
// 인스턴스를 선언할 때 클래스의 경로를 써주면 된다.
// ex) Java.overloading Over = new Java.overloading();


//public class 밖에 class를 넣었다.
class packagedemo {
	public static void str() {
		System.out.println("패키지2");
	}
}

public class Package2 {

	
	public void getStr() {
		packagedemo.str();
	}
	
	
	public static void main(String[] args) {
		Package1 P1 = new Package1();
		P1.getStr1();
	}

	
}
