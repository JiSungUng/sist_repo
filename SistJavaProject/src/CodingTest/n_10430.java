package CodingTest;

import java.util.Scanner;

public class n_10430 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A,B,C;
		A=sc.nextInt();
		B=sc.nextInt();
		C=sc.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C)+(B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C)*(B%C))%C);
		
	}

}
