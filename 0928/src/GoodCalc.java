/*
 * 소스파일: GoodCalc.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * 추상클래스의 구현 연습
 * 추상메소드 : 선언되어 있으나 구현되어 있지 않은 메소드 - abstract로 선언
 * - 서브클래스에서 오버라이딩하여 구현해야 함
 * 추상클래스 : 설계와 구현의 분리 (슈퍼클래스에서 개념정의, 서브클래서에서 행위 구현), 계층적 상속 관계를 갖는 클래스 구조를 만드는 경우 사용
 * - 1. 추상메소드를 하나라도 가진 클래스 (클래스 앞에 반드시 abstract라 선언)
 * - 2. 추상메소드가 하나도 없지만 abstract로 선언된 클래스
 * - 상속 : 1. 단순 상속 (추상클래스 구현x) - 서브클래스도 abstract로 선언해야 함
 * 		  2. 구현 상속 - 오버라이딩을 통해 추상메소드 구현, 이 경우 서브클래스는 추상클래스 아님
 */

public class GoodCalc extends Calculator{
	@Override							//오버라이드 annotation 사용 시 : 많은 메소드 중에서 어떠한 메소드가 부모 클래스로부터 오버라이딩이 되었는지 쉽게 파악 가능
	public int add(int a, int b) {
		return a+b;
	}
	@Override
	public int sub(int a, int b) {
		return a-b;
	}
	@Override
	public double ave(int []a) {
		double sum = 0;
		for(int i=0; i<a.length; i++)
			sum+=a[i];
		return sum/a.length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.sub(2, 3));
		System.out.println(c.ave(new int[] {2,3,4}));
	}

}
