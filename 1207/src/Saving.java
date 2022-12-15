
public class Saving extends Thread {
	private Account account;
	private int money;
	
	public Saving(Account account, int money) {
		this.account = account;
		this.money = money;
	}
	@Override
	public void run() {
		account.save(money);
	}
}
