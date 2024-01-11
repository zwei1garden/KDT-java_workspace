package overload;

public class SmurfMain {

	public static void main(String[] args) {
		Smurf s1 = new Smurf();
		System.out.println(s1.name);
		System.out.println(s1.color);
		s1.call();
		System.out.println("----------------------");
		
		Smurf s2 = new Smurf("파파스머스", "빨간색");
		System.out.println(s2.name);
		System.out.println(s2.color);
		s2.call(s2.name);
		
	}	
	
}
