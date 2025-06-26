package twoarray;

import java.util.Arrays;

//7번 : 삽입정렬
public class insertionsort {
	public static void main(String[] args) {
		int[] number = {4,6,2,9,8};
		System.out.println("초기배열 : ");
		
		for(int num : number) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		for(int i=1; i<number.length; i++) {
			int key = number[i];
			int j=i-1;
			
			//key보다 큰 값을 오른쪽으로 이동
			while(j>=0 && number[j] > key){
				number[j+1] = number[j];
				j--;
			}
			number[j+1] = key;
			System.out.println(i + "단계 : " + Arrays.toString(number));
		}
		System.out.println("정렬왼료 : " + Arrays.toString(number));
	}
}
