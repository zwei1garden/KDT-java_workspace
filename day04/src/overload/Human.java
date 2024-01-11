package overload;

public class Human {

	public String name;
	public int age;
	
	// 생성자 오버로딩은 생성자를 여러 유형으로 만드는 것
	// 파라미터 () -> void 파라미터
	//        (String, int)
	// 두 가지 유형으로 만들 것.
	
	public Human() { // void파라미터, new Human()인 경우 호출
		name = "이름을 입력하지 않습니다.";
		age = 19;
	}
	
	// 파라미터가 두 개, String int 파라미터 new Human("문자", 정수)인 경우 호출
	public Human(String name, int age) { 
		this.name = name;
		this.age = age;
	}
	
	// => Human을 생성하는 방법이 두 개로 됨. 
}

