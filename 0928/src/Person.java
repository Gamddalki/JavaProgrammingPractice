/*
 * 소스파일: Person.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * 상속 관계에 있는 클래스 간 멤버 접근
 * - 슈퍼클래스 Person
 */

class Person {
	private int weight;		//private 멤버: 다른 모든 클래스의 접근 "불허"
	int age;				//디폴트 멤버: 패키지 "내" 모든 클래스의 접근 허용
	protected int height;	//protected 멤버: 같은 패키지 "내" 모든 클래스의 접근 허용, 다른 패키지에 있어도 "서브클래스"는 접근 가능
	public String name;		//public 멤버 : 다른 모든 클래스의 접근 "허용"
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
}