/*
 * 소스파일: MethodOverloading.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * 메소드 오버로딩 (정적바인딩)
 * - 이름이 같고, 매개변수의 개수나 타입이 서로 다른 메소드들
 * - 리턴 타입은 관계 없음
 */

class MethodSample {
	public int getSum(int i, int j) {
		return i+j;
	}
	
	public int getSum(int i, int j, int k) {			//매개변수 개수가 다른 경우
		return i+j+k;
	}
	
	public double getSum(double i, double j) {			//매개변수 타입이 다른 경우
		return i+j;
	}
}

public class MethodOverloading {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodSample a = new MethodSample();
		System.out.println(a.getSum(1,2));
		System.out.println(a.getSum(1,2,3));
		System.out.println(a.getSum(2.1,1.2));
	}

}
