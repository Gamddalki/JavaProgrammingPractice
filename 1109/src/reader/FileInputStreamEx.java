/*
 * 소스파일: FileInputStreamEx.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * FileInputStream으로 바이너리 파일 읽기
 */

package reader;

import java.io.*;

public class FileInputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b[] = new byte[6];		//비어있는 바이트 배열
		try {
			FileInputStream fin = new FileInputStream("");
			int n=0, c;
			while((c=fin.read()) != -1) {
				b[n] = (byte)c;
				n++;
			}
			System.out.println("~에서 읽은 배열을 출력합니다.");
			for(int i=0; i<b.length; i++)
				System.out.print(b[i] + " ");
			System.out.println();
			fin.close();		//스트림을 닫음 = 파일도 닫힘 = 더 이상 스트림으로부터 읽을 수 x
		}
		catch(IOException e) {
			System.out.println("읽지 못했습니다.");
		}
	}

}
