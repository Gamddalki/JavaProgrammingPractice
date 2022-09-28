/*
 * 소스파일: SuperEx.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * super()를 활용한 ColorPoint 작성
 * 서브클래스/슈퍼클래스의 생성자 호출 및 실행
 * - new에 의해 서브클래스 생성 시 -> 서브클래스의 생성자 호출 -> 슈퍼클래스의 생성자 호출 -> 슈퍼클래스의 생성자 실행 -> 서브클래스의 생성자 실행
 * 서브클래스의 생성자는 슈퍼클래스의 생성자를 하나 선택함 (super(parameter); 이용)- 미선택시 슈퍼클래스의 기본생성자 자동 선택 (슈퍼클래스에 기본생성자 없을 시 오류)
 */

public class SuperEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoint cp = new ColorPoint(5,6,"blue");		//서브클래스 ColorPoint 생성 및 x=5, y=6, color="blue" 전달
		cp.showColorPoint();
	}
}
