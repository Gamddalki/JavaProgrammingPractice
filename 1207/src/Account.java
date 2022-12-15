
public class Account {
	int balance = 1000;
	
	public synchronized void withdraw(int money) {
		while(balance < money) {
			try {
				wait();	//무기한 기다림
			}
			catch(InterruptedException e) {
				
			}
		}
		balance -= money;
		System.out.println(money + " 원을 인출하였습니다.\t잔고 : " + balance);
	}
	
	public synchronized void save(int money) {
		balance += money;
		System.out.println(money + " 원을 저금하였습니다.\t잔고 : " + balance);
		notifyAll();	//notify로 하면 랜덤하게 깨워서 실행할때마다 잔고 계속 달라짐, 이렇게 해야 계속 2000원 남음
	}
}
