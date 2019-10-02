package BTVN_buoi2;

import java.util.Scanner;

public class bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("so phan tu cua mang la: " + arr.length);
        for (int i = 0; i < 5; i++) {
            System.out.print("phan tu thu " + i + " la: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("day cac phan tu cua mang la: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + ", ");
        }

    }
}
