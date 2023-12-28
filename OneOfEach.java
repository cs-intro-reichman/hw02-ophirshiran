
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean girl= false;
		boolean boy= false;
		int children=0;
		while (girl==false || boy==false){
			if (Math.random()<0.5){
				girl=true;
				System.out.print("g ");
			}
			else{
				boy=true;
				System.out.print("b ");
			}
			children++;
		}
		System.out.println();
		System.out.print("You made it... and now you have " + children + " children.");
	}
}
