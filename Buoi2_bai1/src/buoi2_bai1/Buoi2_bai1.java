package buoi2_bai1;

//nhap vao 1 stn, in ra man hinh moi so nguyen to nho hon stn do
import java.util.Scanner;

public class Buoi2_bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("so tu nhien la: ");
        int A = sc.nextInt();
        int count;

        if (A < 3) {
            System.out.println("khong co so nguyen to nao thoa man");
        } else {
            System.out.print("day so nguyen to thoa man la: ");
            for (int i = 2; i < A; i++) {       // i la so nguyen to
                count = 0;
                for (int j = 1; j <= i; j++) {  // j la uoc cua i
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.print(i + "; ");
                }
            }
        }

    }

}
