import java.util.Arrays;
public class SortElement {

	public static void main(String[] args) {
		String[] carsManufacturers  = new String[6];
		String firstElement;
		String lastElement;
		carsManufacturers[0] = "Proton";
		carsManufacturers[1] = "Perodua";
		carsManufacturers[2] = "Honda";
		carsManufacturers[3] = "Audi";
		carsManufacturers[4] = "BMW";
		carsManufacturers[5] = "KIA";
			
		Arrays.sort(carsManufacturers);
			    
		firstElement= carsManufacturers[0];
		lastElement = carsManufacturers[carsManufacturers.length - 1];
		

	}

}
