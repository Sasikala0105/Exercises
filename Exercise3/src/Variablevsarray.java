
public class Variablevsarray {

	public static void main(String[] args) {
		int item0, item1, item2, item3, item4;
		int sum, sumArray, index;
		item0 = 5;
		item1 = 3;
		item2 = 1;
		item3 = 9;
		item4 = 11;
		sum = item0 + item1 + item2 + item3 + item4;
		System.out.println("The sum of the numbers = " + sum);
		int[] list = {5, 3, 1, 9, 11};
		sumArray = 0;
		for(index = 0; index < list.length;index++) {
			sumArray = sumArray + list[index];
			//sumArray += list[index];
			}
		System.out.println("The sum of the array = " + sumArray);
			  
			
	}

}
