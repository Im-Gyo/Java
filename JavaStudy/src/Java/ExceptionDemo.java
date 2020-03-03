package Java;

class ExceptionA {
	private int[] a = new int[3];
	ExceptionA() {
		a[0] = 0;
		a[1] = 10;
		a[2] = 20;
	}
	
	public void b(int first, int second) {
		try {	// 예외의 발생이 예상되는 로직, 하나의 try문에 여러개의 catch문을 사용할 수 있다.
			System.out.println(a[first] / a[second]);			
			
		}catch (ArrayIndexOutOfBoundsException e) {		// 배열에 존재하지 않는 값을 가져오려고 할 때
			System.out.println("ArrayIndexOutOfBoundsException");
			
		}catch (ArithmeticException e) {				// 계산오류
			System.out.println("ArithmeticException");
			
		}catch (Exception e) {	//예외가 발생했을 때 실행되는 로직(예외클래스 인스턴스), Exception클래스는 다른 예외클래스보다 포괄적이기 때문에 다른 예외클래스보다 위쪽에 있을 수 없다.
			System.out.println("Exception");
			//System.out.println(e.getMessage());		오류에 대한 기본적인 내용을 출력
			//System.out.println(e.toString());			getMessage보다 자세한 내용을 출력
			//e.printStackTrace();						toString보다 자세한 내용을 출력
			
		}finally {	// 예외여부에 관계없이 실행되는 로직
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
