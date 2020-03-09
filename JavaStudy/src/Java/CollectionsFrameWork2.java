package Java;

import java.util.*;

class Computer implements Comparable{
	int serial;
	String owner;
	
	public Computer(int serial, String owner) {		
		this.serial = serial;
		this.owner = owner;
	}
	
	public String toString() {
		return serial + owner;
	}
	
	@Override
	public int compareTo(Object o) {	// A가 B(인자)보다 크면 양수, 같으면 0 , 작으면 음수 반환
		return this.serial - ((Computer)o).serial;
	}
}

public class CollectionsFrameWork2 {

	public static void main(String[] args) {
		List<Computer> computers = new ArrayList<Computer>();
		computers.add(new Computer(500, "egoing"));
		computers.add(new Computer(200, "Hello"));
		computers.add(new Computer(300, "World"));
		Iterator i = computers.iterator();
		Collections.sort(computers);	// 클래스 Collections는 다양한 클래스 메소드들을 가지고 있고 sort는 그 중 하나로 List의 정렬을 수행한다.
		// public static <T extends Comparable<? super T>> void sort(List<T> list)
		// sort의 시그니처인데, 인자인 list는 데이터 타입이 List이다. 즉 sort메소드는 List형식의 컬렉션을 지원한다.
		// 인자 list의 제네릭<T>는 Comparable을 extends 하고 있어야 한다. Comparable은 인터페이스이고 compareTo() 메소드를 가지고 있어야 한다.
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
