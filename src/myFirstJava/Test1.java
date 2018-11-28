package myFirstJava;

import java.util.Scanner;

public class Test1 {

	public static void main (String args[]) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("no.of rows");
	
	int rows=sc.nextInt();
	
	System.out.println("pattern is here");
	
	for (int i=1; i <= rows; i++) {
		
		for(int j=1; j<=i; j++){
			
			System.out.print(j+" ");
		}
	System.out.println();
		}
		sc.close();
  
}
}
