package Scanner;

import java.util.Scanner;

public class TR_Scanner_9 {
    public static void main(String[] args) {
        /*
        Girilen zamanı saniyeye çeviren bir program yazınız.

Örnek Çıktı:

1 saat 10 dakika 50 saniye ==>

4250 saniye
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen saati giriniz");
        int saat=scan.nextInt();
        System.out.println("Lutfen dakikayi giriniz");
        int dakika=scan.nextInt();
        System.out.println("Lutfen saniyeyi giriniz");
        int saniye=scan.nextInt();

        System.out.println(saat*60*60+dakika*60+saniye);

    }
}
