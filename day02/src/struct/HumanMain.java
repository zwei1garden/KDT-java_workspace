package struct;

public class HumanMain {

	public static void main(String[] args) {
		
		// 타 클래스에 정의된 요소를 main 내부에서 생성해서 쓸 수 있음
		
		//실제 개념고 다른 부분 있음. 혼동하지 마셈.
		// new 키워드는 힙에 자료를 저장
		// 자료형 변수 = new 자료형();
		// 위 명령어로 구조체의 인스턴스를 생성 가능
		// new 키워드의 리턴 자료는 해당 힙의 주소
		
		// 사람1 생성
		Human h1 = new Human(); // new는 힙에 저장(힙에 할당에놓고 할당된 주소를 return.)
		h1.name = "이정원";
		h1.age= 23;
		h1.height = 165;
		
		System.out.println("사람1의 주소: " + h1);
		System.out.println("사람1의 이름: " + h1.name);
		System.out.println("사람1의 나이: " + h1.age);
		System.out.println("사람1의 키: " + h1.height);
		System.out.println('\n');
		
		// 사람2 생성
		Human h2 = new Human(); // new는 새로운 객체를 생성하는 것이기에, h1과 같은 Human 객체이지만 다름. 
		h2.name = "사람2";
		h2.age= 20;
		//h2.height = 180;
		
		System.out.println("사람2의 주소: " + h2);
		System.out.println("사람2의 이름: " + h2.name);
		System.out.println("사람2의 나이: " + h2.age);
		System.out.println("사람2의 키: " + h2.height); // h2.height를 지정하지 않으면 초기값 0이 출력됨. 
		
	}
	
}
