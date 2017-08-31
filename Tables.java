import java.util.Scanner;
public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner s = new Scanner(System.in);
	
		System.out.println("Enter below a Value from 1 to 100");
		int x = s.nextInt();
	
		
		if (x<100){
		System.out.println("Table of "+x); 
		int y = 1;

	    while (y <= 10) {
	    System.out.println(x + " X " +y+ " = " +(y*x));
		y++;
	}
	} else {
		 System.out.println("Value you entered is "+ x +" that's not in our scope");
		
	}
	}	
	}