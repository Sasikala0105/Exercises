
public class LargestElementInRow {

	public static void main(String[] args) {
		int[ ][ ] list = {
				{12, 53, 23, 11, 23, 23},
				{15,25,13, 2, 0, 22},
				{20,4,7, 99, 12, 13},
				{11,18,14, 22, 12, 30}
				};
		int row, col, largest;
		for (row = 0; row < list.length; row++) {
			largest = list[row][0];
			for (col = 1; col < list[row].length; col++) {
				if (largest < list[row][col]) {
					largest = list[row][col];
					}
				}
			System.out.println("The largest element of row" + (row+1) + "=" + largest);
			}
		}
	
	}


