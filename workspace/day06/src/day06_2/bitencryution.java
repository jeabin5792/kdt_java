package day06_2;
//8번 : 비트연산자를 이용한 암호화와 복호화
public class bitencryution {
public static void main(String[] args) {
	
	//전달할 데이터(원본 데이터)
	int originalMsg = 42;
	int key = 99; //비트 마스크(암호화, 복호화에 사용)
	System.out.println("원본 메세지 : " + originalMsg);
	
	
	int encryptMsg = originalMsg ^ key; //xor 연산을 통한 암호화
	System.out.println("암호화된 메세지 : " + encryptMsg);
	
	int decryptMsg = encryptMsg ^ key; //암호화된 메세지를 동일한 키로 xor연산을 통한 복호화
	System.out.println("복호화된 메세지 : " + decryptMsg);
	
	//xor => 두 비트가 서로 다른 경우 1을 반환하고 그 외에는 0을 반환
	//0 xor 0 => 0
	//0 xor 1 => 1
	//1 xor 0 => 1
	//1 xor 1 => 0
}
}
