/*
 * �ҽ�����: Book.java
 * ��ȭ���� ��ǻ�Ͱ������� 2071019 ���ѳ�
 * ������ ���� �� Ȱ�� ����
 * ������ : ��ü ���� �� �ʱ�ȭ�� ���� ����Ǵ� �޼ҵ�
 * - ������ �̸��� Ŭ������� ����, ���� Ÿ���� ���� (���x) : �����ε�(�̸��� ������ ������ ���� �� �ۼ� ���� - �Է��� �ٸ�)
 * - ��ü ���� �� �ݵ�� ȣ��� / �� �ۼ� �� �����Ϸ��� �ڵ����� �⺻ ������ ����
 */

public class Book {
	String title;
	String author;
	
	public Book(String t) {					//������
		title = t;
		author = "���ڹ̻�";
	}
	
	public Book(String t, String a) {		//������
		title = t;
		author = a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book littlePrince = new Book("�����", "�������丮");
		Book loveStory = new Book("������");
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);			//���
	}
}
