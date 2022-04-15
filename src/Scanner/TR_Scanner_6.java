package Scanner;

import java.util.Scanner;

public class TR_Scanner_6 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir Float değer girmesini isteyin,
        bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Float bir deger girin");
        float deger= scan.nextFloat();

        short sayi= (short) deger;
        System.out.println(sayi);


    }
}
