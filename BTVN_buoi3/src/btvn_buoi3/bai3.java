package btvn_buoi3;

import java.util.Scanner;

public class bai3 {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma tran bac n : ");
        n = sc.nextInt();
        int arr[][] = new int[n][n];
        int count = 0;
        System.out.println("Nhap cac phan tu cho ma tran : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                arr[i][j] = sc.nextInt();
            }
        }
//        in ra ma tran
        System.out.println("Ma tran vua nhap: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }

//Duong cheo khi chi so A[i] = A[j] 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    count += arr[i][j];
                }
            }
        }
        System.out.println("Tong duong cheo chinh can tim la : " + count);
    }

}
