package Java;
import Java2.Package2;	//패키지2 import


//public class 안에 class를 넣었다.
public class Package1 {
		
	//static 키워드는 메모리를 공유하기 위한 키워드이다. ex) nam 인스턴스를 n1, n2로 선언 했을 때, 메모리영역이 같음
	//따라서 객체를 생성하지 않고도 바로접근해서 사용이 가능하다. (클래스 멤버)
	static class nam{
		public static void str1() {
			System.out.println("패키지1");
		}
	}
	
	public static void main(String[] args) {		
		Test T1 = new Test(1,2);
		Package2 P1 = new Package2();
		P1.getStr();
	}
	
	
	public void getStr1() {		
		nam.str1();	
		// str1메소드를 static메소드로 선언하면 인스턴스를 선언하지 않고 바로 사용할 수 있다.
		// 단, public class 안에서 static 메소드 선언 시, class도 같이 static 선언을 해주어야 한다. 
		nam n1 = new nam();
		n1.str1();
	}

}
