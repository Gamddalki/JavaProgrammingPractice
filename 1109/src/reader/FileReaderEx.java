/*
 * 소스파일: FileReaderEx.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * FileReader로 텍스트파일 읽기
 */

package reader;

import java.io.*;

public class FileReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\LG\\Desktop\\JavaProgrammingPractice\\1109\\src\\reader\\sample.txt");
			InputStreamReader in = new InputStreamReader(fin, "UTF-8");
			int c;
			
			while((c=in.read()) != -1) {
				System.out.print((char)c);}
			in.close();
			fin.close();
		}
		catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}

}