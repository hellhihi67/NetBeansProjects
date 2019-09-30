package buoi2_bai2;

import java.util.Scanner;

public class Buoi2_bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("hai so nguyen duong ban dau la:" + " ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int tramb = b / 100;
        int chucb = b % 100 / 10;
        int dvib = b % 10;      
        System.out.println("mo phong phep nhan tay:");
        System.out.println("     " + a);
        System.out.println("    x");
        System.out.println("     " + b);
        System.out.println("------------");
        System.out.println("    " + a * dvib);
        System.out.println("   " + a * chucb);
        System.out.println("  " + a * tramb);
        System.out.println("------------");
        System.out.println("  " + a * b);
    }

}
