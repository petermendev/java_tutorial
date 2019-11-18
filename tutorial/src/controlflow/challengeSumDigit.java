package controlflow;

public class challengeSumDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumDigit(21));
	}
	
	public static int sumDigit(int number) {
		
		int sum=0;
		int stepInt=0;
		int remainder=number;
		
		if(remainder>=10) {
			
			while(remainder>0) {
				stepInt=remainder%10;
				System.out.println("Step is "+stepInt);
				sum+=stepInt;
				System.out.println("Sum is "+sum);
				remainder=remainder/10;
				System.out.println("Remainder is "+remainder);
			}
			
		}else {
			sum=-1;
		}
		
		
		return sum;
	}

}
