package Construterbasic01;

public class Tv {
	//필드
			//채널, 볼륨, 전원, 색상, 브랜드
			boolean power; //기본값 false
			int ch;
			int vol;
			String color;
			String brand;
			
			
			
			//생성자 alt + shift + s + o		
			//기본 생성자 -> 개발자가 생성자를 만들지 않으면 컴파일러가 자동으로 생성한다
			public Tv() {
				
			}
			
			//매개변수가 4개 있는 생성자
			public Tv(int ch, int vol, String color, String brand) {
				
				this.ch = ch;
				this.vol = vol;
				this.color = color;
				this.brand = brand;
			}	
			
			








			//메소드
			//전원이 꺼져있으며 키고, 켜져있으면 끔
			//메소드명 : powerOnOff()
			void powerOnOff() {
				//전원이 켜져있으면 끈다
				power = !power;
				System.out.println("전원상태 : "+(power ? "켜짐":"꺼짐"));
//				if(power) {
//					System.out.println("전원상태 : 켜짐");
//				}else {
//					System.out.println("전원상태 : 꺼짐");
//				}
			}
			






			//볼륨을 올릴 수 있는 메소드
			//메소드명 : increaseVolume()
			//if~else
			//power-> true 볼륨 +1
			//		vol <= 99
			//			볼륨 + 1
			//		100초과 불가
			//power -> flase 전원을 켜주세요
			void increaseVolume() {
				if(power) {
					System.out.println("현재 볼륨 : " + vol);
					if(vol<=99) {
						vol ++;
						System.out.println("올린 후 볼륨 : "+ vol);
					}else{
						System.out.println("볼륨이 최대입니다");
					}
				}else {
					System.out.println("전원을 켜주세요");
				}
			}
			
			//볼륨을 내릴 수 있는 메소드
			//메소드명 : decreaseVolume()
			//power -> true 
			//		vol <0 
			//		볼륨 내리기 불가
			void decereaseVolume() {
				if(power) {
					System.out.println("현재 볼륨 : " + vol);
					if(vol>0) {
						vol--;
						System.out.println("내린 후 볼륨 : " + vol);
					}else {						
						System.out.println("볼륨이 최소입니다");
					}
				}else {
					System.out.println("전원을 켜주세요");
				}
			
//		      if (power) {
//		          ch++;
//		          if(ch >= 999) {
//		             ch = 1;
//		          }
//		          System.out.println("현재 채널 : " + ch);
//		       } else {
//		          System.out.println("전원을 먼저 켜주세요");
//		       }
			}
			//채널을 올리는 매소드
			//메소드명 : nextChannel()
			void nextChannel() {
				if(power) {
					System.out.println("현재 채널 : " + ch);
					if(ch<500) {
						ch ++;
						System.out.println("내린 후 채널 : " + ch);
					}else {
						System.out.println("더 이상 채널을 올릴 수 없습니다");
					}
				}else {
					System.out.println("전원을 켜주세요");
				}
			}
			
			
			
			//채널을 내리는 매소드
			//매소드명 : previousChannel()	
			void previousChannel() {
				if(power) {
					System.out.println("현재 채널 : " + ch);
					if(ch>0) {
						ch --;
						System.out.println("내린 후 채널 : " + ch);
					}else {
						System.out.println("더 이상 채널을 내릴 수 없습니다");
					}
				}else {
					System.out.println("전원을 켜주세요");
				}
			}
}
