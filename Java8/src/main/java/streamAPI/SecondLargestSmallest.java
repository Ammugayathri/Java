//Write a Java program to find the second smallest and largest elements in a list of integers using streams
package streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestSmallest {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 4, 10, 32, 56, 4, 9, 56, 43);
		Integer secondSmallest = list.stream().distinct().sorted().skip(1).findFirst().orElse(null);
		System.out.println("Second smallest number is: " + secondSmallest);
		Integer secondLargest = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.orElse(null);
		System.out.println("Second largest number is: " + secondLargest);
	}

}
