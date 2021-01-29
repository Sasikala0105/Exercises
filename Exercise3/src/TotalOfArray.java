
public class TotalOfArray {

	public static void main(String[] args) {
		int[] totalPerRow = new int[4]; //single dimensional array
		int[ ][ ] list = { //multi dimensional array
				{12, 53, 23, 11, 23, 23},
				{15,25,13, 2, 0, 22},
				{20,4,7, 99, 12, 13},
				{11,18,14, 22, 12, 30}
				};
		int row, col, total;
		total = 0;
		for (row = 0; row < list.length; row++) {
			for (col = 1; col < list[row].length; col++) {
				totalPerRow[row] = totalPerRow[row] + list[row][0];
				}
			total = total + totalPerRow[row];
			System.out.println("The total element of row" + (row+1) + "=" + totalPerRow[row]);
			}
		System.out.println("The total = " + total);	
	}

}
