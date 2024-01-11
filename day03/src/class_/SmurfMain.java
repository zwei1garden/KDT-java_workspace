package class_;

public class SmurfMain {

	public static void main(String[] args) {
		
		// 스머프 두 마리 생성
		
		Smurf s1 = new Smurf();
		s1.name = "파파 스머프";
		s1.age = 100;
		s1.kind = "대장";
		s1.color = "파란색";
		
		Smurf s2 = new Smurf();
		s2.name = "똘똘이 스머프";
		s2.age = 3;
		s2.kind = "겁쟁이";
		s2.color = "파란색";
		
		s1.showSmurfInfo();
		System.out.println("\n");
		s2.showSmurfInfo();
	}
}
