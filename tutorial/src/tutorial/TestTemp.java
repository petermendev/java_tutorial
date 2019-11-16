package tutorial;

import java.util.Scanner;

public class TestTemp {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		String i;
		
		
		i=scan.nextLine();
		
		

		if(!i.equals(null)) {
			System.out.println(i);
		}else {
			System.out.println("Reached EOF");
		}
		
		scan.close();

	}

}

/*
 * 
 * Given an integer, , perform the following conditional actions:
 * 
 * If is odd, print Weird If is even and in the inclusive range of to , print
 * Not Weird If is even and in the inclusive range of to , print Weird If is
 * even and greater than , print Not Weird
 * 
 */