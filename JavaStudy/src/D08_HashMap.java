import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class D08_HashMap {
	/*
		# Map
		
		- 데이터를 Key/Value 방식으로 저장할 수 있는 자료구조
		- 인덱스 번호 대신 Key값을 사용해 원하는 Value를 꺼낼 수 있다.
		- Key는 중복이 허용되지 않는다. (꺼낼 때 Set으로 꺼낸다)
		- Value는 중복이 허용된다. (꺼낼 때 Collection으로 꺼낸다)
	*/
	
	public static void main(String[] args) {
		// 첫 번째 제네릭 : Key의 타입
		// 두 번째 제네릭 : Value의 타입
		HashMap<String, Object> info = new HashMap<>();

		// put(K, V)를 사용해 값을 키와 값을 짝을 지어서 넣어준다.
		info.put("이름", "임꺽정");
		info.put("나이", 30);
		info.put("군필", true);
		// 같은 Key값으로 put()하면 덮어쓰기 된다. 
		info.put("이름", "김말이");

		// get(Key) : 키를 사용해 값을 꺼낸다.
		System.out.println(info.get("나이"));
		System.out.println(info.get("이름"));
		System.out.println(info.get("군필"));

		// map.keySet() : 해당 맵에 들어있는 모든 키를 Set타입으로 꺼내온다
		Set<String> keys = info.keySet();
		
		// map.values() : 해당 맵에 들어있는 모든 값을 List타입으로 꺼내온다.
		Collection<Object> values = info.values();
		
		System.out.println("모든 키들: " + keys);
		System.out.println("모든 값들: " + values);
		
		System.out.println(info);
		
		HashMap<Integer, String> map2 = new HashMap<>();
		
		map2.put(10, "강아지");
		map2.put(0, "호랑이");
		map2.put(3, "고양이");
		
		// map.containsKey(key) : 해당 키 값이 있는지 여부를 반환
		System.out.println("키중에 10번 있나요? " + map2.containsKey(10));
		
		// map.containsValue(value) : 해당 값이 있는지 여부를 반환
		System.out.println("값중에 칠면조 있나요? " + map2.containsKey("칠면조"));
		
		System.out.println(map2);
		
		HashMap<String, Integer> scores = new HashMap<>();
		
		scores.put("김민수", 880);
		scores.put("김동우", 2395);
		
		// putifAbsent(Key, Value) : 최초 추가라면 값을 추가하고, 이미 존재하는 값이 있따면 값을 수정하지 않고 값을 꺼낸다
		Integer value = scores.putIfAbsent("김동우", 0);
		
		System.out.println("반환된 값: " + value);

		// remove(key) : 해당 키값을 삭제하고, 방금 삭제한 값을 반환한다.
		value = scores.remove("김동우");
		
		// remove(key, value) : 해당 키값을 삭제하는데 값이 일치하는 경우에만 삭제한다.
		boolean result = scores.remove("김민수", 880);
		System.out.println("삭제 여부: " + result);
		
		System.out.println(scores);
	}
	
}