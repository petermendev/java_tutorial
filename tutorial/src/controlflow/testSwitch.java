package controlflow;

public class testSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=2;
		
		switch (x) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:case 4:case 5:
			System.out.println("3 or more");
			break;
		default:
			System.out.println("else");
			break;
		}
		
		System.out.println("Let's add some stuff");
		
	}

}
