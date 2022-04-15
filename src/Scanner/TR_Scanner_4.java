package Scanner;

import java.util.Scanner;

public class TR_Scanner_4 {
    public static void main(String[] args) {
        /*
Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.

1 şeker = 1.7 gr

Örnek Çıktı:

Yılda 12.41 kg şeker kullanıyor.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Gunde kac bardak cay iciyorsun");
        int cay=scan.nextInt();
        System.out.println("Ne kadar seker kullaniyordun");
        double seker=scan.nextInt();

        System.out.println("Yılda "+(cay*seker*1.7*365/100)+" kg şeker kullanılıyor");

    }
}
