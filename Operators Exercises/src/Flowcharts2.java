
public class Flowcharts2 {

	public static void main(String[] args) {
		flowchart(4050);

	}

	public static void flowchart(int A) {
		if(A > 2000) {
			System.out.println("A");
			if(A>6000) {
				System.out.println("C");
			} else {
				System.out.println("B");
				if(A>4000) {
					System.out.println("D");
				} else {
					System.out.println("E");
				}
			}
						
		} else {
			System.out.println(1);
			if(A>100) {
				System.out.println(2);
			} else {
				System.out.println(3);
				if(A>600) {
					System.out.println(5);
				} else {
					System.out.print(4);
					if(A>5) {
						System.out.print(6);
					} else {
						System.out.print(7);
					}
				}
			}
		}
	
	}
	
	
	
}
