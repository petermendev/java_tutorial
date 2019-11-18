package controlflow;



public class challengePalindromeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(1));
		System.out.println(isPalindrome(0));
		System.out.println(isPalindrome(-100));
		System.out.println(isPalindrome(101));
		System.out.println(isPalindrome(1501));
	}

	public static boolean isPalindrome(int number) {
		
		boolean result=false;
		int origNum=number, tempNum=number;
		int stepInt=0;
		int newNum=0;
		
		do {
			newNum*=10;
			stepInt=tempNum%10;
			tempNum/=10;
			newNum+=stepInt;
			
		}while(Math.abs(tempNum)>0);
		
		if(origNum==newNum) {
			result=true;
		}else {
			result=false;
		}
		
		return result;
	}
}
