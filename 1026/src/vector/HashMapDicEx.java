/*
 * 소스파일: HashMapDicEx.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * 정수만 다루는 Vector<Integer> 컬렉션 활용
 */

package vector;
import java.util.*;

public class HashMapDicEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> dic = new HashMap<String, String>();
		Scanner scanner = new Scanner(System.in);
		
		dic.put("baby", "a very young child");
		dic.put("dog", "a type of animal that is often kept as a pet or trained to work for people by guarding buildings, hunting, etc.");
		dic.put("love", "a feeling of strong or constant affection for a person");
		dic.put("every", "including each person or thing in a group or series");
		dic.put("life", "the period of time when a person is alive");
		
		Set<String> key = dic.keySet();
		Iterator<String> it = key.iterator();
		while(it.hasNext()) {
			String k = it.next();
			System.out.print(k + " ");
			
		}
	
		while(true) {
			System.out.print("\n찾고 싶은 단어는?");
			String word = scanner.next();
			if(word.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
			String meaning = dic.get(word);
			if(meaning == null)
				System.out.println(word + "는 없는 단어입니다.");
			else System.out.println(meaning);
		}
		
		scanner.close();
	}
}
