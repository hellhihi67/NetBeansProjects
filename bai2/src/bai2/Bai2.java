package bai2;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap gia tri a= ");
        float a = scanner.nextFloat();
        System.out.print("nhap gia tri b= ");
        float b = scanner.nextFloat();
        System.out.print("nhap gia tri c= ");
        float c = scanner.nextFloat();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("phuong trinh co vo so nghiem");
                } else {
                    System.out.println("phuong trinh vo nghiem");
                }
            } else {
                System.out.println("phuong trinh co nghiem duy nhat: x= " + (-c / b));
            }
        }
        if (a != 0) {
//tinh delta
            float delta = b * b - 4 * a * c;
            float x1, x2;
//xet delta de tinh nghiem
            if (delta < 0) {
                System.out.println("phuong trinh vo nghiem");
            }
            if (delta > 0) {
                x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
                x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
                System.out.println("phuong trinh co hai nghiem la: x1= " + x1 + " va x2= " + x2);
            }
            if (delta == 0) {
                x1 = -b / (2 * a);
                System.out.println("phuong trinh co nghiem kep: x1=" + x1);
            }
        }
    }
}
