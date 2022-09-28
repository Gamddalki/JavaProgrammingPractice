/*
 * �ҽ�����: ArrayLength.java
 * ��ȭ���� ��ǻ�Ͱ������� 2071019 ���ѳ�
 * �迭 ������ ��� ���ϱ�
 * �迭 : ���� Ÿ���� �����͵��� �ε���(0���� ����)�� ���� ���������� ����
 * - �迭 ���� : int intArray[]; (Ÿ��, ������, ����)
 * - �迭 ���� : intArray = new int [5]; (������, ����, Ÿ��, ���Ұ���)
 * - �ʱ�ȭ�ϸ� ���� : int intArray[] = {0,1,2,3,4};
 * - �ϳ��� �迭�� �ټ��� ���۷����� ���� ����
 * - �迭�� �ڹٿ��� ��ü�� ������ -> ��ü �� length �ʵ�� �迭�� ũ�⸦ ��Ÿ��
 */

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[] = new int[5];		//�迭�� ����� ����
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(intArray.length + "���� ������ �Է��ϼ��� >>");
		for(int i=0; i<intArray.length; i++)						//for���� �迭�� �������� ��������, ������ while�� �����
			intArray[i] = scanner.nextInt();
		
		for(int i=0; i<intArray.length; i++)
			sum += intArray[i];										//�迭�� ����� ���� �� ���ϱ�
		
		System.out.println("����� " + (double)sum/intArray.length);	//double ������ ���� Ÿ�� ��ȯ
		scanner.close();
	}
}
