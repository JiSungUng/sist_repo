package CodingTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class N_10952 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		List<String> s = new ArrayList<>();
		
		int cnt=0;
		while(true) {
			int a = sc.nextInt();
			int b =sc.nextInt();
			String c=String.valueOf(a+b);
			s.add(c);
			cnt++;
			if(a==0 &&b==0) {
				break;
			}
		}
		for(int i=0; i<10;i++) {
			System.out.println(s.toString());
		}
	}

}
