package day0103;

import java.util.Scanner;
public class arrayscanScore_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*먼저 인원수를 입력후 이름, 점수 등을 입력후 출력해 보기.
		 * 전체 합계와 평균*/
		
		
		int people;
		String []name;
		int [] score;
		int tot= 0 ;
		double avg =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("원원수를 입력하시오.");
		//다음번에 문자 막이러면 버퍼가 걸림. 따라서 형변환을 해주어야함.
		people =Integer.parseInt(sc.nextLine());
		
		//인원수 만큼 배열 할당.
		name = new String[people];
		score = new int[people];
		
		for(int i=0;i<people; i++) {
			System.out.println("이름을 입력하세요");
			name[i]=sc.nextLine();
			System.out.println("점수를 입력하세요.");
			score[i]=Integer.parseInt(sc.nextLine());
			
			tot+=score[i];
		}
		avg= (double)tot/people;
		
		//인원수만큼 데이타 입력.
		System.out.println("번호   이름   점수");
		
		for(int i=0; i<people; i++) {
			
			System.out.println(i+1+"    "+name[i]+"   "+score[i]);
		}
		
		
		System.out.println("점수 총합 :" + tot);
		System.out.println("점수 평균 :" + avg);
		
		
		
	}

}
