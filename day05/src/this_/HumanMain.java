package this_;

public class HumanMain {

	public static void main(String[] args) {
		
		Human lee = new Human("이정원", 23); 
		/*예상 결과
		 * 이름: 이정원
		 * 나이: 23
		 * */
		lee.showInfo();
		Human kim = new Human("김정원");
		/*예상 결과
		 * 이름: 김정원
		 * 나이: 0
		 * */
		kim.showInfo();
		Human park = new Human();
		/*예상 결과
		 * 이름: 이름 없음
		 * 나이: -1
		 * */
		park.showInfo();

	}

}
