// Write a Java program to calculate the average of a list of integers using streams.
package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Average {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		OptionalDouble avg = list.stream().mapToInt(Integer::intValue).average();

		System.out.println(avg.getAsDouble());

	}

}
