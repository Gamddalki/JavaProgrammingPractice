/*
 * 소스파일: HashMapDicEx.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * HashMap을 이용하여 영단어 쌍의 저장 검색
 * 
 * HashMap<K,V> : 키와 값의 쌍으로 구성되는 요소를 다루는 컬렉션
 * - Vector 는 순차 탐색만 가능함
 * - HashMap 은 빠른 삽입, 삭제, 검색이 가능함 / hash 라는 말 자체가 바로 찾을 수 있다는 의미(알고리즘은 공개되어있지 않은 바이트코드)
 */

package vector;
import java.util.*;

public class HashMapDicEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> dic = new HashMap<String, String>();		//단어쌍을 저장하는 HashMap 컬렉션 생성
		Scanner scanner = new Scanner(System.in);
		
		dic.put("baby", "a very young child");
		dic.put("dog", "a type of animal that is often kept as a pet or trained to work for people by guarding buildings, hunting, etc.");
		dic.put("love", "a feeling of strong or constant affection for a person");
		dic.put("every", "including each person or thing in a group or series");
		dic.put("life", "the period of time when a person is alive");		//5개의 쌍을 dic에 저장
		
		Set<String> key = dic.keySet();
		Iterator<String> it = key.iterator();
		while(it.hasNext()) {
			String k = it.next();
			System.out.print(k + " ");
			
		}
	
		while(true) {
			System.out.print("\n찾고 싶은 단어는?");
			String word = scanner.next();
			if(word.equals("exit")) {			//exit 입력 시 종료
				System.out.println("종료합니다...");
				break;
			}
			String meaning = dic.get(word);		//단어를 입력받아 뜻 출력
			if(meaning == null)
				System.out.println(word + "는 없는 단어입니다.");		//없을 경우 없습니다 출력
			else System.out.println(meaning);
		}
		
		scanner.close();
	}
}
