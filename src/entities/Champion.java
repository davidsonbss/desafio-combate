package entities;

public class Champion {
	
	private String name;
	private int life;
	private int attack;
	private int armor;
		
	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}
	
	public String getName() {
		return name;
	}

	public int getlife() {
		return life;
	}
	
	public int getAttack() {
		return attack;
	}
	
	public int getArmor() {
		return armor;
	}
	
	public void takeDamage(Champion other) {
		
		if(getArmor() >= other.getAttack()) {
			life -= 1;
		} else {
			life -= other.getAttack() - getArmor();
		}
		
		if(life <= 0) {
			life = 0;
		}
	}
	
	public String Status() {
		
		String death;
		
		if(getlife() == 0) {
			death = " (morreu)";
		} else {
			death = "";
		}
		return getName()
				+ ": "
				+ getlife()
				+ " de vida"
				+ death;
	}
}
