package inheri;

public class MainClass1 {
	public static void main(String[] args) {
		
		Warrior w1 = new Warrior("leegarden");
		w1.showStatus();
		
		// 토끼 생성
		Rabbit r1 = new Rabbit();
		// 토끼랑 교전
		for (int i = 0; i < 2; i++) {
			w1.hunt(r1);
		}
		
		System.out.println("\n");
		w1.showStatus();
		
		// 쥐 생성
		Rat rat1 = new Rat();
		// 쥐랑 교전
		for (int i = 0; i < 3; i++) {
			w1.hunt(rat1);
		}
		
		System.out.println("\n");
		w1.showStatus();
		
		// 말 생성
		Horse h1 = new Horse();
		w1.showStatus();
		// 말이랑 교전
		for(int i = 0; i < 4; i++) {
			w1.hunt(h1);
		}
		
		System.out.println("\n");
		w1.showStatus();
	}

}
