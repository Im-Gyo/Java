// https://prashantgaurav1.files.wordpress.com/2013/12/java-util-collection.gif 참조
// 컬렉션 프레임워크는 컨테이너라고도 부르며 Collection과 Map이라는 최상위 카테고리가 있다.
// List는 중복을 허용하고 순서가 있지만, Set은 중복을 허용하지 않고 순서가 없다. *Set = 집합
package Java;

import java.util.*;

public class CollectionsFramework {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();	// 제네릭 선언, 컬렉션을 사용할 때는 가급적 해당 컬렉션을 대표하는 인터페이스를 사용하는 것이 좋다.
		al.add(1);
		al.add(2);
		al.add(3);
		for(int i=0; i<al.size(); i++) {
			int val = al.get(i);
			System.out.println(val);
		} // 이 코드는 add 메소드를 통해서 입력된 값은 Object 타입을 가지고 있고 get을 이용해서 꺼내도 Object 타입을 가지고 있다. 때문에 String으로 형변환을 해주어야한다.
		  // 하지만 형변환을 하는 것은 예전의 방식이고 이제는 제네릭을 선언해주어야한다.
		
		Iterator ai = al.iterator();
		while(ai.hasNext()) {	// 반복할 데이터가 더 있으면 true, 없으면 false
			System.out.println(ai.next());	// hasnext가 true라는 것은 next가 리턴할 데이터가 존재한다는 것
		}	// Iterator는 인터페이스 Collection에 정의되어 있다.따라서 Collection을 구현하고 있는 모든 컨테이너는 이 메소드를 구현하고 있다.
			// 메소드 iterator는 인터페이스 iterator를 구현한 객체를 리턴한다.
		
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡHashSet
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
		
		System.out.println(A.containsAll(B));	// B는 A의 부분집합이다 : false
		System.out.println(A.containsAll(C));	// C는 A의 부분집합이다 : true
		
		A.addAll(B);	// A와 B의 합집합
		A.retainAll(B);	// A와 B의 교집합		
		A.removeAll(B);	// A에서 B를 뺀 차집합
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡHashMap
		
		HashMap<String, Integer> a = new HashMap<String, Integer>();
		a.put("one", 1);	// Map에서 데이터를 추가할 때 사용하는 API는 put이다. 첫번째 인자는 값의 key이고, 두번째 인자는 key에대한 값이다. (수학 일대일 함수 구조)
		a.put("two", 2);
		a.put("three", 3);
		System.out.println(a.get("one"));
		System.out.println(a.get("two"));
		System.out.println(a.get("three"));
		
		iteratorUsingForEach(a);
		iteratorUsingIterator(a);
	}
	static void iteratorUsingForEach(HashMap map) {
		Set<Map.Entry<String, Integer>> entries = map.entrySet();	// 메소드 entrySet은 map의 데이터를 담고 있는 Set을 반환한다. 반환한 Set의 값이 사용할 데이터 타입은 Map.Entry(인터페이스)이다.
																	// Map.Entry는 getKey와 getValue API를 가지고 있다.
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