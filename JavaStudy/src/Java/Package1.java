package Java;
import Java2.Package2;	//��Ű��2 import


//public class �ȿ� class�� �־���.
public class Package1 {
		
	//static Ű����� �޸𸮸� �����ϱ� ���� Ű�����̴�. ex) nam �ν��Ͻ��� n1, n2�� ���� ���� ��, �޸𸮿����� ����
	//���� ��ü�� �������� �ʰ� �ٷ������ؼ� ����� �����ϴ�. (Ŭ���� ���)
	static class nam{
		public static void str1() {
			System.out.println("��Ű��1");
		}
	}
	
	public static void main(String[] args) {		
		Test T1 = new Test(1,2);
		Package2 P1 = new Package2();
		P1.getStr();
	}
	
	
	public void getStr1() {		
		nam.str1();	
		// str1�޼ҵ带 static�޼ҵ�� �����ϸ� �ν��Ͻ��� �������� �ʰ� �ٷ� ����� �� �ִ�.
		// ��, public class �ȿ��� static �޼ҵ� ���� ��, class�� ���� static ������ ���־�� �Ѵ�. 
		nam n1 = new nam();
		n1.str1();
	}

}
