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
	public int compareTo(Object o) {	// A�� B(����)���� ũ�� ���, ������ 0 , ������ ���� ��ȯ
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
		Collections.sort(computers);	// Ŭ���� Collections�� �پ��� Ŭ���� �޼ҵ���� ������ �ְ� sort�� �� �� �ϳ��� List�� ������ �����Ѵ�.
		// public static <T extends Comparable<? super T>> void sort(List<T> list)
		// sort�� �ñ״�ó�ε�, ������ list�� ������ Ÿ���� List�̴�. �� sort�޼ҵ�� List������ �÷����� �����Ѵ�.
		// ���� list�� ���׸�<T>�� Comparable�� extends �ϰ� �־�� �Ѵ�. Comparable�� �������̽��̰� compareTo() �޼ҵ带 ������ �־�� �Ѵ�.
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
