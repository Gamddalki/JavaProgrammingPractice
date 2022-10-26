/*
 * 소스파일: VectorEx.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * 정수만 다루는 Vector<Integer> 컬렉션 활용
 * 
 * 클래스가 인터페이스 reuse : implement
 * 인터페이스가 클래스 reuse는 불가능
 * 클래스가 클래스 reuse : extends
 * 인터페이스가 인터페이스 reuse 가능
 * - 둘다 첫글자 대문자
 * 
 * <E> : element
 * <K> : key
 * <V> : value
 * 
 * -> object가 여러개 모여있다 = 컬렉션
 * 클래스의 집합 : 패키지
 * 패키지와 리소스의 집합 : 모듈
 * 
 * + java.lang은 기본적으로 import 되어있음
 */

package vector;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();		//정수 값만 다루는 제네릭 벡터 생성, ()디폴트로 10개 생성됨
		//double로 바꾸는 경우 : Vector<Double> v = new Vector<Double>();
		
		v.add(5);	//요소 삽입 (인덱스는 0부터 시작)
		v.add(4);	//
		v.add(-1);	//Vector<Double>인 경우 여기 숫자들도 실수로
		
		//벡터 중간에 요소 삽입
		v.add(2, 100);		//여기도 실수로
		
		System.out.println("벡터 내의 요소 객체 수 : " + v.size());
		System.out.println("벡터의 현재 용량 : " + v.capacity());
		
		//모든 요소 출력 하기
		for(int i=0; i<v.size();i++) {
			int n = v.get(i);		//Vector<Double>인 경우 여기도 double
			System.out.println(n);
		}
		
		//벡터 속의 모든 정수 더하기
		int sum=0;		//Vector<Double>인 경우 여기도 double
		for(int i=0; i<v.size(); i++) {
			int n = v.elementAt(i);		//여기도 실수
			sum += n;
		}
		System.out.println("벡터에 있는 정수 합 : " + sum);
	}

}
