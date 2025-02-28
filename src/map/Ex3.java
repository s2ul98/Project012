package map;

import java.util.HashMap;

public class Ex3 {

	public static void main(String[] args) {
		
		
		// map 내부에 저장할 데이터 타입
		// key : char -> character Value : String
		// Character: char의 class 타입
		HashMap<Character, String> map = new HashMap<Character, String>();
	
		// 데이터 추가
		// 쌍으로된 데이터 추가
		// key 중복 x value 중복 o
		map.put('a', "사과");
		System.out.println(map); // 출력값 -> {a=사과} a = key / 사과 = value
		
		//데이터 조회
		//key를 입력하여 value 꺼내기
		String str = map.get('a');
		System.out.println(str);
		
		// 데이터 교체
		map.replace('a', "블루베리");
		
		// 데이터 삭제
		map.remove('a');
		System.out.println(map);
	}

}
