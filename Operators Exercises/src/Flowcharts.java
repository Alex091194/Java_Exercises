
public class Flowcharts {

	public static void main(String[] args) {
		inputs(4,9,false);

	}

	public static void inputs(int int1, int int2, boolean bool) {
		if(bool == true) {
			int sum = int1 + int2;
			System.out.println(sum);
		} else {
			int product = int1 * int2;
			System.out.println(product);
		}
	}
	
}
