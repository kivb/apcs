package apcs.labs.lab9;

public class MapMaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int[][] createMap(int r, int c) {
		return new int[r][c];
	}

	public static int[][] createMap() {
		int[][] m1 = {
				{1,3,0,0,0,0,0,0,0,0},
				{0,3,0,3,0,3,0,3,3,0},
				{0,0,0,3,0,0,0,3,0,0},
				{3,0,3,0,3,3,3,0,0,3},
				{0,0,0,0,0,0,3,0,3,0},
				{0,3,3,3,0,0,0,3,0,0},
				{0,0,0,0,3,3,0,0,0,3},
				{0,3,0,0,3,0,3,0,3,0},
				{0,0,0,3,0,0,0,0,0,0},
				{0,3,0,0,3,0,0,3,0,2}			
				};
		return m1;
	}

}
