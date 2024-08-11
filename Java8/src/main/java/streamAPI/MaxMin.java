package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class MaxMin {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 3, 5, 21, 45, 2);
		Optional<Integer> max = numbers.stream().reduce((a, b) -> a > b ? a : b);
		if (max.isPresent()) {
			System.out.println("Max value is:" + max.get());
		} else {
			System.out.println("List is Empty");
		}
		OptionalInt mini = numbers.stream().mapToInt(Integer::intValue).min();
		System.out.println("Min value is:" + mini.getAsInt());
	}

}
