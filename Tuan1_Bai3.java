package btap_tuan_java;

import java.util.Scanner;
public class Tuan1_Bai3 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			//---Nhap mang
			int n = sc.nextInt();
			int arr[] = new int[n];
			//----Xuat mang
			for(int i = 0; i < n ; i++)
			{
				 arr[i] = sc.nextInt();
			}
			//Tim phan tu lon nhat trong mang
			int maxValue = arr[0];
			int maxN = 0;
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] > maxValue)
				{
					maxN = i;
				}
			}
			System.out.println("Phan tu lon nhat trong mang : " + maxN  );
		}
		
	}
}
