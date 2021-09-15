
public class Blackjack {

	public static void main(String[] args) {
		inputs(15,17);
		System.out.println(inputs(15,17));

	}

	
	public static int inputs(int player1, int player2) {
		if(player1 > 21 && player2 > 21) {
			return 0;
		} else if(player1 >21) {
			return player2;
		} else if(player2 >21) {
			return player1;
		} else if(player1>player2) {
			return player1;
		} else if(player2>player1) {
			return player2;
		} else {
			return 999;
		}
		
	}
	
	
	
}
