import java.util.ArrayList;

public class ArryList {


	public static void main(String[] args) {
		
		
		
		
		ArrayList fruitsList = new ArrayList<Integer>(5);
		
		fruitsList.add("Mango");
		fruitsList.add("Apple");
		fruitsList.add("Grape");
		fruitsList.add("Melon");
		fruitsList.add("Watermelon");
		fruitsList.remove("Grape");
		fruitsList.remove("Apple");
		fruitsList.remove("Melon");
		
		
		System.out.println(fruitsList);
		

	}

}
