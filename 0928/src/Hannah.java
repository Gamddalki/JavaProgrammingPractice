/*
 * 소스파일: Hannah.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * 상속 관계에 있는 클래스 간 멤버 접근
 * - 슈퍼 클래스 Person을 상속 받은 서브 클래스 Hannah
 */

class Hannah extends Person {
	public void set() {
		age = 22;
		name = "김한나";
		height = 161;
		//weight = 50;	protected int weight;은 슈퍼클래스의 private이므로 접근 불가
		setWeight(50);	//메소드를 통해서만 조작이 가능함
	}
}