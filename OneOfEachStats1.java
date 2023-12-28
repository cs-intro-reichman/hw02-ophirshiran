/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		boolean girl= false;
		boolean boy= false;
		int childrenSum=0;
		int childrenPerFam=0;
		int two=0;
		int three=0;
		int four=0;
		for(int t=0; t < T; t++){
				while (girl==false || boy==false){
					double rnd=Math.random();
					if (rnd<0.5){
						girl=true;	
					}
					else{
						boy=true;
					}
					childrenPerFam++;
					childrenSum++;
				}
			if(childrenPerFam==2){
				two++;
			} 
				else if(childrenPerFam==3){
					three++;
				}
					else if(childrenPerFam>=4){
						four++;
					}
		childrenPerFam=0;
		girl= false;
		boy= false;
		}
		double avg=((double)childrenSum/T);
		System.out.println("Average: "+avg+" children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: "+two);
		System.out.println("Number of families with 3 children: "+three);
		System.out.println("Number of families with 4 or more children: "+four);
		
		if((two>three)&&(two>four)){
			System.out.println("The most common number of children is 2.");
		}
		else if((three>four)&&(three>two)){
			System.out.println("The most common number of children is 3.");
		}
		else if((four>three)&&(four>two)){
			System.out.println("The most common number of children is 4 or more.");
		}


	}
}
