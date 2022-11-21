/*
 * 소스파일: BlockBinaryCopyEx.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * 블록 단위로 바이너리 파일 고속 복사
 */

import java.io.*;

public class BlockBinaryCopyEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src = new File("C:\\Windows\\Web\\Wallpaper\\Theme1\\1.jpg");
		File dest = new File("C:\\Users\\LG\\Desktop\\JavaProgrammingPractice\\1116\\src\\1.jpg");
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(src);
			byte [] buf = new byte [1024*10];
			while(true) {
				int n = fi.read(buf);
				fo.write(buf, 0, n);
				if(n<buf.length)
					break;
			}
			fi.close();
			fo.close();
			System.out.println("복사가 완료되었습니다.");
		} catch(IOException e) {
			System.out.println("파일 복사 오류");
		}
	}

}
