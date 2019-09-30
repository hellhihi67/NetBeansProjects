package lss3;

import java.util.Scanner;

public class Lss3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[5];
//        for (int i = 0; i < 5; i++) {
//            System.out.println("nhap phan tu thu " + i);
//            arr[i] = sc.nextInt();
//
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println(arr[i]);

//        }
        System.out.println("nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("nhap cac phan tu cua mang: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("phan tu thu " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("cac phan tu cua mang: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
