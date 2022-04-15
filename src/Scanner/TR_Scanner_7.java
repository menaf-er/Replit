package Scanner;

import java.util.Scanner;

public class TR_Scanner_7 {
    public static void main(String[] args) {
        /*/
        Kullanıcı tarafından girilen DOUBLE sayıyı tam sayıya çeviren bir program yazınız.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Double sayi giriniz");
        double sayi= scan.nextDouble();

        int tamSayi= (int) sayi;

        System.out.println(sayi);
        System.out.println(tamSayi);
    }
}
