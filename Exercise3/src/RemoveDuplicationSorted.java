
public class RemoveDuplicationSorted {

	public static void main(String[] args) {
		Integer[] origArray = new Integer[] { 1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6};
		Integer[] tempArray = removeDuplicates(origArray);
		for (int i = 0; i < tempArray.length; i++) {
			if(tempArray[i] != null) {
				System.out.print(tempArray[i] + " ");
				}
			}
		}
		 
	private static Integer[] removeDuplicates(Integer[] origArray) {
		Integer[] tempArray = new Integer[origArray.length];
		int indexJ = 0;
		for (int indexI = 0; indexI < origArray.length - 1; indexI++) {
			Integer currentElement = origArray[indexI];
			if (currentElement != origArray[indexI+1]) {
				tempArray[indexJ++] = currentElement;
				}
			}
		tempArray[indexJ++] = origArray[origArray.length-1];
			
		return tempArray;
	}

}
