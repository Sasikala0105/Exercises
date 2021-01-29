
public class ArrayAverage {

	public static void main(String[] args) {
		int[] list = {12, 53, 23, 11, 23, 23};
		int index, sum;
		double average;
		sum = 0;
		for(index = 0; index < list.length;index++) {
			sum = sum + list[index];
			}
		if (list.length != 0) { //!= not equal
			average = sum / list.length;
			} else {
				average = 0.0; //if length--0
				}
		System.out.println("The average of element in the array = " + average);
	}

}
