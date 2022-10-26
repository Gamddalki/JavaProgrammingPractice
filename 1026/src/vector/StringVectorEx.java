/*
 * 소스파일: StringVectorEx.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * 문자열 입력받아 Vector<String>에 저장해 길이 비교 후 출력
 */

package vector;
import java.util.*;

public class StringVectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<String>();		//문자열만 삽입 가능한 제네릭 벡터 생성
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<4; i++) {
			System.out.print("이름을 입력하세요>>");
			String s = scanner.nextLine();	//띄어쓰기 포함해 입력받기
			v.add(s);			//키보드로부터 4개의 이름을 입력받아 요소로 삽입
		}
		
		//가장 긴 이름 찾기
		int longestIndex = 0;
		for(int i=1; i<v.size(); i++) {
			if(v.get(longestIndex).length()<v.get(i).length())
				longestIndex=i;
		}
		
		//가장 짧은 이름 찾기
		int shortestIndex = 0;
		for(int i=1; i<v.size(); i++) {
			if(v.get(shortestIndex).length()>v.get(i).length())
				shortestIndex=i;
		}
		
		//가장 긴 이름과 가장 짧은 이름 출력
		System.out.println("\n\n가장 긴 이름은 : " + v.get(longestIndex));
		System.out.println("가장 짧은 이름은 : " + v.get(shortestIndex));
		
		//모든 이름 출력
		/*for(int i=0; i<v.size(); i++) {
			String name = v.get(i);
			System.out.print(name + " ");
		}*/
		Iterator<String> it = v.iterator();		//iterator를 이용해 모든 이름 출력하기
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		
	}

}
