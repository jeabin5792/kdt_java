package GameTask;

public class Wizard extends Character {

	public Wizard() {
		super("마법사", 15, 30, 1, 30, 0);

	}

	@Override
	public void normalAttack() {
		hp -= 2;
		super.normalAttack();
		revive();

	}

	@Override
	public void skillAttack() {
		if (checkMp(3)) {
			super.skillAttack();
		} else {
			System.out.println("mp가 부족합니다");
			showStatus();
		}

	}

	@Override
	public void specialAttack() {
		System.out.println("마법사는 특수공격이 없습니다");
	}

}
