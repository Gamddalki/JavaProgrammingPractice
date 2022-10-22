/*
 * 소스파일: MoreInterface.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * MMS와 Mail 수신/발신 인터페이스
 */

package smartphone;

public interface MoreInterface extends PhoneInterface {	//인터페이스 선언
	void sendMMS();				//추상 메소드
	void receiveMMS();			//추상 메소드
	void sendMail();			//추상 메소드
	void receiveMail();			//추상 메소드
}
