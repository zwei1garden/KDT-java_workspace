package noinheri;

public class MainClass1 {

	public static void main(String[] args) {
		
		// 전사 생성
		Warrior w1 = new Warrior("leegarden");
		w1.showStatus();
		
		// 토끼 생성
		Rabbit r1 = new Rabbit();
		w1.huntRabbit(r1); // 토끼 공격
		w1.huntRabbit(r1); // 죽은 토끼 한 번 더 공격
		w1.showStatus();
	}

}
