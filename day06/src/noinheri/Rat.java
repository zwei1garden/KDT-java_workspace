package noinheri;

public class Rat {

	private int hp;
	private int atk;
	private int def;
	
	public Rat() {
		this.hp = 5;
		this.atk = 1;
		this.def = 0;
	}
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}
}
