package Java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class ExA {
	void run() throws FileNotFoundException, IOException {		// ����ó������ ���� ����ڿ��� �ѱ� �� �ִ�. ���� ExA - ExB - ExceptionDemo2.main - ����� ������ ����ڼ����� ���ǵǾ� �ִ�.
															 	// ������ ��� ����ó���� ExB���� �Ѱ��.
		
		BufferedReader bReader = null;							// BufferReader�� readline�� ���� ����ó������ ������ϱ� ������ ��ȿ���� ������ ���������� �۵��� ���� ����. ���� ���������� �������־���.
		String input = null;
		
//		try {														�ڹ�API���� bufferedReader�� ���� ������ ���� �� Ŭ������ ����Ϸ��� ����ó������ �����ؾ� �Ѵ�.
		bReader = new BufferedReader(new FileReader("out.txt"));	//BufferReader Ŭ������ close()�� ������ϴµ� �� �κ��� ���߿�..
		input = bReader.readLine();
		System.out.println(input);
//		}catch (FileNotFoundException e){							�о�� ������ ���� ��
//			e.printStackTrace();
//		} catch (IOException e) {									����� ����ó��
//			e.printStackTrace();
//		}
	}
}


class ExB {
	void run() throws FileNotFoundException, IOException {
		ExA b = new ExA();
		b.run();
	}
}

public class ExceptionDemo2 {

	public static void main(String[] args) {
		ExB c = new ExB();
		try {
			c.run();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
