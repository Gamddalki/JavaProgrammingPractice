
public class Withdrawl extends Thread{
	private Account account;
	private int money;
	
	public Withdrawl(Account account, int money) {
		this.account = account;
		this.money = money;
	}
	@Override
	public void run() {
		account.withdraw(money);
	}
}
