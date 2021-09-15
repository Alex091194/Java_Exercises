
public class Calculator_Revisited {

	public static void main(String[] args) {
		//System.out.println(division(12,7));
		division(12,74);

	}

	public static void division(double int1, double int2) {
		if(int1 < int2) {
			double answer = int1 / int2;
			System.out.println("The answer is " + answer);
		} else {
			System.out.println("This operation cannot be performed");
			
		}
	}
	
}
