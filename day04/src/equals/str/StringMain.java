package equals.str;

public class StringMain {

	public static void main(String[] args) {
		
		// 같은 클래스 안에서 동일한 문자열을 직접 대응하는 형식으로 String 객체를 생성할 시 같은 주소값을 공유하게 됨.
		
		String s1 = "룰루";
		String s2 = "룰루";
		System.out.println(s1 == s2); 
		// 결과는 true: 힙에 저장될 때 s1,s2가 같기에 동일한 데에 저장되므로. 
		// -> 문자가 같아서 true가 나온 것이라기보다는 주소값이 같기에 true가 나온 것.
		
		String s3 = new String("룰루");
		System.out.println(s1 + s2 + s3); // 모두가 룰루
		System.out.println("s1 == s3: " + (s1 == s3));
		// 결과는 false: 힙에 저장될 때 new 키워드를 사용해 다른 번지에 할당되기 때문에, 주소가 다르므로 false라는 결과가 나옴. 
		// => 자료는 같으나 주소는 다름. '=='은 주소 비교이기에
		
		// 따라서 주소가 아닌 자료의 동등성을 따질 때에는 .equals()를 씀.
		System.out.println("s1.equals(s3): " + s1.equals(s3));
	}
}
