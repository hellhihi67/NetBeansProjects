package javaapplication4;

import java.util.Scanner;

public class JavaApplication4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        giai phuong trinh ax +b =0
        System.out.print("nhap gia tri a = ");
        float a = scanner.nextFloat();
        System.out.print("nhap gia tri b = ");
        int b = scanner.nextInt();
        float ketqua = (-b) / a;
        if (a == 0) {
            if (b == 0) {
                System.out.println("phuong trinh co vo so nghiem");
            } else {
                System.out.println("phuong trinh vo nghiem");
            }
        } else {
            System.out.println("nghiem cua phuong trinh la: x = " + ketqua);
        }
    }

}
