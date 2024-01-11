package inheritance;

public class InheritanceMain {

	public static void main(String[] args) {
		
		Student st1 = new Student();
		
		st1.name = "이정원";
		st1.age = 23;
		st1.major = "소융";
		
		Salaryman sm1 = new Salaryman();
		sm1.name = "김샐러리";
		sm1.age = 30;
		sm1.salary = 8000;
	}

}
