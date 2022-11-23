/* 소스파일: SynchronizedEx.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * synchronized를 사용해 공유집계판 사례 코딩
 */

class SharedBoard{
	private int sum=0;	//집계판의 합
	
	synchronized public void add() {
		int n = sum;
		Thread.yield();		//현재 실행중인 스레드 양보
		n+=10;				//10 증가
		sum = n;			//집계합에 합
		System.out.println(Thread.currentThread().getName() + " : " + sum);
	}
	
	public int getSum() {
		return sum;
	}
}

class StudentThread extends Thread {
	private SharedBoard board;		//집계판의 주소
	
	public StudentThread(String name, SharedBoard board) {
		super(name);
		this.board = board;
	}
	@Override
	public void run() {
		for(int i=0; i<10; i++)
			board.add();
	}
}

public class SynchronizedEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedBoard board = new SharedBoard();
		Thread th1 = new StudentThread("kitae", board);
		Thread th2 = new StudentThread("hyosoo", board);
		th1.start();
		th2.start();
	}

}
