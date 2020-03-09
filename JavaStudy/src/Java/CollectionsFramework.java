// https://prashantgaurav1.files.wordpress.com/2013/12/java-util-collection.gif ����
// �÷��� �����ӿ�ũ�� �����̳ʶ�� �θ��� Collection�� Map�̶�� �ֻ��� ī�װ��� �ִ�.
// List�� �ߺ��� ����ϰ� ������ ������, Set�� �ߺ��� ������� �ʰ� ������ ����. *Set = ����
package Java;

import java.util.*;

public class CollectionsFramework {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();	// ���׸� ����, �÷����� ����� ���� ������ �ش� �÷����� ��ǥ�ϴ� �������̽��� ����ϴ� ���� ����.
		al.add(1);
		al.add(2);
		al.add(3);
		for(int i=0; i<al.size(); i++) {
			int val = al.get(i);
			System.out.println(val);
		} // �� �ڵ�� add �޼ҵ带 ���ؼ� �Էµ� ���� Object Ÿ���� ������ �ְ� get�� �̿��ؼ� ������ Object Ÿ���� ������ �ִ�. ������ String���� ����ȯ�� ���־���Ѵ�.
		  // ������ ����ȯ�� �ϴ� ���� ������ ����̰� ������ ���׸��� �������־���Ѵ�.
		
		Iterator ai = al.iterator();
		while(ai.hasNext()) {	// �ݺ��� �����Ͱ� �� ������ true, ������ false
			System.out.println(ai.next());	// hasnext�� true��� ���� next�� ������ �����Ͱ� �����Ѵٴ� ��
		}	// Iterator�� �������̽� Collection�� ���ǵǾ� �ִ�.���� Collection�� �����ϰ� �ִ� ��� �����̳ʴ� �� �޼ҵ带 �����ϰ� �ִ�.
			// �޼ҵ� iterator�� �������̽� iterator�� ������ ��ü�� �����Ѵ�.
		
//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�HashSet
		HashSet<Integer> A = new HashSet<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		
		HashSet<Integer> B = new HashSet<Integer>();
		B.add(3);
		B.add(4);
		B.add(5);
		
		HashSet<Integer> C = new HashSet<Integer>();
		C.add(1);
		C.add(2);		
		
		System.out.println(A.containsAll(B));	// B�� A�� �κ������̴� : false
		System.out.println(A.containsAll(C));	// C�� A�� �κ������̴� : true
		
		A.addAll(B);	// A�� B�� ������
		A.retainAll(B);	// A�� B�� ������		
		A.removeAll(B);	// A���� B�� �� ������
//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�HashMap
		
		HashMap<String, Integer> a = new HashMap<String, Integer>();
		a.put("one", 1);	// Map���� �����͸� �߰��� �� ����ϴ� API�� put�̴�. ù��° ���ڴ� ���� key�̰�, �ι�° ���ڴ� key������ ���̴�. (���� �ϴ��� �Լ� ����)
		a.put("two", 2);
		a.put("three", 3);
		System.out.println(a.get("one"));
		System.out.println(a.get("two"));
		System.out.println(a.get("three"));
		
		iteratorUsingForEach(a);
		iteratorUsingIterator(a);
	}
	static void iteratorUsingForEach(HashMap map) {
		Set<Map.Entry<String, Integer>> entries = map.entrySet();	// �޼ҵ� entrySet�� map�� �����͸� ��� �ִ� Set�� ��ȯ�Ѵ�. ��ȯ�� Set�� ���� ����� ������ Ÿ���� Map.Entry(�������̽�)�̴�.
																	// Map.Entry�� getKey�� getValue API�� ������ �ִ�.
		for(Map.Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + entry.getValue());
		}
	}
	
	static void iteratorUsingIterator(HashMap map) {
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		Iterator<Map.Entry<String, Integer>> i = entries.iterator();
		while(i.hasNext()) {
			Map.Entry<String, Integer> entry = i.next();
			System.out.println(entry.getKey() + entry.getValue());
		}
	}
}