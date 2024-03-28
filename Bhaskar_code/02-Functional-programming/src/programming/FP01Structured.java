package programming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
	

		List<Integer> numbers = List.of(25,45,89,45,68,78,96,69,36);
		//displayNumberInTheList(numbers);
		diplayEvenNumber(numbers);
			
	}

	private static void diplayEvenNumber(List<Integer> numbers) {
		
		for (Integer number : numbers) {
			if(number % 2 ==0) {
			System.out.println("The number is "+ number);
			}
		}
	}

	private static void displayNumberInTheList(List<Integer> numbers) {
		
		for (Integer number : numbers) {
			System.out.println("The number is "+ number);
		}
	}

}
