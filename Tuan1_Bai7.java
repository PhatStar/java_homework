package btap_tuan_java;

public class Tuan1_Bai7 {
    public static void main(String[] args) {
        // Khởi tạo mảng có 10 phần tử
        int[] mangSoNguyen = {10, 5, 7, 2, 8, 1, 6, 9, 3, 4};

        // Sắp xếp mảng tăng dần theo selection sort
        for (int i = 0; i < mangSoNguyen.length - 1; i++) {
            for (int j = i + 1; j < mangSoNguyen.length; j++) {
                if (mangSoNguyen[i] > mangSoNguyen[j]) {
                    // Hoán đổi giá trị của hai phần tử nếu cần thiết
                    int temp = mangSoNguyen[i];
                    mangSoNguyen[i] = mangSoNguyen[j];
                    mangSoNguyen[j] = temp;
                }
            }
        }

        // In mảng tăng dần
        System.out.print("Mang tang dan: ");
        for (int i = 0; i < mangSoNguyen.length; i++) {
            System.out.print(mangSoNguyen[i] + " ");
        }
    }

}
