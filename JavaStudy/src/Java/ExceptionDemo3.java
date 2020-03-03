package Java;

import java.io.IOException;

class myException extends RuntimeException {	// ����� ���� Exception�̴�. ����� RuntimeException���� �޾Ƽ� ����ó���� �������� �ʾƵ� �ȴ�.
	myException() {		// ������
		super();
	}
	
	myException(String message){	// ������ �����ε�
		super(message);
	}
}

class E {
	void throwArithException() {	// ArithmetiException�� API ������ ���� �θ� Ŭ���� �߿� Exception Ŭ������ �ִ�.
									// ArithmetiException�� �θ� Ŭ������ RuntimeException�̴�.
									// checked ���� : RuntimeException�� ������ Exception�� ���� Ŭ����        - �ݵ�� ����ó���� �ؾ��ϴ� ��(IOException)
									// unchecked ���� : RuntimeException�� ���� Ŭ����                                - ����ó���� �ص��ǰ� ���ص��Ǵ� ��(ArithmetiException)
		throw new ArithmeticException();
	}
	
	void throwIOException() {		// IOException�� ����Ŭ������ Exception�̱� ������ ����ó���� �����ؾ��Ѵ�.
		try { 
			throw new IOException();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	void throwIOException2() throws IOException { // IOException�� ����Ŭ������ Exception�̱� ������ ����ó���� �����ؾ��Ѵ�.(�ش� �޼ҵ�� throws�� ���)
		throw new IOException();
	}
}

class calculator {
	int left, right;
	public void set(int left, int right) {
		if(this.right == 0) {
			throw new IllegalArgumentException("�ι�° ������ ���� 0�� �� �� ����");	// throw : ���ܸ� �߻� ��Ų��. �ڿ��� ���� ������ ������ �ִ� Ŭ������ ��ġ�Ѵ�.
		}
		this.left = left;
		this.right = right;
	}
}

public class ExceptionDemo3 {
	
	public static void main(String[] args) {
		
	}
}
