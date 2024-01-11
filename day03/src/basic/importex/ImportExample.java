package basic.importex;

import basic.garden.Flower;
import basic.garden.Grass;
import basic.hello.bye.Bye;
import basic.hello.hi.Hi;


/*
 * 같은 프로젝트 내의 코드끼리나 혹은 자바에서 기본으로 제공하는 클래스 파일은
 * 언제든지 가져다가 사용 가능
 * 다만 다른 패키지에 있는 클래스를 사용하려면 반드시 
 * package 선언부 아래(1번 라인)에 import 선언을 통해 참조할 클래스의 경로를 적어야 함.
 * ex) import java.util.Date; -> Date 클래스를 참조하기 위한 경로 
 * */
public class ImportExample {

	public static void main(String[] args) {
		
		Test test = new Test(); // import하지 않아도 같은 package안에 있었기에 가능한 것 
		Grass g = new Grass(); // 같은 계열이 아니기 때문에 import basic.garden.Grass; 가 되어 있음.
		// Grass와 마찬가지로 Flower, Hi, Bye도 같은 맥락 
		Flower f = new Flower();
		Hi hi = new Hi();
		Bye bye = new Bye();
		
	}
}
