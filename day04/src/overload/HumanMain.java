package overload;

public class HumanMain {

	public static void main(String[] args) {
		
		Human h1 = new Human(); // void생성자
		
		System.out.println("사람1의 이름: " + h1.name);
		System.out.println("사람1의 나이: " + h1.age);
		System.out.println("-----------------------");
		
		Human h2 = new Human("이정원", 23); // 매개변수 두 개인 생성자
		System.out.println("사람2의 이름: " + h2.name);
		System.out.println("사람2의 나이: " + h2.age);
	}

}
