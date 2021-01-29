
public class LargestElement {

	public static void main(String[] args) {
		 double[] list = {12.25, 53, 23, 11.5, 23, 23.5};
		 int index, maxIndex;
		 double largestNumber;
		 maxIndex = 0;
		 for(index = 1; index<list.length; index++) {
			 if (list[maxIndex] < list[index]) {
				 maxIndex = index;
				 }
			 }
		 largestNumber = list[maxIndex];
		 System.out.println("The largest element in the array = " + largestNumber);
		 }
	}
	


