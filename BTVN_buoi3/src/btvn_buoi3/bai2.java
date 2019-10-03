package btvn_buoi3;

import java.util.Scanner;

public class bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("so phan tu cua mang la: ");
        int n = sc.nextInt();
        int[] arr = new int[3];
        for (int i = 0; i < n; i++) {
            System.out.print("phan tu thu " + i + " la: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("phan tu o vi tri chan la: ");
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i] + "; ");
            }
        }
        
        System.out.print("phan tu o vi tri le la: ");
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                System.out.print(arr[i] + "; ");
            }
        }
        
        System.out.print("phan tu chia 5 du 1 la: ");
        for (int i = 0; i < n; i++) {
            if (i % 5 == 1) {
                System.out.print(arr[i] + "; ");
            }
        }
        
        int sum = 0;
        System.out.println("sum = " + sum);
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum = sum + arr[i];
            }
        }

    }

}
