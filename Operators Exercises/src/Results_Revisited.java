
public class Results_Revisited {

	public static void main(String[] args) {
		scores(87,91,75);
		overallPercentage(87,91,75);
	}

	public static void scores(int physics, int chemistry, int biology) {
		System.out.println("The score for Physics was " + physics);
		System.out.println("The score for Chemistry was " + chemistry);
		System.out.println("The score for Biology was " + biology);
		int totalMark = physics + chemistry + biology;
		System.out.println("The total score was " + totalMark);
	}
	
	public static void overallPercentage(int physics, int chemistry, int biology) {
		double totalMark = physics + chemistry + biology;
		double percentage = (totalMark * 100) / 450;
		if(percentage > 60) {
			System.out.println("The overall percentage was " + percentage + " %");
			System.out.print("The exam was passed.");
		} else {
			System.out.println("The overall percentage was " + percentage + " %");
			System.out.print("The exam was failed.");
	
		}

	}
	
}
