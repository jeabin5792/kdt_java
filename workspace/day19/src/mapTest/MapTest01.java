package mapTest;

import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;
import java.util.HashMap;

//1번 : hashMap
public class MapTest01 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println(al.toString());
		al.add(1);
		al.add(2);
		al.add(3);
		System.out.println(al); //[ , , ]
		System.out.println(al.get(1)); //인덱스를 알아랴 해당하는 값을 출력할 수 있다
		
		
		HashMap<String, Integer> map = new HashMap<>();
		System.out.println(map.toString());
		map.put("a",1);
		map.put("b",2);
		map.put("c",3);
		System.out.println(map); //{key = value}
		System.out.println(map.get("b")); //인덱스를 몰라도 key값으로 해당 value를 출력할 수 있다
		
		map.put("a", 10);
		System.out.println(map);
		map.put("d", 4);
		System.out.println(map);
		
		//put(key, value) 추가
		//get(key) 해당 key value 값 반환
		//size() 해당 요소의 길이 반환
		//keySet()
		//values()
		
		System.out.println(map.keySet()); //반환타입 set 인터페이스
		System.out.println(map.values()); //반환타입 Collection 인터페이스
		
		
		
		
		
	}
}
