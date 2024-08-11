package food.system;

import java.util.ArrayList;
import java.util.List;

public class NorthIndian implements Menu {
	private List<String> northFood;

	public NorthIndian() {
		northFood = new ArrayList<>();
		addNorthIndianFoods();
	}

	private void addNorthIndianFoods() {
		northFood.add("Chappathi");
		northFood.add("Paneer Butter Masala");
		northFood.add("Aloo Paratha");
		northFood.add("Gulab Jamun");
		northFood.add("Naan");

	}

	@Override
	public List<String> getIndianFoods() {
		return northFood;
	}

}