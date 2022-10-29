/*
 * 소스파일: DictionaryApp.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * 추상클래스의 구현과 활용 연습
 * p319 5장 10번
 */

abstract class PairMap {
	protected String keyArray[];
	protected String valueArray[];
	abstract String get(String key);
	abstract void put(String key, String value);
	abstract String delete(String key);
	abstract int length();
}

class Dictionary extends PairMap {
	protected int size;		//배열의 크기 필드
	   
	public Dictionary(int size) {				//size값을 매개변수로 받아 필드를 초기화하는 생성자
	   super.keyArray = new String[size];
	   super.valueArray = new String[size];
	   this.size=size;
	}
	
	@Override
	public String get(String key) {				//key값을 가진 value 리턴, 없으면 null 리턴
		for(int i=0; i<size; i++) {
			if(key.equals(keyArray[i]))
				return valueArray[i];
		}
		return null;
	}
	@Override
	public void put(String key, String value) {
		for(int i=0; i<size; i++) {
			if(key.equals(keyArray[i])) {
				valueArray[i] = value;		//기존에 key가 있으면 값을 value로 수정
				return;
			}
		}
		keyArray[length()] = key;
		valueArray[length()] = value;		//key와 value를 쌍으로 저장
	}
	@Override
	public String delete(String key) {
		for(int i=0; i<size; i++) {
			if(key.equals(keyArray[i])) {
				keyArray[i] = null;
				valueArray[i] = null;		//key값을 가진 아이템을 value와 함께 삭제
				return valueArray[i];		//삭제된 value값 리턴
			}
		}
		return null;
	}
	@Override
	public int length() {
		int length = 0;
		for(int i=0; i<size; i++)
			if(valueArray[i] != null)
				length++;
		return length;					//현재 저장된 아이템의 개수 리턴
	}
	
}

public class DictionaryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//전공 학번 이름 출력
		System.out.println("이화여대 컴퓨터공학전공 2071019 김한나");
		
		Dictionary dic = new Dictionary(10);
		dic.put("황기태", "자바");
		dic.put("이재문", "파이선");
		dic.put("이재문", "C++");
		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은 " + dic.get("황기태"));
	}
}
