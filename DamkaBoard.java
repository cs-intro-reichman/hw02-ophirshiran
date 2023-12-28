/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
	
		int n = Integer.parseInt(args[0]);

		for(int rows=0; rows<n; rows++){
			for(int lines=0; lines<n; lines++){
				
				if((rows%2==0)){
					System.out.print("* ");
				} 
				else{
					System.out.print(" *");
				}
			
			}
			System.out.println();
		}
	}
}
