package programming;

import java.util.List;

public class FP01Excercise {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(25, 45, 89, 45, 68, 78, 96, 69, 36);

		displayOddNumber(numbers);
		displayCubeOfOddNumber(numbers);

		List<String> data = List.of("Spring Boot", "Spring", "API", "Microservice", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");

		data.stream().forEach(System.out::println);

		System.out.println("\n");

		data.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);

		System.out.println("\n");

		data.stream().filter(course -> course.length() >=4).forEach(System.out::println);
		
		data.stream().map(course -> "Course--> " +course+"  "+course.length()).forEach(System.out::println);
	}

	private static void displayOddNumber(List<Integer> numbers) {
		numbers.stream().filter(number -> (number % 2 != 0)).forEach(System.out::println);
	}

	private static void displayCubeOfOddNumber(List<Integer> numbers) {
		numbers.stream().filter(number -> (number % 2 != 0))
		.map(number -> "The cube of "+number +" -->"+(number * number))
		.forEach(System.out::println);
	}
}
