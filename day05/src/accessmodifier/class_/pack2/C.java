package accessmodifier.class_.pack2;
import accessmodifier.class_.pack1.B;
public class C {

	B b = new B(); // public 클래스이므로 패키지가 달라도 생성 가능
	// A a = new A(); // default 접근제한자를 적용받은 클래스이므로 자동 완성자도 안 생김. 
}
