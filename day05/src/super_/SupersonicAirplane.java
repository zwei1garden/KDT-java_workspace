package super_;

public class SupersonicAirplane extends Airplane{

	// 새롭게 정의되는 멤버변수 없음.
	
	public SupersonicAirplane(String planeCode) {
		//생성자는 상속이 되지 않음. 그렇기에 자식쪽 생성자에서 부모 생성자를 먼저 초기화해주고, 나머지 코드를 실행해야 함. 
		super(planeCode); 
		// 힙에 부모 메모리가 먼저 만들어지고, 자식이 만들어짐.
		// 그렇기에 super()코드가 가장 먼저 와야 함.
	}
	
	// 오버라이딩: 재정의 
	// 초음속 비행기도 fly를 사용하지만, 일반 비행기보다 확장된 개념을 사용하므로 오버라이딩을 통해 추가적인 정의를 해야 함.
	// 다만 900km/h 이하에서는 일반 비행을, 그 이후에는 초음속 비행을 하므로
	// 시속 900km 이하 구간에서는 오버라이딩 되기 전의 fly()를, 이후에는 재정의된 fly()를 호출해야 함. 
	
	@Override
	public void fly() {
		if (speed < 900) { // 일반 비행일 시 부모 fly() 호출
			super.fly();
		} else if (speed + 300 <= 2200 && gas >= 5) { // 초음속 비행일시
			speed += 300;
			gas -= 5;
		} else if (speed + 300 >= 2200 && gas >= 5) { // 속도가 2200을 넘길 경우 
			speed =  2200;
			gas -= 5;
		} else {
			System.out.println("연료가 부족하여 비행 불가능.");
		}
	} 
	
}
