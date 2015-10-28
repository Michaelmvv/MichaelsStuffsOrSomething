package hb;

import java.util.Arrays;

public class HorseBarn {
	Horse[] h;

	public HorseBarn(Horse[] horseList) {
		h = horseList;
	}

	public Object[] getSpaces() {
		return h;
	}

	public static HorseBarn createTestBarn() {

		Horse[] h = { new Horse("Trigger", 1340), null, new Horse("Silver", 1210), new Horse("Lady", 1575), null,
				new Horse("Patches", 1350), new Horse("Duke", 1410) };
		return new HorseBarn(h);
	}

	public Object findHorseSpace(String string) {
		for (int i = 0; i < h.length; i++) {
			try {
				if (h[i].getName().toString().equals(string)) {
					System.out.println(i);
					return i;
				}
			} catch (Exception e) {
			}
		}
		return -1;
	}

	public void consolidate() {
		Arrays.sort(h);
	}
}
