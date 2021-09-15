import java.util.ArrayList;
import java.util.List;

public class Exercises {

	public static void main(String[] args) {
		List<String> cities = new ArrayList<>();
		
		cities.add("Manchester");
		cities.add("London");
		cities.add("Liverpool");
		cities.add("Birmingham");
		
		System.out.println(cities);
		
		for (int i = 0; i < cities.size(); i++) {
			System.out.println(cities.get(i));
		}

		System.out.println(cities.get(1));
		
		cities.set(2,"Leeds");
		System.out.println(cities);
		
		cities.remove(3);
		System.out.print(cities);
		
	}

}
