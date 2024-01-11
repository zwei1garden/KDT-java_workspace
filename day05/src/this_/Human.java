package this_;

public class Human {

	public String name;
	public int age;
	
	// 생성자 선언
	public Human (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//오버로딩: 메서드가 이름은 똑같은데 요구하는 파라미터의 개수나 종류가 다름(생성자도 들어감)
	public Human (String name) { // 이름만 입력받음
		this(name, 0); // this() 는 Human(String name, int age) 생성자와 기능이 같다고 생각.
		// this.name = name;
		// age = 0; // this.를 하지 않아도 지역 내부에 age가 없기에 무관함.
	}
	
	public Human () {
		this("이름없음", -1);
		// name = "이름 없음";
		// age = -1;
	}
	
	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
}
