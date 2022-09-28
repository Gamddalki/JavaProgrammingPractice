/*
 * 소스파일: InheritanceEx.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * 상속 관계에 있는 클래스 간 멤버 접근
 * - 부모 클래스 : 슈퍼 클래스 / 자식 클래스 : 서브 클래스
 * - extends 키워드 사용
 * - 다중 상속은 지원하지 않음 but 상속 횟수는 무제한
 */

public class InheritanceEx {								//main 메소드를 포함하는 클래스는 무조건 public이어야 함
	public static void main(String[] args) {
		Hannah h = new Hannah();
		h.set();					//각 멤버 필드에 값을 저장
		
		System.out.println("나이는 " + h.age);
		System.out.println("이름은 " + h.name);
		System.out.println("키는 " + h.height);
		System.out.println("몸무게는 " + h.getWeight());		//슈퍼클래스의 private 필드는 메소드를 통해서만 조작 가능
	}
}