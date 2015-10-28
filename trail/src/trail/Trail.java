package trail;

public class Trail {
	int[] markers;

	public Trail(int[] markers) {
		this.markers = markers;
	}

	public boolean isLevelTrailSegment(int i, int j) {
		int max;
		int min;
		int count = j - i - 1;
		if (markers[i] > markers[j]) {
			max = markers[i];
			min = markers[j];
		} else {
			max = markers[j];
			min = markers[i];
		}
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		for (int k = 0; k < count; k++) {
			if (markers[i + k] > max) {
				max = markers[i + k];
			}
			if (markers[i + k] < min) {
				min = markers[i + k];
			}
		}
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		System.out.println(max - min);
		if (max - min < 10) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isDifficult() {
		int jumpsOf30 = 0;
		for (int i = 0; i < markers.length; i++) {
			try {
				
				if (Math.abs(markers[i + 1] - markers[i]) >= 30) {
					jumpsOf30++;
					System.out.println("JumpsOf30: " + jumpsOf30);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (jumpsOf30 >= 3) {
			System.out.println("True");
			return true;

		} else {
			System.out.println("False");
			return false;
		}
	}

}
