package lambda.expression;


import java.util.Comparator;

public class ComparatorLambdaExample {
	public static void main(String args[]) {
		// BEFORE JAVA 8 - WAY 1
		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 > o2)
					return 1; // o1 comes second
				else if (o1 < o2)
					return -1; // o1 comes first
				else
					return 0; // o1 equals o2
			}

		};
		System.out.println(comparator.compare(3, 5));

		// USING LAMBDA EXPRESSION
		Comparator<Integer> comparator1 = (Integer a, Integer b) -> {
			if (a > b)
				return 1;
			else if (a < b)
				return -1;
			else
				return 0;
		};
		System.out.println(comparator1.compare(3, 5));

		// return type is not mandatory, if we use return then {} is must - WAY2(using
		// compareTo())
		Comparator<Integer> comparator2 = (a, b) -> {
			return a.compareTo(b);
		};
		System.out.println(comparator2.compare(3, 5));

		// for a single statement return is not mandatory
		Comparator<Integer> comparator3 = (a, b) -> a.compareTo(b);
		System.out.println(comparator3.compare(3, 5));

	}

}
