package food.system;

import java.util.ArrayList;
import java.util.List;

public class SouthIndian implements Menu {
	private List<String> southFood;

	public SouthIndian() {
		southFood = new ArrayList<>();
		addSouthIndianFoods();

	}

	private void addSouthIndianFoods() {
		southFood.add("Idly");
		southFood.add("Poori");
		southFood.add("Pongal");
		southFood.add("Vada");
		southFood.add("Dosa");

	}

	@Override
	public List<String> getIndianFoods() {
		return southFood;
	}
}