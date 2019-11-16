package tutorial;



public class testPrintf {

	public static void main(String[] args) {
		
	int q=2;
	int a=0;
	int b=2;
	int n=10;

	int int_sum=0;
	int cycle_sum=0;

	
	for(int x=0;x<n;x++) {
	cycle_sum=(int) (a+(Math.pow(2,x))*b);
	int_sum=int_sum+cycle_sum;
	System.out.print(int_sum+" ");
	}
		
	}
	
}
