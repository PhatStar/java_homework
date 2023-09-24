package btap_tuan_java;

import java.util.Scanner;

public class Tuan1_Bai8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//----input---------------
		System.out.print("Nhập số lượng phần tử của mảng: ");
		int n = scanner.nextInt();

		int[] maAscii = new int[n];

		// Nhập các mã  ASCII từ bàn phím
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập mã ASCII thứ " + (i + 1) + ": ");
			maAscii[i] = scanner.nextInt();
		}

		// In mảng dưới dạng chữ và mã số nguyên trong bảng ASCII
		System.out.print("Mảng dưới dạng chữ: ");
		for (int i = 0; i < n; i++) {
			System.out.print((char) maAscii[i]);
		}
		System.out.println();

		System.out.print("Mảng dưới dạng số nguyên: ");
		for (int i = 0; i < n; i++) {
			System.out.print(maAscii[i] + " ");
		}
	}
}
