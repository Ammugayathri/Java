package food.system;

public class Indian {
	public static void main(String args[]) {
		Menu southIndian = new SouthIndian();
		Menu northIndian = new NorthIndian();
		System.out.println("South Indian Menu");
		System.out.println("-----------------");
		int i = 1;
		for (String food : southIndian.getIndianFoods()) {
			System.out.println(i++ + "." + food);
		}
		System.out.println("*****");
		i = 1;
		System.out.println("North Indian Menu");
		System.out.println("-----------------");
		for (String food : northIndian.getIndianFoods()) {
			System.out.println(i++ + "." + food);
			// i++;
		}

	}

}