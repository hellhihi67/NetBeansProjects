package lss2;

import java.util.Scanner;

public class Lss2 {
//    nhap vao k, in ra cac so chia het cho 2 va nho hon k

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("nhap gia tri cua k: ");
//        int k = sc.nextInt();
//        System.out.print("cac gia tri cua i<k va chia het cho 2 la: ");
//        for (int i = 0; i < k; i = i = i + 2) {
//            System.out.print(i + ", ");
//        }
////nhap vao 1 so va tim cac uoc va so luong uoc cua so do
        System.out.print("nhap gia tri cua x:");
        int x = sc.nextInt();
        int count = 0;
        System.out.print("cac uoc cua x la: ");
        for (int a = 1; a <= x; a++) {
            if (x % a == 0) {
                System.out.println(a + ", ");
                count++;
            }
        }
        System.out.println("so luong cac uoc la:" + count);
        if (count == 2) {
            System.out.println("x la so nguyen to");
        } else {
            System.out.println("x la hop so");
        }
    }

}
