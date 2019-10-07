package lss5;

import java.util.Scanner;

public class Lss5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "Nguyen Duc Thien";
        int mssv = 20168806;
//        thien.nd168806@is.hust.edu.vn
// get thien
        int indexOfSpace = s.lastIndexOf(' ');
        String ten = s.substring(indexOfSpace + 1);

//get N
        String viettatho = String.valueOf(s.charAt(0));
//get D
        int indexOfFirstSpace = s.indexOf(' ');
        String viettatdem = String.valueOf(s.charAt(indexOfFirstSpace + 1));
//get mssvrg
        String mssvrg = String.valueOf(mssv % 1000000);
        String emailsv = ten + "." + viettatho + viettatdem + mssvrg + "@sis.hust.edu.vn";
        System.out.println(emailsv.toLowerCase());
// in ra 1 mang doi xung
        String input = "abcxyz";
        char[] try1 = input.toCharArray();
        for (int i = try1.length - 1; i >= 0; i--) {
            System.out.print(try1[i]);
        }

    }

}
