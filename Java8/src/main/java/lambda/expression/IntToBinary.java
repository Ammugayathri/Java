//Write a Java program to implement a lambda expression to convert an integer to their corresponding binary representation.
package lambda.expression;

import java.util.function.Function;

public class IntToBinary {

	public static void main(String[] args) {
		int number = 2;
		Function<Integer, String> convertToBinary = (num) -> Integer.toBinaryString(num);
		System.out.println("Binary Representation of " + number + " is:" + convertToBinary.apply(number));

	}

}
