package Scanner;

import java.util.Scanner;

public class TR_Scanner_1 {
    public static void main(String[] args) {

        /*
        Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        double sayi=scan.nextInt();

        System.out.println(sayi*sayi*sayi/2);

    }
}
