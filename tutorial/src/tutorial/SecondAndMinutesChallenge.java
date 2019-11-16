package tutorial;

public class SecondAndMinutesChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getDurationString(-1));
		System.out.println(getDurationString(0));
		System.out.println(getDurationString(59));
		System.out.println(getDurationString(60));
		System.out.println(getDurationString(115));
		System.out.println(getDurationString(122));
		System.out.println(getDurationString(3725));
	}
	
	public static String getDurationString(int minutes, int seconds) {
		
		String result="", strHours="",strMinutes="",strSeconds="";
		int totalSeconds=0, resHours=0,resMinutes=0,resSeconds=0;
		
		if((minutes>=0)&&(seconds>=0 && seconds <=59)) {
			totalSeconds=(minutes*60)+seconds;
			resHours=(int)totalSeconds/3600;
			resMinutes=(totalSeconds%3600)/60;
			resSeconds=((totalSeconds%3600)%60);
			
			if(resHours<10) { strHours="0"+Integer.toString(resHours);}else {strHours=Integer.toString(resHours);}
			if(resMinutes<10) { strMinutes="0"+Integer.toString(resMinutes);}else {strMinutes=Integer.toString(resMinutes);}
			if(resSeconds<10) { strSeconds="0"+Integer.toString(resSeconds);}else {strSeconds=Integer.toString(resSeconds);}
			
			result=strHours+" Hours, "+resMinutes+" Minutes, "+resSeconds+" Seconds;";
		}else {
			result="Invalid value";
		}
		
		return result;
	}

	
	public static String getDurationString(int seconds) {
		
		String result="";
		int resMinutes=0,resSeconds=0;
		
		if(seconds>=0) {
			
			resMinutes=seconds/60;
			resSeconds=seconds%60;
			result=getDurationString(resMinutes,resSeconds);
			
		}else {
			result="Invalud value";
		}
		
		return result;
	}
}
