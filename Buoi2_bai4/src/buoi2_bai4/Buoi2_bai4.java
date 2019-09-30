package buoi2_bai4;

import java.util.Scanner;

public class Buoi2_bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap gia tri x = ");
        long x = sc.nextLong();
        System.out.print("nhap gia tri y = ");
        long y = sc.nextLong();
        int d = 0;
        long ketqua = x * y;
        System.out.println("mo phong phep nhan tay: ");
        System.out.printf("%30s\n", x);
        System.out.printf("%30s\n","x  " + y);
        System.out.println("--------------------------------");

        while (y > 0) {
            long r = y % 10;
            y = y / 10;
//System.out.println("phan du:" +r +"phan con lai:" +y);
            long multi = r * x;
            String space = "";
            for (int i = 0; i < d; i++) {
                space = space + " ";
            }
            d++;

            System.out.printf("%30s\n", multi + space);
        }
        System.out.println("--------------------------------");
        System.out.printf("%30s\n", ketqua);
    }

}
