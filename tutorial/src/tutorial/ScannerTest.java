package tutorial;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String userName;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter username: ");
		
		
		
		if(scan.hasNext()) {
			userName=scan.nextLine();
		System.out.println("Username is "+userName);
		}else {
			System.out.println("No further input");
		}

	}

}
