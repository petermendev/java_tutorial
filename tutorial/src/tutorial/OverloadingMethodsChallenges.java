package tutorial;

public class OverloadingMethodsChallenges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isCatPlaying(true,10));
		System.out.println(isCatPlaying(true,25));
		System.out.println(isCatPlaying(true,28));
		System.out.println(isCatPlaying(true,45));
		System.out.println(isCatPlaying(true,48));
		System.out.println(isCatPlaying(false,10));
		System.out.println(isCatPlaying(false,25));
		System.out.println(isCatPlaying(false,28));
		System.out.println(isCatPlaying(false,35));
		System.out.println(isCatPlaying(false,48));
	}
	
	public static boolean isCatPlaying(boolean summer, int temperature){
        
        boolean result=false;
        
        int lowTempLimit=25, highTempLimit=35;
        
        if (summer){
            highTempLimit=45;
        }
        
        if(lowTempLimit<=temperature && temperature<=highTempLimit) {
        	result=true;
        }else {
        	result=false;
        }
        
        return result;
        
    }

}
