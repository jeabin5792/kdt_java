package GameTask;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Character character = null;
		Wizard wizard = null;
		Warrior warrior = null;
		Rogue rogue = null;
		while (true) {
			System.out.println("캐릭터를 선택하세요");
			System.out.println("1.마법사");
			System.out.println("2.전사");
			System.out.println("3.로그");
			System.out.println("입력 : ");
			int ch = sc.nextInt();
			sc.nextLine();
			if(ch == 1) {
				wizard = new Wizard();
				break;
			}else if(ch == 2) {
				warrior = new Warrior();
			}else if(ch == 3) {
				rogue = new Rogue();
			}else{
				System.out.println("번호를 다시 입력하세요");
			}

		}
		String msg = "\n1. 일반공격\n2. 스킬공격\n3. 특수공격\n4. 종료\n번호입력 : ";
		while(true) {
			System.out.println(msg);
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
				wizard.normalAttack();
				break;
			case 2:
				wizard.skillAttack();
				break;
			case 3:
				wizard.specialAttack();
				break;
			case 4:
				System.out.println("게임종료");
				sc.close();
				return;
			default:
				System.out.println("잘못된 입력입니다 다시 입력해주세요");
			}
		}
		



	}
}
