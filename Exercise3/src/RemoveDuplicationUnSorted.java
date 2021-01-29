import java.util.Arrays;

public class RemoveDuplicationUnSorted {
	public static void main(String[] args) {
		int[] origArray = new int[] { 3, 1, 3, 1, 2, 3, 4, 4 };
		int[] tempArray = removeDuplicates(origArray);
		for (int i = 0; i < tempArray.length; i++) {
			System.out.print(tempArray[i] + " ");
			}
		}
		
	static int[] removeDuplicates(int[] my_array) {
		int no_unique_elements = my_array.length;
		
		for (int i = 0; i < no_unique_elements; i++) {
			for (int j = i+1; j < no_unique_elements; j++) {
				if(my_array[i] == my_array[j]) {
					my_array[j] = my_array[no_unique_elements-1];
					no_unique_elements--;
					j--;
					}
				}
			}
		
		int[] result_array = Arrays.copyOf(my_array, no_unique_elements);
		
		return result_array;	
	}

}
