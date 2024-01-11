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
		
		getHumanInfo(h1);
		System.out.println("사람1의 주소: " + h1);
		System.out.println('\n');
		
		// 사람2 생성
		Human h2 = new Human(); // new는 새로운 객체를 생성하는 것이기에, h1과 같은 Human 객체이지만 다름. 
		h2.name = "사람2";
		h2.age= 20;
		h2.height = 180;
		
		getHumanInfo(h2);
		System.out.println("사람2의 주소: " + h2);
		
	}
	
	// Human 구조체를 받아서, 해당 구조체의 전체 필드 정보를 콘솔에 출력
	// Human을 받는데 Human에 없는 이유: java에서는 되는데 c언어에선 안 됐어서. -> 허용한 게 cpp
	// 함수와 메서드 차이점: 클래스에 소속되어 있는 함수는 메서드, 아닌 것은 함수: 주로 cpp에서 구분되는 듯. 
	public static void getHumanInfo(Human h) { // Human 구조체 자료형을 요구
		
		System.out.println("사람의 이름: " + h.name);
		System.out.println("사람의 나이: " + h.age);
		System.out.println("사람의 키: " + h.height);
		
	}
	
}
