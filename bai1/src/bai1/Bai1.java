package bai1;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap gia tri cua a: ");
        float a = scanner.nextFloat();
        System.out.print("nhap gia tri cua b: ");
        float b = scanner.nextFloat();
        float ketqua;

        System.out.print("phep cong: ");
        ketqua = a + b;
        System.out.println(ketqua);

        System.out.print("phep tru: ");
        ketqua = a - b;
        System.out.println(ketqua);

        System.out.print("phep nhan: ");
        ketqua = a * b;
        System.out.println(ketqua);

        System.out.print("luy thua: ");
        ketqua = (float) Math.pow(a, b);
        System.out.println(ketqua);

        if (b == 0) {
            System.out.print("khong co thuong cua a/b vi b=0");
        } else {
            System.out.print("phep chia: ");
            ketqua = a / b;
            System.out.println(ketqua);         
        }
    }
}
