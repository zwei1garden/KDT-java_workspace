package overload;

public class Smurf {

	public String name;
	public String color;
	
	// 생성자 오버로팅
	public Smurf() {
		
		name = "이름을 입력하지 않았습니다.";
		color = "색상을 입력하지 않았습니다.";
		
	}
	public Smurf(String name, String color) {
		
		this.name = name;
		this.color = color;
		System.out.println("지금부터 이 스머프의 이름은 " + name + "입니다.");
		
	}
	
	// 일반 메서드 오버로딩
	public void call() {
		System.out.println("일반스머프 이리와");
		
	}
	public void call(String name) {
		System.out.println(name + "이리와");
	}
}
