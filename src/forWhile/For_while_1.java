package forWhile;

import java.util.Scanner;

public class For_while_1 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
        ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.

        char ch1= 'a' ;
        String name =“John came late"
	    Expected Output:
        Number of a = 2
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz");
        String name=scan.nextLine();

        System.out.println("Lutfen aramak istediginiz karakteri giriniz");
        char ch1=scan.next().charAt(0);

        String[] harfler = name.split("");

        String harf=String.valueOf(ch1);

        int sayac=0;
        for (int i = 0; i < harfler.length; i++) {
            if (harfler[i].equals(harf)){
                sayac++;
            }
        }
        System.out.println("Number of "+harf+" = "+sayac);


    }
}
