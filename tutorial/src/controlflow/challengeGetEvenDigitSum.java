package controlflow;

public class challengeGetEvenDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getEvenDigitSum(135));
		System.out.println(getEvenDigitSum(0));
		System.out.println(getEvenDigitSum(-126));
		System.out.println(getEvenDigitSum(126));
		System.out.println(getEvenDigitSum(1234567890));
	}

	
	public static int getEvenDigitSum(int number) {
		
		int sum=0;
		int remainder=number;
		int stepInt=0;
		
		if(remainder>=0) {
			
			do {
				
				stepInt=remainder%10;
				remainder=remainder/10;
				if(stepInt%2==0) {
					sum=sum+stepInt;
				}
				
			}while(remainder>0);
			
		}else {
			sum=-1;
		}
		
		return sum;
		
	}
}
