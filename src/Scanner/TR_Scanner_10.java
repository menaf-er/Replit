package Scanner;

import java.util.Scanner;

public class TR_Scanner_10 {
    public static void main(String[] args) {
        /*
Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.

INPUT:

Dakika sayısı: 3456789

OUTPUT :

3456789 dakika yaklaşık 6 yıl 210 gündür
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Dakika sayisini girin");
        long dakika=scan.nextLong();

        System.out.print(dakika+" dakika yaklaşık "+(dakika/1440/365)+" yıl ");
        dakika= dakika/1440;
        System.out.print(dakika%365+" gündür");
    }
}
