import java.util.Scanner;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int end=1;
		Scanner sc = new Scanner(System.in);
		SharedValue sv = new SharedValue();
		
		//냉장고, 세탁기, 전등 스레드에게 각 스레드 이름 입력받기
		System.out.println("메인 스레드에서 냉장고 스레드 : ");
		String str1 = sc.nextLine();
		System.out.println("메인 스레드에서 세탁기 스레드 : ");
		String str2 = sc.nextLine();
		System.out.println("메인 스레드에서 전등 스레드 : ");
		String str3 = sc.nextLine();
		
		FridgeThread th1 = new FridgeThread(str1, sv);
		LaundThread th2 = new LaundThread(str2, sv);
		LightThread th3 = new LightThread(str3, sv);
		
		//각 스레드 실행 시키기
		th1.start();
		th2.start();
		th3.start();
		
		while(true) {
			end=sv.setValue(-1);
			if(end==0)
				break;
			sc.nextLine();
			sc.nextLine();	//엔터 키 두번 입력 시 (2초 간격)  냉장고 값, 세탁기 값, 전등 값 변경
		}

		th1.interrupt();
		th2.interrupt();
		th3.interrupt();	//모든 스레드를 인터럽트로 종료
		sc.close();	//스캐너 닫기
	}

}
