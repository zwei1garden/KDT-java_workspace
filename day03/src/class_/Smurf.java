package class_;

public class Smurf { 

	// 이름, 나이, 품종, 털색
	public String name;
	public int age;
	public String kind;
	public String color;
	
	// 클레스 정의용 클래스파일 내부 메서드는 static 붙이지 않음.
	// 이제 변수와 메서드가 같은 소속이므로, 레퍼런스 주소를 붙이지 않아도 됨. ex) h1.name 등등
	// 스머프 정보 조회 기능 
	public void showSmurfInfo() {
		System.out.println("스머프 이름: " + name);
		System.out.println("스머프 나이: " + age);
		System.out.println("스머프 품종: " + kind);
		System.out.println("스머프 털색: " + color);
	}
}
