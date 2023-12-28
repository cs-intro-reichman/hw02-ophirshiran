/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String index= args[0];
		int n=index.length()-1;
		char middle= index.charAt(n/2);
		while(n>=0){
			System.out.print(index.charAt(n));
			n=n-1;
		}
		System.out.println();
		System.out.print("The middle character is "+middle);
	}
}

//another option with for loop 
//Q: a string without spaces? 

//public class Reverse {
//	public static void main (String[] args){
//		String index= args[0];		
//		for(int n=index.length()-1;n>=0;n=n-1){
//			System.out.print(index.charAt(n));
//		}
//		int n=index.length()-1;
//		char middle= index.charAt(n/2);
//		System.out.println();
//		System.out.print("The middle character is "+middle);
//	}
//}

