/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int i=1;
		int lines=0;
		boolean space=false;
		while((n>i)&&(n>lines)){
			System.out.print("* ");
			i++;
			if(n==i){
				System.out.println("*");
				i=1;
				lines++;
					if(space!=true){
						System.out.print(" ");
						space=true;
					}
					else{
						space=false;
					}
			}
		}
	}
}
