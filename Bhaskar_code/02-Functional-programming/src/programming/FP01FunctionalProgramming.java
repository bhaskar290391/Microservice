package programming;

import java.util.List;

public class FP01FunctionalProgramming {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(25, 45, 89, 45, 68, 78, 96, 69, 36);
		// displayNumberInTheListByFunctinalProgramming(numbers);
		//displayEvenNumber(numbers);
		displaySquareofEvenNumber(numbers);
	}

	private static void displaySquareofEvenNumber(List<Integer> numbers) {
		numbers.stream().filter(number -> (number % 2 == 0))
		.map(number -> number * number)
		.forEach(System.out::println);
		
	}

	private static void displayEvenNumber(List<Integer> numbers) {

//		numbers.stream().filter(FP01FunctionalProgramming::isEven)
//		.forEach(System.out::println);

		numbers.stream().filter(number -> (number % 2 == 0)).forEach(System.out::println);

	}

	public static void print(int number) {
		System.out.println("The number is " + number);
	}

	public static boolean isEven(int number) {
		return (number % 2 == 0);
	}

	private static void displayNumberInTheListByFunctinalProgramming(List<Integer> numIntegers) {

		// numIntegers.stream().forEach(FP01FunctionalProgramming::print);
		numIntegers.stream().forEach(System.out::println);

	}

}
