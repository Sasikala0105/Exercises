
public class MoveZerosToEndClass {

	public static void main(String[] args) {
		int arr[] = { 8, 9, 0, 1, 0, 3 };
		
		moveZerosToEnd(arr);
		System.out.println("Modified array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			}
		}
		
	static void moveZerosToEnd(int arr[]) {
		int j = 0, i;
		
		for (i = 0; i < arr.length; i++) {
			if (arr[i] != 0 && arr[j] == 0) {
				arr = swap(arr, i, j);
				}
			if (arr[j] != 0) {
				j += 1;
				}
			}
		}
		
	static int[] swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}

}
