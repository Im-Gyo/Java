package Java;

import java.io.IOException;

class myException extends RuntimeException {	// 사용자 정의 Exception이다. 상속을 RuntimeException으로 받아서 예외처리를 강제하지 않아도 된다.
	myException() {		// 생성자
		super();
	}
	
	myException(String message){	// 생성자 오버로딩
		super(message);
	}
}

class E {
	void throwArithException() {	// ArithmetiException의 API 문서를 보면 부모 클래스 중에 Exception 클래스가 있다.
									// ArithmetiException은 부모 클래스가 RuntimeException이다.
									// checked 예외 : RuntimeException을 제외한 Exception의 하위 클래스        - 반드시 예외처리를 해야하는 것(IOException)
									// unchecked 예외 : RuntimeException의 하위 클래스                                - 예외처리를 해도되고 안해도되는 것(ArithmetiException)
		throw new ArithmeticException();
	}
	
	void throwIOException() {		// IOException은 상위클래스가 Exception이기 때문에 예외처리를 강제해야한다.
		try { 
			throw new IOException();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	void throwIOException2() throws IOException { // IOException은 상위클래스가 Exception이기 때문에 예외처리를 강제해야한다.(해당 메소드는 throws의 경우)
		throw new IOException();
	}
}

class calculator {
	int left, right;
	public void set(int left, int right) {
		if(this.right == 0) {
			throw new IllegalArgumentException("두번째 인자의 값은 0이 될 수 없음");	// throw : 예외를 발생 시킨다. 뒤에는 예외 정보를 가지고 있는 클래스가 위치한다.
		}
		this.left = left;
		this.right = right;
	}
}

public class ExceptionDemo3 {
	
	public static void main(String[] args) {
		
	}
}
