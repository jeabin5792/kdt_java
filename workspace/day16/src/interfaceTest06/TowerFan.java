package interfaceTest06;

public class TowerFan implements Fan{

	@Override
	public void on() {
		System.out.println("타워선풍기를 켭니다");
		
	}

	@Override
	public void off() {
		System.out.println("타워선풍기를 끕니다");
		
	}

	@Override
	public void turbo() {
		System.out.println("타워선풍기를 터보모드로 전환합니다");
	}

}
