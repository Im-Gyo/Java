package Java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class ExA {
	void run() throws FileNotFoundException, IOException {		// 예외처리문을 다음 사용자에게 넘길 수 있다. 현재 ExA - ExB - ExceptionDemo2.main - 사용자 순으로 사용자순서가 정의되어 있다.
															 	// 지금의 경우 예외처리를 ExB에게 넘겼다.
		
		BufferedReader bReader = null;							// BufferReader와 readline은 각각 예외처리문을 해줘야하기 때문에 유효범위 내에서 정상적으로 작동할 수가 없다. 따로 지역변수를 선언해주었다.
		String input = null;
		
//		try {														자바API에서 bufferedReader에 대한 내용을 보면 이 클래스를 사용하려면 예외처리문을 강제해야 한다.
		bReader = new BufferedReader(new FileReader("out.txt"));	//BufferReader 클래스는 close()를 해줘야하는데 이 부분은 나중에..
		input = bReader.readLine();
		System.out.println(input);
//		}catch (FileNotFoundException e){							읽어올 파일이 없을 때
//			e.printStackTrace();
//		} catch (IOException e) {									입출력 오류처리
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
