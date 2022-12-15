
public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		
		Thread m5000 = new Withdrawl(account, 5000);
		Thread m10000 = new Withdrawl(account, 10000);
		Thread m50000 = new Withdrawl(account, 50000);
		Thread m100000 = new Withdrawl(account, 100000);
		
		Thread p1000 = new Saving(account, 1000);
		Thread p5000 = new Saving(account, 5000);
		Thread p10000 = new Saving(account, 10000);
		Thread p50000 = new Saving(account, 50000);
		
		m5000.start();
		m10000.start();
		m50000.start();
		m100000.start();
		
		p1000.start();
		p5000.start();
		p10000.start();
		p50000.start();
	}

}