package accessmodifier.constructor.pack2;

import accessmodifier.constructor.pack1.A;
public class C {

	A a1 = new A(true);
	// A a2 = new A(2002); // default는 super() 키워드 사용해야 함. 
	// A a3 = new A("garden"); // private라 안 됨. 
	
	
}
