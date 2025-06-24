package projectUpload;

import java.util.Scanner;

public class arrayInput {
	
	public static void main(String []args) {

		int a[]=new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers to showcase in array Structure : ");

			for(int i=0;i<a.length;i++) {
				a[i]=sc.nextInt();
		}
			
			System.out.println("The Entered Numbers are : ");
			for(int i=0;i<a.length;i++) {
				System.out.println( a[i]);
		}
	}
}