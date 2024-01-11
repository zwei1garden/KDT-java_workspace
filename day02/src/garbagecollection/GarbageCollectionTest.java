package garbagecollection;

public class GarbageCollectionTest {

	public int objectNum; // 객체번호
	
	//생성자
	public GarbageCollectionTest(int num) {
		objectNum = num;
		System.out.println(objectNum + "번 째 객체 생성");
	}
	
	// 소멸자
	@Override
	protected void finalize() throws Throwable {
		System.out.println(objectNum + "번 째 객체가 힙에서 삭제됩니다.");
	}
}
