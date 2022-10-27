package o;

/*
 * 소스파일: java_6_12.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * 응용프로그램 완성
 * p388 6장 12번
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

public class java_6_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//전공 학번 이름 출력
		System.out.println("이화여대 컴퓨터공학전공 2071019 김한나");
		
		boolean run = true;
		System.out.print("겜블링 게임에 참여할 선수 숫자>>");
		int num = scanner.nextInt();
		Person p[] = new Person[num];						//입력받은 인원수에 맞게 객체 배열 생성
		String buffer = scanner.nextLine();
		
		for(int i=0; i<num; i++) {
			System.out.print((i+1) + "번째 선수 이름>>");
			p[i] = new Person(scanner.nextLine());			//n번째 선수의 이름을 입력받아 person 객체 생성
		}
		
		while(run) {
			for(int i=0; i<num; i++) {
				System.out.print("[" + p[i].name + "]:<Enter>");		//n번째 선수의 차례
				String enter = scanner.nextLine();					//엔터 입력 시 난수 발생
				if(p[i].gamble()) {
					System.out.println(p[i].name + "님이 이겼습니다!");
					run=false;
					break;											//승자가 되고 게임이 끝난다
				}
				System.out.println("아쉽군요!");						//아닐 경우 이어서 게임 진행
			}
		}
		
		scanner.close();
	}

}