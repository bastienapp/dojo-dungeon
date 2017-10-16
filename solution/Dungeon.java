import java.util.HashMap;

public class Dungeon {

	private Adventurer[] adventurers;
	private int[] rooms;

	public Dungeon(Adventurer[] adventurers, int[] rooms) {
		this.adventurers = adventurers;
		this.rooms = rooms;
	}

	public HashMap<String, Integer> search() {
		int turn = 0;
		for (int i = 0; i < rooms.length; i++) {
			this.adventurers[turn].addGold(this.rooms[i]);
			turn++;
			if (turn >= this.adventurers.length) {
				turn = 0;
			}
		}
		HashMap<String, Integer> result = new HashMap<>();
		for (int i = 0; i < this.adventurers.length; i++) {
			Adventurer adventurer = this.adventurers[i];
			result.put(adventurer.getName(), adventurer.getGold());
		}
		return result;
	}
}