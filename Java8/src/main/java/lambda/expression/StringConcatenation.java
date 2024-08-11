//Write a Java program to implement a lambda expression to concatenate two strings.
package lambda.expression;

import java.util.function.BiFunction;

public class StringConcatenation {

	public static void main(String[] args) {
		BiFunction<String, String, String> concatenatedString = (str1, str2) -> {
			return str1.concat(str2);
		};
		System.out.println("Concatenated string is : " + concatenatedString.apply("Hello ", "Java8"));

	}

}
