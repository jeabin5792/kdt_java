package ex02_이재빈;

public class AccountException extends Account{
	public AccountException(int balance) {
		super("현재 남아있는 잔고는"+ balance + "원입니다");
	}

	public void printStackTrace() {
		// TODO Auto-generated method stub
		
	}
}
