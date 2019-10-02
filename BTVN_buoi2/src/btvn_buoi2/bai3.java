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
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    System.out.print(temp + ", ");
                }
            }
        }
        System.out.print("day so tang dan la: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
