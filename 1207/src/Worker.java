
public class Worker extends Thread{
	private My_object a;
	private int x;
	
	Worker(My_object a, int x){	//Worker의 생성자 메소드
		this.a = a;
		this.x = x;
	}
	
	@Override
	public void run() {
		a.foo(x);
	}
}
