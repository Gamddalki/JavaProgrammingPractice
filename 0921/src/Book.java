/*
 * 소스파일: Book.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * 생성자 선언 및 활용 연습
 * 생성자 : 객체 생성 시 초기화를 위해 실행되는 메소드
 * - 생성자 이름은 클래스명과 동일, 리턴 타입은 없음 (출력x) : 오버로딩(이름이 동일한 생성자 여러 개 작성 가능 - 입력이 다름)
 * - 객체 생성 시 반드시 호출됨 / 미 작성 시 컴파일러가 자동으로 기본 생성자 삽입(생성자 하나라도 작성했으면 기본 생성자 자동생성을 해주지 않으므로 컴파일 오류 주의!!)
 * this() : 객체 자신에 대한 레퍼런스 (this.멤버), 객체의 멤버 변수와 메소드의 변수 이름이 동일한 경우 사용
 * - 반드시 생성자 코드의 제일 '처음'에 수행해야 함
 * 객체 치환 : 객체의 복사가 아닌 레퍼런스의 복사
 */

public class Book {
	String title;
	String author;
	
	public Book(String t) {					//생성자
		title = t;
		author = "작자미상";
	}
	
	public Book(String t, String a) {		//생성자
		title = t;
		author = a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book littlePrince = new Book("어린왕자", "생텍쥐페리");
		Book loveStory = new Book("춘향전");
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);			//출력
	}
}
