package CodingTest;

import java.util.Scanner;

public class n_10430 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		System.out.println((a+b)%c);
		System.out.println((a%c)+(b%c));
		System.out.println((a*b)%c);
		System.out.println((a%c)*(b%c));
		
	}

}
