package super_;

public class Airplane {

	public String planeCode;
	protected int speed;
	public int gas;
	
	public Airplane(String planeCode) { // 항공편명만 바꿔서 생성할 수 있도록
		speed = 0;
		gas = 100;
		this.planeCode = planeCode;
	}
	
	public void fly () {
		
		if (gas - 3 < 0) { // 가스가 음수로 되지 않도록
			// gas = 0;
			System.out.println("연료 부족으로 가속 불가능");
			return;
		} 
		if (speed + 100 >= 900) {
			speed = 900; // 속도는 900으로 제한
			gas -= 3;
			return;
		}
		
		speed += 100;
		gas -= 3;
		
	}
	
	//계기판 보는 메서드
	public void showStatus() {
		System.out.println("편명: " + this.planeCode + " 속력: " + this.speed + " 연료: " + this.gas);
		// System.out.println("속력: " + this.speed );
		// System.out.println("연료: " + this.gas );
	}
}
