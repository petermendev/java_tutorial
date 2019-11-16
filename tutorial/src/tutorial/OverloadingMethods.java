package tutorial;

public class OverloadingMethods {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(calcFeetAndInchesToCentimeters(5));
	System.out.println(calcFeetAndInchesToCentimeters(9));
	System.out.println(calcFeetAndInchesToCentimeters(12.5));
	System.out.println(calcFeetAndInchesToCentimeters(14));
	}

	
	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		
		double result=0;
		System.out.println(feet+" "+inches);
		
		if ((feet>=0)&&(inches>=0 && inches <=12)) {
			
		result=(feet*12*2.54)+(inches*2.54);	
			
		}else {
			result=-1;
		}
		
		return result;
		
	}
	
	public static double calcFeetAndInchesToCentimeters(double inches) {
		
		double result=0;
		double feet=0, remainingInches=0;
		
		if(inches>=0) {
		
		feet=(int)Math.floor(inches/12);
		remainingInches=inches%12;
		
		
		result=calcFeetAndInchesToCentimeters(feet, remainingInches);
		
		}else {
			result=-1;
		}
		
		return result;
		
	}
}
