/*
 * 소스파일: FileOutputStreamEx.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * FileOutputStream으로 바이너리 파일 쓰기
 */

import java.io.*;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b[] = {7,51,3,4,-1,24};
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\LG\\Desktop\\JavaProgrammingPractice\\1116\\src\\test.out");
			for(int i=0; i<b.length; i++)
				fout.write(b[i]);
			fout.close();
		} catch(IOException e) {
			System.out.println("파일에 저장할 수 없습니다. 경로명을 확인해주세요.");
			return;
		}
		System.out.println("저장되었습니다.");
	}

}
