package tranactArray;

import java.util.Scanner;

	public class transactArr {
		
		
		public static void main(String[] args) {
		int size = 0;
		int[] arr = {};
		int m = 0;
		int target1 = 0;
		boolean flag = false;
		int sum = 0;
		int j = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		size = s.nextInt();
		arr = new int[size];
		System.out.println("Enter the amount of transactions");
		for (int i = 0; i<size;i++){
			arr[i] = s.nextInt();
			}
		System.out.println("Enter the number of targets");
		m = s.nextInt();
		for (int i=0; i<m;i++) {
			System.out.println("Enter target value");
			target1 = s.nextInt();
			for (j = 0; j<size; j++) {
				sum = sum + arr[j];
				if(sum >= target1) {
					flag = true;
					break;
				}
			}
			if (flag) { 
				System.out.println("target achieved at " + (j+1));
			sum=0;
			}
			else {
			System.out.println("target not achieved");
			sum=0;}
			}
		s.close();
		}
	}