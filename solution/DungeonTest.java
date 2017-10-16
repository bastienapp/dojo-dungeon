import junit.framework.*;
import org.junit.Test;
import java.util.HashMap;

public class DungeonTest extends TestCase {

	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}

	@Test
	public void test1() throws Exception {
		int[] rooms = new int[]{50, 120, 0, 60};
		Adventurer arnold = new Adventurer("Arnold");
		Adventurer electra = new Adventurer("Electra");
		Adventurer darkSasuke = new Adventurer("DarkSasuke");
		Adventurer[] adventurers = new Adventurer[]{arnold, electra, darkSasuke};
		HashMap<String, Integer> expected = new HashMap<>();
		expected.put("Arnold", 110);
		expected.put("Electra", 120);
		expected.put("DarkSasuke", 0);
		Dungeon dungeon = new Dungeon(adventurers, rooms);
		assertEquals(expected, dungeon.search());
	}
}