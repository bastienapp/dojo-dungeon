public class Adventurer {

	String name;
	int gold = 0;

	public Adventurer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getGold() {
		return this.gold;
	}

	public void addGold(int gold) {
		this.gold += gold;
	}
}