package day0103;

public class OrderChangeArray_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {5,7,9,13,56,4,77,88,99,11};
		System.out.println("원 데이터 출력");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.println("데이터 거꾸로 변경하기");
		
		for(int i=0; i<arr.length/2;i++) {
			
			int temp = arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
			
			
		}
		
		for(int i =0 ;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
		
		
		
	}

}
