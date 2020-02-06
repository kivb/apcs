package apcs.lab.lab13;

public class foo {

	public static void main(String[] args) {
		int[][] f = new int[2][3];

		f[0][0] = 10;
		f[0][1] = 11;
		f[0][2] = 12;
		f[1][0] = 20;
		f[1][1] = 21;
		f[1][2] = 22;
/*
		printArr(f);
		System.out.println("\n");
		
		f[1][2] = f[1][1];
		printArr(f);
		
*/
		Card [][] cardArr = new Card[3][];
		for(int i=0; i< 3; i++) {
			cardArr[i] = new Card[3];
			for (int j=0; j<3; j++) {
				
				cardArr[i][j].face = 6-i+j;
			}
		}
		printArr(cardArr);
		
	}
	public static void printArr(Card[][] f) {
		for (int i = 0; i< f.length; i++) {
			for (int j=0; j < f[i].length; j++) {
				System.out.print(f[i][j].face + "\t" );
			}
			System.out.println();
		}
	}
//		System.out.println(3%5);
}
