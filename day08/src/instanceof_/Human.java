package instanceof_;

public class Human {

	private String name;
	private int age;
	
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//void 파라미터로 생성자 호출시 이름과 나이를 초기화 하는 생성자.
	public Human() {
		this("noname", 0);
	}
	
	public void showInfo() {
		System.out.println("이름: " + this.name);
		System.out.println("나이: " + this.age);
		System.out.println("=================");
	}
}
