package Scanner;

import java.util.Scanner;

public class TR_Scanner_8 {
    public static void main(String[] args) {
        /*
Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının toplamını bulmasını isteyin.

Örnek Çıktı:

Verilen tamsayının rakamları toplamı 10'dur.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen uc basamakli bir sayi giriniz");
        int sayi=scan.nextInt();

        int toplam=0;
        for (int i = 0; i < 3; i++) {
            toplam+= sayi%10;
            sayi/=10;
        }
        System.out.println("Verilen tamsayinin rakamlari toplami "+toplam+"\'dur");

    }
}
