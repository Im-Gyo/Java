package Java2;
import Java.Package1;	//��Ű��1 import
// ���� ���� �ٸ� ��Ű���� ������ �̸��� Ŭ���� ������ �����Ѵٸ�,
// �ν��Ͻ��� ������ �� Ŭ������ ��θ� ���ָ� �ȴ�.
// ex) Java.overloading Over = new Java.overloading();


//public class �ۿ� class�� �־���.
class packagedemo {
	public static void str() {
		System.out.println("��Ű��2");
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
