package mentor;

public class mentor_5_4 {
	public static void main(String[] args) {
		
		int dice1=0;
		int dice2=1;
		int count=0;
		int dicenum=0;
		while(dice1!=dice2) {
			double random1 = Math.random();
			dice1=(int)(random1*6)+1;
			double random2 = Math.random();
			dice2=(int)(random2*6)+1;
			if(dice1==dice2) {
				dicenum=dice1;
			}
			count++;
			
		}
		System.out.println("반복횟수 : "+count);
		System.out.println("주사위 눈 : "+dicenum);
	}
}
