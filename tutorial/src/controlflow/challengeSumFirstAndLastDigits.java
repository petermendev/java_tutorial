package controlflow;

public class challengeSumFirstAndLastDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumFirstAndLastDigit(1578));
	}

	public static int sumFirstAndLastDigit(int number) {
		
		int sum=0;
		int tempNum=number;
		int firstNum=0, lastNum=0;
		
		if(tempNum>=0) {
			
			firstNum=tempNum%10;
			
			do {
				lastNum=tempNum%10;
				tempNum=tempNum/10;
			}while(tempNum>0);
			
			sum=firstNum+lastNum;
			
		}else {
			sum=-1;
		}
		
		return sum;
	}
	
}
