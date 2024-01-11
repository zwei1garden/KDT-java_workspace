package instanceof_;

public class Cat {

	private String name;
	private int age;
	
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void meow() {
		System.out.println(this.name + " 크야오오오옹");
	}
}
