package super_;

import super_.SupersonicAirplane;

public class AirplaneMain {

	public static void main(String[] args) {
		
		SupersonicAirplane sa1 = new SupersonicAirplane("KE1010");
		
		for (int i = 0; i <8; i++) {
			sa1.fly();
			sa1.showStatus();
		}
		//sa1.showStatus();
		
		System.out.println("------------------");
		for (int i = 0; i <4; i++) {
			sa1.fly();
			sa1.showStatus();
		}
		//sa1.showStatus();
	}

}
