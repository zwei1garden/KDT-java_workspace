package garbagecollection;

public class GarbageCollectionTestMain {
	
	public static void main(String[] args) throws Exception {
		
		GarbageCollectionTest test2 = null;
		
		for (int i = 0; i < 5; i++) {
			GarbageCollectionTest test = new GarbageCollectionTest(i);
			
			if (i == 3) {
				test2 = test; // 3번 객체는 test2와 연결 유지!
			}
			
			test = null;
		
		}
		
		// 쓰레기 수집 강제 실행 명령어
		System.gc();
		Thread.sleep(1000);
	}

}
