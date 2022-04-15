package Scanner;

import java.util.Scanner;

public class TR_Scanner_3 {
    public static void main(String[] args) {
        /*
Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını ve
çevresini konsola yazdıran bir program yazın.

Örnek Çıktı:

Alan: 32

Çevre: 24
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin uzun kenarini giriniz");
        int uKenar=scan.nextInt();
        System.out.println("Lutfen dikdortgenin kisa kenarini giriniz");
        int kKenar=scan.nextInt();

        System.out.println("Alan: "+(uKenar*kKenar));
        System.out.println("Çevre: "+((2*uKenar)+(2*kKenar)));


    }
}
