package noinheri;

public class MainClass2 {

	public static void main(String[] args) {
		
		// 전사 생성
		Warrior w2 = new Warrior("leegarden2");
		w2.showStatus();
		
		// 쥐 생성
		Rat rat1 = new Rat();
		
		// 쥐 교전
		for (int i = 0; i < 3; i++) {
			w2.huntRat(rat1);
		}
		
		System.out.println("\n");
		w2.showStatus();
		
	}
}
