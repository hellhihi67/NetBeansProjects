package btvn_buoi4;

import java.util.Scanner;

public class BTVN_buoi4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int A[] = new int[n];
        System.out.println("Nhap gia tri cho cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = sc.nextInt();
        }
        // kiểm tra mảng đảo ngược
        // dùng vòng lặp for duyệt i = 0 đến i < n / 2
        // nếu A[i] != A[n - i -1]
        // thì mảng đó không phải mảng đối xứng
        boolean kt = true;
        for (int i = 0; i < n / 2; i++) {
            if (A[i] != A[n - i - 1]) {
                kt = false;
                break;
            }
        }

        if (kt == true) {
            System.out.println("Mang mot chieu vua nhap khong la mang doi xung");
        } else {
            System.out.println("Mang mot chieu vua nhap la mang doi xung");
        }
    }
}
