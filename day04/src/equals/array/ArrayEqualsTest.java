package equals.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayEqualsTest {

	public static void main(String[] args) {
		
		// 배열은 참조형 변수이기 때문에, 단순 대입시 문제가 발생함.
		int[] intArray1 = {1,2,3,4,5};
		System.out.println("배열1의 주소" + intArray1 );
		// 배열도 참조형 변수이므로,주소가 아닌 실제 자료를 조회라려면 Arrays.toString(배열자료) 형식으로 호출해야 함. 
		System.out.println("배열1: " + Arrays.toString(intArray1)); //이 주소로 접근했을 때 나오는 값을 보고 싶을 경우
		System.out.println("-------------------------");
		
		// 새로 생성하지 않고, intArray1을 대입받는 intArray2를 생성
		// 힙에 저장된 자료를 새로 똑같이 할당하는 복사가 깊은 복사.
		// 변수 뒤에 .clone()을 써서 수행.
		
		// intArray1와 같은 주소를 가짐. 즉 intArray1을 변경하면 intArray2도 변경될 거라 예측 가능 (얕은 복사) 
		int[] intArray2 = intArray1; 
		
		intArray1[0] = 100;
		System.out.println("배열1: " + Arrays.toString(intArray1));
		System.out.println("배열2: " + Arrays.toString(intArray2));
		System.out.println("배열2의 주소" + intArray2);
		System.out.println("배열1,2 간의 동등성 비교: " + (intArray1 == intArray2));
		System.out.println("-------------------------");
		
		// intArray1을 변경했을 때 intArray2도 바뀌는 것을 막기 위해 하는 것이 .clone()
		// intArray1의 번지수를 복사하는 것이 아니라, 힙에서 값 자체를 복사하는 깊은 복사가 진행됨. 
		// => 얕은 복사는 스택에서 일어나고, 깊은 복사는 힙에서 일어난다. 
		int[] intArray3 = intArray1.clone(); 
		intArray1[1] = 200; // intArray1을 변경해도 intArray3는 변경되지 않음. 
		System.out.println("배열1: " + Arrays.toString(intArray1));
		System.out.println("배열3: " + Arrays.toString(intArray3));
		System.out.println("배열3의 주소" + intArray3);
		System.out.println("배열1,3 간의 동등성 비교: " + (intArray1 == intArray3));
		System.out.println("-------------------------");
	}
}
