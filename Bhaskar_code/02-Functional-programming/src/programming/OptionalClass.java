package programming;

import java.util.List;
import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {

		List<String> data=List.of("Bhaksar","Maddy","Kanishk");
		
		Optional<String> first = data.stream().filter(datas-> datas.startsWith("K")).findFirst();
		
		System.out.println(first);
		System.out.println(first.isEmpty());
		System.out.println(first.isPresent());
		System.out.println(first.get());
	}
}
