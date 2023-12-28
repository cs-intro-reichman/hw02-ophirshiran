/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int number = Integer.parseInt(args[0]);
		int i=2;
		int sum=1; 
		String perfect=number+" is a perfect number since "+number+" = 1";
		while(number>i){
			if(number%i==0){
				perfect+=" + "+i;
				sum=sum+i;
			}
			i++;
		}
		if(sum==number){
			System.out.println(perfect);
		}
		else{
			System.out.println(number+" is not a perfect number");
		}
	}
}
