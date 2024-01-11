package instanceof_;


public class MainClass {

	public static void main(String[] args) {
		
		Human h1 = new Human("이정원", 23);
		h1.showInfo();
		Student s1 = new Student("이학생", 19);
		s1.showInfo();
		Cat c1 = new Cat("나비", 6);
		c1.meow();
		
		System.out.println(h1 instanceof Human); // h1이 Human기반인가 -> true
		System.out.println(h1 instanceof Student); // h1이 Student기반인가 -> flase
		System.out.println(s1 instanceof Human); // s1이 Human기반인가 -> true
		System.out.println(s1 instanceof Student); // s1이 Student기반인가 -> true
		// 관련이 아예 없는 객체간 비교는 에러 발생
		// System.out.println(h1 instanceof Cat); // h1이 Cat기반인가 -> false

	}

}
