/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {	
		int random=(int)(Math.random()*10);
		int nextRandom=random;
		while(nextRandom>=random){
			System.out.print(nextRandom + " ");
			random=nextRandom;
			nextRandom=(int)(Math.random()*10);

		}

	}
}
		