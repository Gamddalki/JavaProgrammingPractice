/*
 * 소스파일: InstanceOfEx.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * instanceOf 연산자 활용
 * 업캐스팅 : 서브클래스 객체를 슈퍼클래스 타입으로 변환 -> 객체 내 슈퍼클래스 멤버에만 접근 가능
 * - instanceof : 레퍼런스가 가리키는 객체의 타입 식별을 위해 사용
 * - 슈퍼클래스는 여러 서브클래스에 상속되기 때문에 업캐스팅된 레퍼런스로 객체의 타입을 판단하기 어려움 
 * 다운캐스팅 : 슈퍼클래스 객체를 서브클래스 타입으로 변환 (개발자의 명시적 타입 변환 필요)
 */

class Job{}
class Student extends Job {}
class Singer extends Job {}
class Professor extends Job {}

public class InstanceOfEx {
	static void print(Job j) {
		if(j instanceof Job)
			System.out.print("Job ");
		if(j instanceof Student)
			System.out.print("Student ");
		if(j instanceof Singer)
			System.out.print("Singer ");
		if(j instanceof Professor)
			System.out.print("Professor ");
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("new Student() -> \t");
		print(new Student());
		System.out.print("new Singer() -> \t");
		print(new Singer());
		System.out.print("new Professor() -> \t");
		print(new Professor());
	}

}
