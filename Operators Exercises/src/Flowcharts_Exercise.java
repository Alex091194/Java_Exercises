
public class Flowcharts_Exercise {

	public static void main(String[] args) {
		int A = 100;
		boolean goAgain = true;
		
		while(goAgain) {
			System.out.println(A);
			A++;
			
			if(A>200) {
				goAgain = false;
			}
		}

	}

	
}
