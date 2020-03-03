package Java;

class ExceptionA {
	private int[] a = new int[3];
	ExceptionA() {
		a[0] = 0;
		a[1] = 10;
		a[2] = 20;
	}
	
	public void b(int first, int second) {
		try {	// ������ �߻��� ����Ǵ� ����, �ϳ��� try���� �������� catch���� ����� �� �ִ�.
			System.out.println(a[first] / a[second]);			
			
		}catch (ArrayIndexOutOfBoundsException e) {		// �迭�� �������� �ʴ� ���� ���������� �� ��
			System.out.println("ArrayIndexOutOfBoundsException");
			
		}catch (ArithmeticException e) {				// ������
			System.out.println("ArithmeticException");
			
		}catch (Exception e) {	//���ܰ� �߻����� �� ����Ǵ� ����(����Ŭ���� �ν��Ͻ�), ExceptionŬ������ �ٸ� ����Ŭ�������� �������̱� ������ �ٸ� ����Ŭ�������� ���ʿ� ���� �� ����.
			System.out.println("Exception");
			//System.out.println(e.getMessage());		������ ���� �⺻���� ������ ���
			//System.out.println(e.toString());			getMessage���� �ڼ��� ������ ���
			//e.printStackTrace();						toString���� �ڼ��� ������ ���
			
		}finally {	// ���ܿ��ο� ������� ����Ǵ� ����
			System.out.println("finally");
		}
	}
}

public class ExceptionDemo {

	public static void main(String[] args) {
		ExceptionA a = new ExceptionA();
		a.b(1, 0);
	}

}
