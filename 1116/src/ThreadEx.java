import java.util.*;

class numThread extends Thread {
	private int n;
	
	public numThread(int n) {
		this.n=n;
	}
	
	@Override
	public void run() {
		while(true) {
			System.out.println("1번 스레드 : " + n);
			n+=3;
			try {
				sleep(1000);
			} catch(InterruptedException e) {
				return;
			}
		}
	}
}

class strThread extends Thread {
	private String str;
	
	public strThread(String str) {
		this.str=str;
	}
	
	@Override
	public void run() {
		while(true) {
			System.out.println("2번 스레드 : " + str);
			try {
				sleep(2000);
			} catch(InterruptedException e) {
				return;
			}
		}
	}
}

class bothThread extends Thread {
	private int n;
	private String str;
	
	public bothThread(int n, String str) {
		this.n=n;
		this.str=str;
	}
	
	@Override
	public void run() {
		while(true) {
			System.out.println("3번 스레드 : " + n + " " + str);
			try {
				sleep(1500);
			} catch(InterruptedException e) {
				return;
			}
		}
	}
}

public class ThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		int i = scanner.nextInt();
		scanner.nextLine();
		System.out.println("문자열을 입력하세요 : ");
		String str1 = scanner.nextLine();
		System.out.println("숫자와 문자열을 순서대로 입력하세요 : ");
		int j = scanner.nextInt();
		scanner.nextLine();
		String str2 = scanner.nextLine();
		
		Thread th1 = new Thread(new numThread(i));
		Thread th2 = new Thread(new strThread(str1));
		Thread th3 = new Thread(new bothThread(j, str2));
		
		th1.start();
		th2.start();
		th3.start();
	}

}
