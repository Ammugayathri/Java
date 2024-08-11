//Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams
package streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringSorting {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Katrina", "Anu", "Navya", "Venba", "Banu");
		List<String> asc = names.stream().sorted(Comparator.comparing(String::toString)).collect(Collectors.toList());
		System.out.println("Ascending order:" + asc);
		List<String> desc = names.stream().sorted(Comparator.comparing(String::toString).reversed())
				.collect(Collectors.toList());
		System.out.println("Descending Order:" + desc);

	}

}
