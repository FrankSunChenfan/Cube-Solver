package processing;

public class SixSide {
		public static final int SIZE = 9;
		// The comments are written in scanning sequence
		public int[] white;			// First
		public int[] green;			// Second
		public int[] yellow;		// Third
		public int[] blue;			// Fourth
		public int[] red;			// Fifth
			// Due to rotation, green again
		public int[] orange;		// Sixth
		private int[][] comfort;
	
		public SixSide(int[][] data) {
			white = new int[SIZE];
			green = new int[SIZE];
			yellow = new int[SIZE];
			blue = new int[SIZE];
			red = new int[SIZE];
			orange = new int[SIZE];
			for (int i = 0; i < SIZE; i++) {
				white[i] = data[0][i];
				green[i] = data[1][i];
				yellow[i] = data[2][i];
				blue[i] = data[3][i];
				red[i] = data[4][i];
				orange[i] = data[5][i];
			}
			comfort[0] = white;
			comfort[1] = green;
			comfort[2] = yellow;
			comfort[3] = blue;
			comfort[4] = red;
			comfort[5] = orange;

		}
		
		public SixSide(SixSide newData) {
			for (int i = 0; i < 6; i++) {
				comfort[i] = newData.comfort[i];
			}
		}
	}