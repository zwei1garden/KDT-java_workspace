package encapsulation.bad;

public class MainClass {

	public static void main(String[] args) {
		MyBirthday b = new MyBirthday();
		
		b.year = 2002;
		b.month = 13; // 13월을 넣어도 받아들임. 
		b.day = 17;
		
		b.showDateInfo();
	}
}
