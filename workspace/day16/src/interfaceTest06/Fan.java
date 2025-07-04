package interfaceTest06;
//23번 : 어댑터클래스
public interface Fan {
	int MAX_STRANGH =3;
	int MIN_STRANGH=0;
	
	void on();
	void off();
	void turbo();
	
	//구현하는 클래스
	//CeilingFan클래스
	//3개 메소드 천장선풍기를 켭니다, 끕니다, 터보 비워두기
	//TableFan
	//탁자선풍기를 켭니다, 끕니다, 비워두기
	//TowerFan
	//타워 선풍기를켭니다, 끕니다, 타워선풍기를 터보모드로 전환합니다
	
	
	
	
}
