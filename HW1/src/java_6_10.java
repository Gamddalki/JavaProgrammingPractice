/*
 * 소스파일: java_6_10.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * 응용프로그램 완성
 * p387 6장 10번
 */

import java.util.Scanner;

class Person {
	String name;
	private int num1, num2, num3;
	
	Person(String name) {		//name 값을 매개변수로 받아 필드를 초기화하는 생성자
		this.name=name;
	}
	
	public boolean gamble() {
		num1 = (int)((Math.random()*3)+1);
		num2 = (int)((Math.random()*3)+1);
		num3 = (int)((Math.random()*3)+1);		//3개의 난수 발생
		System.out.print("\t" + num1 + "  " + num2 + "  " + num3 + "  ");		//난수 출력
		if(num1 == num2 && num2 == num3)		//3개의 난수가 모두 같으면
			return true;						//승자가 된다
		else 
			return false;
	}
}

public class java_6_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//전공 학번 이름 출력
		System.out.println("이화여대 컴퓨터공학전공 2071019 김한나");
		
		System.out.print("1번째 선수 이름>>");
		String name = scanner.nextLine();
		Person p1 = new Person(name);			//1번째 선수의 이름을 입력받아 person 객체 생성
		
		System.out.print("2번째 선수 이름>>");
		name = scanner.nextLine();
		Person p2 = new Person(name);			//2번째 선수의 이름을 입력받아 person 객체 생성
		
		while(true) {
			System.out.print("[" + p1.name + "]:<Enter>");		//p1의 차례
			String enter = scanner.nextLine();					//엔터 입력 시 난수 발생
			if(p1.gamble()) {
				System.out.println(p1.name + "님이 이겼습니다!");
				break;											//승자가 되고 게임이 끝난다
			}
			System.out.println("아쉽군요!");						//아닐 경우 이어서 게임 진행
			
			System.out.print("[" + p2.name + "]:<Enter>");		//p2의 차례
			enter = scanner.nextLine();							//엔터 입력 시 난수 발생
			if(p2.gamble()) {
				System.out.println(p2.name + "님이 이겼습니다!");	
				break;											//승자가 되고 게임이 끝난다
			}
			System.out.println("아쉽군요!");						//아닐 경우 이어서 게임 진행
		}
		
		scanner.close();
	}

}
