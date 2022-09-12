package easy;

public class DiagonalDifference {
	public static void main(String [] args) {
		int[] data = {11, 2, 4,4, 5, 6,10, 8, -12};
		int dimension = 3, diagonal1 = 0, diagonal2 = 0, difference = 0;
		// sol üst köşe ile sağ alt köşe
		for (int x =0, y= 0;x < dimension && y < dimension;x++,y++) {
			System.out.println(data[y*3+x]);
			diagonal1 += data[y*3+x];
		}
		// sol alt köşeden sağ üst köşeye
		for (int x =0, y= dimension-1;y >= 0 && x < dimension;x++,y--) {
			System.out.println(data[y*3+x]);
			diagonal2 += data[y*3+x];
		}		
		if (diagonal1 > diagonal2) {
			difference = (diagonal1 - diagonal2);
		} else {
			difference = (diagonal2 - diagonal1);
		}
		System.out.println("Fark "+difference);
	}
}
