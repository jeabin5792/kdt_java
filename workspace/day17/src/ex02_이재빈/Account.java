package ex02_이재빈;

public class Account {
//	필드 : 잔고 balance
	
	int balance;
	
//	출금 메소드 : withdraw 매개변수1개 => 잔액보다 출금 금액이 크다면 출금불가 예외 처리 / 현재 잔고는 0원입니다. 
//	            출금금액의 0원이 부족하여 출금이 불가합니다. 출력
	public void withdraw(int wd) {
			
				balance = balance-wd;
				if(balance<0) {
					try {
					throw new AccountException();
				}catch(AccountException e) {
					e.printStackTrace();
				}
			}else {
				System.out.println("현재 잔고는 "+ balance+"입니다");
			}
				
			
	}
	
	
	
//	입금 메소드 : deposit 매개변수1개 => 잔액에 입급된 금액 추가 후 입금된 금액은 0원입니다. 현재 잔고는 0원입니다 출력
//
//	=> 모든 예외처리는 메소드를 사용하는 쪽으로 던지기
}
