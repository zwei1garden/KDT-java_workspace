package encapsulation.good;

public class MyBirthday {

	private int year;
	private int month;
	private int day;
	
	// alt + shift + s 혹은 마우스 우클릭하여 source
	// generate constructor using fields 선택 
	public MyBirthday(int year, int month, int day) {
		// super();
		this.year = year;
		setMonth(month);
		setDay(day);
	}
	
	/*
	 * 은닉된 변수에 접근하기 위해서는 클래스 설게시 미리 설정해둔 setter/getter 메서드를 이용해 데이터에 접근해야 함. 
	 * setter 메서드 선언.
	 * 1. setter 메서드는 은닉변수 값을 저장하기 위해서 선언함.
	 * 2. 메서드 접근 제한자는 public으로 설정하고 이름은 일반적으로 set+변수명으로 지정
	 * */
	public void setYear(int year) {
		if (year < 1 ) {
			this.day = 1; // 범위를 벗어나는 값이 들어오면 1로 고정
		} else {
			this.day = day;
		}
	}
	
	public void setMonth(int month) {
		if (month < 1 || month > 12) {
			this.month = 1; // 범위를 벗어나는 값이 들어오면 1로 고정
		} else {
			this.month = month;
		}
	}
	
	public void setDay(int day) {
		if (day < 1 || day > 31) {
			this.day = 1; // 범위를 벗어나는 값이 들어오면 1로 고정
		} else {
			this.day = day;
		}
	}
	
	void showDateInfo() {
		System.out.println("내 생일은");
		System.out.println(year + "년");
		System.out.println(month + "월");
		System.out.println(day + "일");
		System.out.println("이니까 선물을 준비하세요 ㅋ");
	}
	
}
