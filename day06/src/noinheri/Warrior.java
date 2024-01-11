package noinheri;

import java.net.NoRouteToHostException;

public class Warrior {

	//정보은닉 적용
	private String id;
	private int hp;
	private int atk;
	private int def;
	private int exp;
	
	public Warrior(String id) {
		this.id = id;
		this.hp = 20;
		this.atk = 3;
		this.def = 1;
		this.exp = 0;
	}
	
	// 케릭터 상태가 조회 가능한 showStatus()
	public void showStatus() {
		System.out.println("아이디: " + this.id);
		System.out.println("체력: " + this.hp);
		System.out.println("공격력: " + this.atk);
		System.out.println("방여력: " + this.def);
		System.out.println("획득 경험치: " + this.exp);
		System.out.println("========================");
	}
	
	// 토끼 공격 
	public void huntRabbit(Rabbit rabbit) {
		// int rabbitHp = rabbit.getHp();
		
		if (rabbit.getHp() <= 0) {
			System.out.println("이미 죽은 토끼입니다.");
			return;
		}
		
		// 1. 내가 공격한 토끼의 체력을 3 깎기.
		rabbit.setHp(rabbit.getHp() - this.atk);
		// 2. 방금 공격으로 죽었다면 경험치 5증가
		if (rabbit.getHp() <= 0) {
			System.out.println("토끼를 죽였습니다.");
			this.exp += 5;
		} else {
			System.out.println("토끼를 공격했습니다.");
		}
	}
	
	public void huntRat(Rat rat) {
		
		// int ratHp = rat.getHp();
		
		if (rat.getHp() <= 0) {
			System.out.println("이미 죽은 쥐입니다.");
			return; // 이미 죽은 쥐에 대해서는 추가 로직 필요 없음. 
		}
		
		// 1. 내가 공격한 쥐의 체력을 3 깎기.
		rat.setHp(rat.getHp() - this.atk);
		
		// 2. 방금 공격으로 죽었다면 경험치 80증가
		if (rat.getHp() <= 0) {
			System.out.println("쥐를 죽였습니다.");
			this.exp += 80;
		} else {
			System.out.println("쥐를 공격했습니다.");
			// 쥐는 죽지 않으면 반격함. 
			System.out.println("쥐가 반격을 합니다.");
			this.hp -= rat.getAtk();
		}
		
	}
}

