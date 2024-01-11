package class_;

public class BasketballPlayerMain {

	public static void main(String[] args) {
		
		// 농구선수 두 명 생성
		BasketballPlayer bp1 = new BasketballPlayer("이정원", 189, 23, 10000);
		//bp1.name = "이정원";
		//bp1.height = 189;
		//bp1.age = 23;
		//bp1.salary = 1000000;
		
		BasketballPlayer bp2 = new BasketballPlayer("조던", 195, 25, 20000);
		//bp2.name = "조던";
		//bp2.height = 195;
		//bp2.age = 25;
		 //bp2.salary = 2000000;
		
		bp1.showInfo();
		bp1.dunkShoot();
		System.out.println("\n");
		bp2.showInfo();
		bp2.dunkShoot();
	}
}

