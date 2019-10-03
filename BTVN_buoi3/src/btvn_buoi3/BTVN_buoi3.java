package btvn_buoi3;

import java.util.Scanner;

public class BTVN_buoi3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("phan tu thu " + i + " la: ");
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + arr[i];
        }
        System.out.println("sum = " + sum);
    }

}
