package class_;
public class BasketballPlayer {

	public String name;
	public int height;
	public int age;
	public int salary;

	// 생성자는 return 타입이 없고 클래스명과 동일한 이름으로 메서드를 정의하면 됨. -> 클래스명과 다르게 하면 return타입이 없다는 오류가 발생
	public BasketballPlayer(String name, int height, int age, int salary) {
		this.name = name; // this.name을 초기화 하는 데에 name을 사용하겠다는 의미
		this.height = height;
		this.age = age;
		this.salary = salary;
	}
	
	// showInfo (BasketballPlayer소속이므로 굳이 이름 적지 않아도 구분 가능: showBasketballInfo() 아니어도 된다는 말
	public void showInfo() {
		System.out.println("농구 선수의 이름: " + name);
		System.out.println("농구 선수의 키: " + height);
		System.out.println("농구 선수의 나이: " + age);
		System.out.println("농구 선수의 연봉: " + salary);
	}
	
	// 덩크슛 기능
	public void dunkShoot() {
		if (height >= 190) {
			System.out.println("텅크슛 성공!");
		} else {
			System.out.println("덩크슛 실패 ㅜㅡㅜ");
		}
	}
	
	
}
