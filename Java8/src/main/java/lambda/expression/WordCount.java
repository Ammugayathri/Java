//Write a Java program to implement a lambda expression to count words in a sentence.
package lambda.expression;

import java.util.function.Function;

public class WordCount {

	public static void main(String[] args) {
		String str = "Hi Everyone Welcome to Java8";
		Function<String, Integer> count = (str1) -> str1.split(" ").length;
		System.out.println("Words count is :" + count.apply(str));

	}

}
