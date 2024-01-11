package inheri;

// 해당 클래스의 인스턴스는  Monster 타입 변수에도 저장할 수 있음. 
public class Rabbit extends Monster {

	public Rabbit() {
		// 몬스터에게 토끼의 스펙을 전달. 
		super("토끼", 3, 0, 0, 5);
	}
}
